package Humanresourcesmanagementsystem.hrms.business.abstratcs;

import java.util.List;

import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.JobAdvertisement;

public interface JobAdversitementService {
	
	DataResult<List<JobAdvertisement>> getAll();
    DataResult<List<JobAdvertisement>> getAllActiveSorted();
    Result add(JobAdvertisement jobAbvertisement);
  
    DataResult<List<JobAdvertisement>>  getByIsActiveAndSortedByApplicationDeadline();
    DataResult<JobAdvertisement> getById(int id);
    
    DataResult<List<JobAdvertisement>> getByIsActive();
    DataResult<List<JobAdvertisement>> getByactiveTrueAndEmployer_companyName(String companyName);

}
