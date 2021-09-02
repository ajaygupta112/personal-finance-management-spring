package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import models.ExpenseTransaction;
import repositories.ExpenseTransactionRepository;

public class ExpenseTransactionService {
	@Autowired
	private ExpenseTransactionRepository etr;
	
	public List<ExpenseTransaction> getAllExpenseTransaction(){
		List<ExpenseTransaction> expenseList=new ArrayList<>();
		etr.findAll()
		.forEach(expenseList::add);
		return expenseList;	
	}
	public 	ExpenseTransaction getExpenseTransactionById(int id)
	{
		return etr.findById(id).orElse(null);
	}
	public void addExpenseTransaction(ExpenseTransaction expTrans)
	{
		ExpenseTransaction t = etr.save(expTrans);
	}
	public void updateExpenseTransaction(ExpenseTransaction expTrans)
	{
		etr.save(expTrans);
	}
	/*public void addAllTopic(List<IncomeTransaction> incTrans)
	{
		itr.saveAll(incTrans);
	}*/
	public void deleteExpenseTransaction(int id)
	{
		etr.deleteById(id);
	}
}