package Humanresourcesmanagementsystem.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.JobSeekerService;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessDataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessResult;
import Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs.JobSeekerDao;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {
	
	private JobSeekerDao jobSeekerDao;

	@Autowired
	public JobSeekerManager (JobSeekerDao jobSeekerDao) {
		this.jobSeekerDao = jobSeekerDao;
	}
	
	
	
	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "İş arayanlar başarıyla listelendi.");
				
	}


	@Override
	public Result add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("iş arayan başarıyla kaydedildi.");
	}

	@Override
	public Result delete(int id) {
		this.jobSeekerDao.deleteById(id);
		return new SuccessResult("iş arayan başarıyla silindi.");
	}

	@Override
	public Result update(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("iş arayan başarıyla güncellendi.");
	}

	
	

}
