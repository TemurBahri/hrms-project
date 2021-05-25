package Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;


import Humanresourcesmanagementsystem.hrms.entitites.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer> {

}
