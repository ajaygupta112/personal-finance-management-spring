package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.ExpenseTransaction;

public interface ExpenseTransactionRepository extends JpaRepository<ExpenseTransaction, Integer> {

}
