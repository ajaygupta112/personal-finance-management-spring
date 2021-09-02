package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import models.IncomeCategory;
import models.IncomeTransaction;
import repositories.IncomeCategoryRepository;

public class IncomeCategoryService {
	@Autowired
	private IncomeCategoryRepository icr;
	public List<IncomeCategory> getAllIncomeCategories(){
		List<IncomeCategory> incomeCatList=new ArrayList<>();
		icr.findAll()
		.forEach(incomeCatList::add);
		return incomeCatList;	
	}
	public IncomeCategory getIncomeCategoryById(int id)
	{
		return icr.findById(id).orElse(null);
	}
	public void addIncomeCategory(IncomeCategory incCat)
	{
		IncomeCategory inCat = icr.save(incCat);
	}
	public void updateIncomeCategory(IncomeCategory incCat)
	{
		icr.save(incCat);
	}
	/*public void addAllTopic(List<IncomeTransaction> incTrans)
	{
		itr.saveAll(incTrans);
	}*/
	public void deleteIncomeCategory(int id)
	{
		icr.deleteById(id);
	}
}
