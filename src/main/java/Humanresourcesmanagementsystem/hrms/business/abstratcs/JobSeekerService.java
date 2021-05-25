package Humanresourcesmanagementsystem.hrms.business.abstratcs;

import java.util.List;

import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.JobSeeker;

public interface JobSeekerService {
	
	DataResult<List<JobSeeker>> getAll();
	Result add(JobSeeker jobSeeker);
	Result delete(int id);
	Result update(JobSeeker jobSeeker);

}
