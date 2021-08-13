package services;

import java.sql.*;
//import java.util.Date;

import models.User;

public class Services {
	Connection con;
	static String url = "jdbc:mysql://localhost:3306/mydb";
	static String uname = "root";
	static String password = "root";
	
	Services() throws SQLException{
		con = DriverManager.getConnection(url,uname,password);
	}
	
	boolean emailExists(String email) throws SQLException {
		String query = "select email from user where email='" + email + "'";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		st.close();
		return rs.next();
	}
	
	boolean phoneNumberExists(String phone) throws SQLException {
		String query = "select phone from user where phone='" + phone + "'";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		st.close();
		return rs.next();
	}
	
	boolean userExists(String id) throws SQLException {
		String query = "select id from user where id='" + id + "'";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		st.close();
		return rs.next();
	}
	
	Authentication authenticateUser(String email, String password) throws SQLException {
		String query = "select * from user where email='" + email + "'";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		
		Authentication auth = new Authentication(false, null);
		
		if(!password.equals(rs.getString("password"))) {
			return auth;
		}
		
		User user = new User();
		
		user.setId(rs.getInt("id"));
		user.setFirst_name(rs.getString("first_name"));
		user.setLast_name(rs.getString("last_name"));
		user.setEmail(rs.getString("email"));
		user.setPhone(rs.getString("phone"));
		user.setCity(rs.getString("city"));
		user.setAge(rs.getInt("age"));
		user.setCountry(rs.getString("country"));
		user.setPassword(rs.getString("password"));
		user.setCreated_at(rs.getDate("created_at"));
		user.setUpdated_at(rs.getDate("updated_at"));
		user.setUser_type(rs.getInt("user_type"));
		user.setTotal_income(rs.getFloat("total_income"));
		user.setTotal_expense(rs.getFloat("total_expense"));
		user.setTotal_balance(rs.getFloat("total_balance"));
		
		auth.setUser(user);
		auth.setAuthenticated(true);
		
		return auth;
	}
	
	boolean login(String email, String password) throws SQLException {
		String query = "select password from user where email='" + email + "'";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		if(!rs.next()) {
			return false;
		}
		
		String userPassword = rs.getString(1);
		st.close();
		
		return userPassword.equals(password);
	}
	
	boolean signup(User user) throws SQLException {
		if(emailExists(user.getEmail())) {
			return false;
		}
		PreparedStatement st = con.prepareStatement("insert into user(first_name, last_name, email, phone, city, age, country, password, created_at, updated_at, user_type_id, total_income, total_expense, total_balance) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		st.setString(1, user.getFirst_name());
		st.setString(2, user.getLast_name());
		st.setString(3, user.getEmail());
		st.setString(4, user.getPhone());
		st.setString(5, user.getCity());
		st.setInt(6, user.getAge());
		st.setString(7, user.getCountry());
		st.setString(8, user.getPassword());
		st.setDate(9, new Date(System.currentTimeMillis()));
		st.setDate(10, new Date(System.currentTimeMillis()));
		st.setInt(11, user.getUser_type());
		st.setFloat(12, user.getTotal_income());
		st.setFloat(13, user.getTotal_expense());
		st.setFloat(14, user.getTotal_balance());
		
		st.executeUpdate();
		
		st.close();
		return true;
	}
	
	User getUser(String email) throws SQLException {
		if(!emailExists(email)) {
			return null;
		}
		String query = "select * from user where email='" + email + "'";
		Statement st = con.createStatement();
		User user = new User();
		
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		user.setId(rs.getInt("id"));
		user.setFirst_name(rs.getString("first_name"));
		user.setLast_name(rs.getString("last_name"));
		user.setEmail(rs.getString("email"));
		user.setPhone(rs.getString("phone"));
		user.setCity(rs.getString("city"));
		user.setAge(rs.getInt("age"));
		user.setCountry(rs.getString("country"));
		user.setPassword(rs.getString("password"));
		user.setCreated_at(rs.getDate("created_at"));
		user.setUpdated_at(rs.getDate("updated_at"));
		user.setUser_type(rs.getInt("user_type_id"));
		user.setTotal_income(rs.getFloat("total_income"));
		user.setTotal_expense(rs.getFloat("total_expense"));
		user.setTotal_balance(rs.getFloat("total_balance"));
		
		return user;
	}
	
	boolean delete(String email) throws SQLException
	{
		if(!emailExists(email)) {
			return false;
		}
		String query = "delete from user where email='" + email + "'";
		Statement stmt = con.createStatement();
		int res = stmt.executeUpdate(query);
		if(res==0)
				return false;
		else
			return true;
		
	}
	
}
