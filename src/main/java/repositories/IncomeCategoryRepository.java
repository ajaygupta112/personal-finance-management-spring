package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.IncomeCategory;

public interface IncomeCategoryRepository extends JpaRepository<IncomeCategory, Integer> {

}
