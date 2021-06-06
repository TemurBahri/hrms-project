package Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;

import Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv.WorkExperience;

public interface WorkExperienceDao extends JpaRepository <WorkExperience,Integer> {

}
