package com.laurenrandi.laurenrandiservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laurenrandi.laurenrandiservice.Entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{

    Object findbyId(Long employeeId);
    
}
