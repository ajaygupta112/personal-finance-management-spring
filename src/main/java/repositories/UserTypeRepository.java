package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.UserType;

public interface UserTypeRepository extends JpaRepository<UserType, Integer> {

}
