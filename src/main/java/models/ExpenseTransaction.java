package models;

import java.sql.Date;

<<<<<<< Updated upstream
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;
=======

public class ExpenseTransaction 
{
>>>>>>> Stashed changes

@Entity
@Table(name="expense_transaction")
public class ExpenseTransaction<ExpenseCategory> 
{
	@Id
	private int id;
	private String transaction_category;
	private float amount;
	private String note;
	private Date created_at;
	private Date updated_at;
	@OneToOne
	@JoinColumn(name = "user_id")
	@RestResource(path = "user_id", rel="user_id")
	private User user;
	@OneToOne
	@JoinColumn(name = "expense_category_id")
	@RestResource(path = "expense_category_id", rel="expense_category_id")
	private ExpenseCategory expense_category;
	
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ExpenseCategory getExpense_category() {
		return expense_category;
	}
	public void setExpense_category(ExpenseCategory expense_category) {
		this.expense_category = expense_category;
	}
	
	
}
