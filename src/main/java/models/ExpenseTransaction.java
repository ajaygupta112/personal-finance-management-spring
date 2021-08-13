package models;

import java.sql.Date;

public class ExpenseTransaction 
{

	private int id;
	private String transaction_category;
	private float amount;
	private String text;
	private Date created_at;
	private Date updated_at;
	private  int user_id;
	private int expense_category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTransaction_category() {
		return transaction_category;
	}
	public void setTransaction_category(String transaction_category) {
		this.transaction_category = transaction_category;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
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
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getExpense_category() {
		return expense_category;
	}
	public void setExpense_category(int expense_category) {
		this.expense_category = expense_category;
	}
}
