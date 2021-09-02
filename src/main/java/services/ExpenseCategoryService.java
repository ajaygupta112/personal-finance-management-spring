package services;

import java.util.ArrayList;
import java.util.List;

import models.ExpenseCategory;
import models.ExpenseTransaction;
import repositories.ExpenseCategoryRepository;

public class ExpenseCategoryService {
private ExpenseCategoryRepository ecr;
	
	public List<ExpenseCategory> getAllExpenseCategory(){
		List<ExpenseCategory> expenseCatList=new ArrayList<>();
		ecr.findAll()
		.forEach(expenseCatList::add);
		return expenseCatList;	
	}
	public 	ExpenseCategory getExpenseCategoryById(int id)
	{
		return ecr.findById(id).orElse(null);
	}
	public void addExpenseCategory(ExpenseCategory exCat)
	{
		ExpenseCategory t = ecr.save(exCat);
	}
	public void updateExpenseCategory(ExpenseCategory expCat)
	{
		ecr.save(expCat);
	}
	/*public void addAllUserTypes(List<UserType> incTrans)
	{
		itr.saveAll(incTrans);
	}*/
	public void deleteExpenseTransaction(int id)
	{
		ecr.deleteById(id);
	}
}
