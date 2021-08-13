package models;
import java.util.Date;

public class User {
	 
	
		private int id;
		private String first_name;
		private String last_name;
		private String email;
		private String phone;
		private String City;
		private int age;
		private String country;
		private String password;
		private Date created_at;
		private Date updated_at;
		private int user_type;
		private float total_income;
		private float total_expense;
		private float total_balance;
		public UserType ut;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Date getCreated_at() {
			return created_at;
		}
		public void setCreated_at(Date created_at) {
			this.created_at = created_at;
		}
		public Date getUpdated_at() {
			return updated_at;
		}
		public void setUpdated_at(Date updated_at) {
			this.updated_at = updated_at;
		}
		public int getUser_type() {
			return user_type;
		}
		public void setUser_type(int user_type) {
			this.user_type = user_type;
		}
		public float getTotal_income() {
			return total_income;
		}
		public void setTotal_income(float total_income) {
			this.total_income = total_income;
		}
		public float getTotal_expense() {
			return total_expense;
		}
		public void setTotal_expense(float total_expense) {
			this.total_expense = total_expense;
		}
		public float getTotal_balance() {
			return total_balance;
		}
		public void setTotal_balance(float total_balance) {
			this.total_balance = total_balance;
		}
		
		
}