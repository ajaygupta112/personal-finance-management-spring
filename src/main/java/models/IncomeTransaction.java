package models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Table(name="income_transaction")
public class IncomeTransaction 
{
	@Id
	private int id;
	private String Transaction_Category;
	private float amount;
	private String note;
	private Date created_at;
	private Date updated_at;
	@OneToOne
	@JoinColumn(name = "user_id")
	@RestResource(path = "user_id", rel="user_id")
	private  User user;
	@OneToOne
	@JoinColumn(name = "income_category_id")
	@RestResource(path = "income_category_id", rel="income_category_id")
	private IncomeCategory income_category;

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getTransaction_Category() 
	{
		return Transaction_Category;
	}

	public void setTransaction_Category(String transaction_Category) 
	{
		Transaction_Category = transaction_Category;
	}

	public float getAmount() 
	{
		return amount;
	}

	public void setAmount(float amount) 
	{
		this.amount = amount;
	}

	public String getNote() 
	{
		return note;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public IncomeCategory getIncome_category() {
		return income_category;
	}

	public void setIncome_category(IncomeCategory income_category) {
		this.income_category = income_category;
	}

	public void setNote(String note) 
	{
		this.note = note;
	}

	public Date getCreated_at() 
	{
		return created_at;
	}

	public void setCreated_at(Date created_at) 
	{
		this.created_at = created_at;
	}

	public Date getUpdated_at() 
	{
		return updated_at;
	}
	
	public void setUpdated_at(Date updated_at) 
	{
		this.updated_at = updated_at;
	}
	
	
}
