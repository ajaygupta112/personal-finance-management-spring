package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.IncomeTransaction;

public interface IncomeTransactionRepository extends JpaRepository<IncomeTransaction, Integer> {

}
