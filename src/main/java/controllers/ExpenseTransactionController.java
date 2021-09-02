package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import models.ExpenseTransaction;
import services.ExpenseTransactionService;

public class ExpenseTransactionController {
	@Autowired
	private ExpenseTransactionService expTransSer;
	@RequestMapping("/expenseTransaction")
	public List<ExpenseTransaction> getAllExpenseTransaction()
	{
		return expTransSer.getAllExpenseTransaction();
	}
	
	@RequestMapping("/expenseTransaction/{id}")
	public ExpenseTransaction getExpenseTransactionById(@PathVariable int id)
	{
		return expTransSer.getExpenseTransactionById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/expenseTransaction")
	public void addExpenseTransaction(@RequestBody ExpenseTransaction expTrans)
	{
		expTransSer.addExpenseTransaction(expTrans);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/expenseTransaction/{id}")
	public void updateExpenseTransaction(@PathVariable int id, @RequestBody ExpenseTransaction expTrans)
	{
		expTransSer.updateExpenseTransaction(expTrans);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/expenseTransaction/{id}")
	public void deleteExpenseTransaction(@PathVariable int id)
	{
		expTransSer.deleteExpenseTransaction(id);
	}
	/*
	@RequestMapping(method = RequestMethod.POST, value = "/incomeTrans/add")
	public void addAllExpenseTransaction(List<ExpenseTransaction> expTrans)
	{
		expTransSer.addAllExpenseTransaction(expTrans);
	}
	*/

}
