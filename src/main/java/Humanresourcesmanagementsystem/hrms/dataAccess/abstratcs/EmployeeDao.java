package Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;

import Humanresourcesmanagementsystem.hrms.entitites.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
	
	

}
