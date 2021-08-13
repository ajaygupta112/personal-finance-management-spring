package models;

import java.sql.Date;

public class IncomeTransaction 
{
	private int id;
	private String Transaction_Category;
	private float amount;
	private String text;
	private Date created_at;
	private Date updated_at;
	private  int user_id;
	private int income_category;
	public IncomeCategory ic;

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

	public String getText() 
	{
		return text;
	}

	public void setText(String text) 
	{
		this.text = text;
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
	
	public int getUser_id() 
	{
		return user_id;
	}
	
	public void setUser_id(int user_id) 
	{
		this.user_id = user_id;
	}
	
	public int getIncome_category() 
	{
		return income_category;
	}
	
	public void setIncome_category(int income_category) 
	{
		this.income_category = income_category;
	}
		
}
