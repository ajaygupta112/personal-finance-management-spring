package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import models.IncomeTransaction;

import services.IncomeTransactionService;

@RestController
public class IncomeTransactionController {
	@Autowired
	private IncomeTransactionService incTransSer;
	@RequestMapping("/incomeTransaction")
	public List<IncomeTransaction> getAllIncomeTransaction()
	{
		return incTransSer.getAllIncomeTransaction();
	}
	
	@RequestMapping("/incomeTransaction/{id}")
	public IncomeTransaction getIncomeTransactionById(@PathVariable int id)
	{
		return incTransSer.getIncomeTransactionById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/incomeTransaction")
	public void addIncomeTransaction(@RequestBody IncomeTransaction incTrans)
	{
		//System.out.print(topic);
		incTransSer.addIncomeTransaction(incTrans);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/incomeTransaction/{id}")
	public void updateIncomeTransaction(@PathVariable int id, @RequestBody IncomeTransaction incTrans)
	{
		incTransSer.updateIncomeTransaction(incTrans);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/incomeTransaction/{id}")
	public void deleteIncomeTransaction(@PathVariable int id)
	{
		incTransSer.deleteIncomeTransaction(id);
	}
	/*
	@RequestMapping(method = RequestMethod.POST, value = "/incomeTrans/add")
	public void addAllIncomeTransaction(List<IncomeTransaction> incTrans)
	{
		incTransSer.addAllIncomeTransaction(incTrans);
	}
	*/
}
