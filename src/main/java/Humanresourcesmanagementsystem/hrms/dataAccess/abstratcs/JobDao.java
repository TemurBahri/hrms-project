package Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;

import Humanresourcesmanagementsystem.hrms.entitites.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer>  {

	

}
