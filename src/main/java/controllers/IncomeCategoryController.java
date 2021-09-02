package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import models.IncomeCategory;
import services.IncomeCategoryService;

@RestController
public class IncomeCategoryController {
	@Autowired
	private IncomeCategoryService incCatSer;
	@RequestMapping("/incomeCategory")
	public List<IncomeCategory> getAllIncomeCategories()
	{
		return incCatSer.getAllIncomeCategories();
	}
	
	@RequestMapping("/incomeCategory/{id}")
	public IncomeCategory getIncomeCategoryById(@PathVariable int id)
	{
		return incCatSer.getIncomeCategoryById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/incomeCategory")
	public void addIncomeCategory(@RequestBody IncomeCategory incCat)
	{
		//System.out.print(topic);
		incCatSer.addIncomeCategory(incCat);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/incomeCategory/{id}")
	public void updateIncomeCategory(@PathVariable int id, @RequestBody IncomeCategory incCat)
	{
		incCatSer.updateIncomeCategory(incCat);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/incomeCategory/{id}")
	public void deleteIncomeCategory(@PathVariable int id)
	{
		incCatSer.deleteIncomeCategory(id);
	}
	/*
	@RequestMapping(method = RequestMethod.POST, value = "/incomeCategory/add")
	public void addAllIncomeCategory(List<IncomeCategory> incCat)
	{
		incCatSer.addAllIncomeCategory(incCat);
	}
	*/

}
