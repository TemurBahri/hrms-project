package Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Humanresourcesmanagementsystem.hrms.entitites.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
	
	@Query("From JobAdvertisement where active=true")
	List<JobAdvertisement> getByIsActive();
	
	List<JobAdvertisement> getByactiveTrueAndEmployer_companyName(String companyName);

}
