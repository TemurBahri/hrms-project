package Humanresourcesmanagementsystem.hrms.core.utilities.adapters;

import Humanresourcesmanagementsystem.hrms.entitites.concretes.JobSeeker;

public interface CheckUserService {

	boolean checkIfRealPerson(JobSeeker jobseeker);
}
