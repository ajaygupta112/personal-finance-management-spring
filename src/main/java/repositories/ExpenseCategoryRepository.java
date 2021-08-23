package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.ExpenseCategory;

public interface ExpenseCategoryRepository extends JpaRepository<ExpenseCategory, Integer> {

}
