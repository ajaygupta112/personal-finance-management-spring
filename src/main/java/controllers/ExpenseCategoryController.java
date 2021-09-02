package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import models.ExpenseCategory;
import services.ExpenseCategoryService;


@RestController
public class ExpenseCategoryController {
	@Autowired
	private ExpenseCategoryService expCatSer;
	@RequestMapping("/expenseCategory")
	public List<ExpenseCategory> getAllExpenseCategories()
	{
		return expCatSer.getAllExpenseCategory();
	}
	
	@RequestMapping("/expenseCategory/{id}")
	public ExpenseCategory getExpenseCategoryById(@PathVariable int id)
	{
		return expCatSer.getExpenseCategoryById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/expenseCategory")
	public void addExpenseCategory(@RequestBody ExpenseCategory expCat)
	{
		//System.out.print(topic);
		expCatSer.addExpenseCategory(expCat);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/incomeCategory/{id}")
	public void updateExpenseCategory(@PathVariable int id, @RequestBody ExpenseCategory expCat)
	{
		expCatSer.updateExpenseCategory(expCat);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/expenseCategory/{id}")
	public void deleteExpenseCategory(@PathVariable int id)
	{
		expCatSer.deleteExpenseTransaction(id);
	}
	/*
	@RequestMapping(method = RequestMethod.POST, value = "/expenseCategory/add")
	public void addAllExpenseCategory(List<ExpenseCategory> expCat)
	{
		expCatSer.addAllExpenseCategory(expCat);
	}
	*/


}
