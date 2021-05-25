package Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;


import Humanresourcesmanagementsystem.hrms.entitites.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer>{

}
