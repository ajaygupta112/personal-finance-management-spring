package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import models.IncomeTransaction;
import repositories.IncomeTransactionRepository;

public class IncomeTransactionService {
	@Autowired
	private IncomeTransactionRepository itr;
	
	public List<IncomeTransaction> getAllIncomeTransaction(){
		List<IncomeTransaction> incomeList=new ArrayList<>();
		itr.findAll()
		.forEach(incomeList::add);
		return incomeList;	
	}
	public 	IncomeTransaction getIncomeTransactionById(int id)
	{
		return itr.findById(id).orElse(null);
	}
	public void addIncomeTransaction(IncomeTransaction incTrans)
	{
		IncomeTransaction t = itr.save(incTrans);
	}
	public void updateIncomeTransaction(IncomeTransaction incTrans)
	{
		itr.save(incTrans);
	}
	/*public void addAllTopic(List<IncomeTransaction> incTrans)
	{
		itr.saveAll(incTrans);
	}*/
	public void deleteIncomeTransaction(int id)
	{
		itr.deleteById(id);
	}
}
