package Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;

import Humanresourcesmanagementsystem.hrms.entitites.concretes.Candidate;


public interface CandidateDao extends JpaRepository<Candidate,Integer>{
	
	

}
