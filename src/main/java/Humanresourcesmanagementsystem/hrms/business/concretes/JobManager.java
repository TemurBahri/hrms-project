package Humanresourcesmanagementsystem.hrms.business.concretes;

import java.util.List;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.JobService;
import Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs.JobDao;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Job;

public class JobManager implements JobService  {
	
	private JobDao jobDao;

	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public List<Job> getAll() {
		
		return jobDao.findAll();
	}
	

}
