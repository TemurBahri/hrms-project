package Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;

import Humanresourcesmanagementsystem.hrms.entitites.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer>{
	
	

}
