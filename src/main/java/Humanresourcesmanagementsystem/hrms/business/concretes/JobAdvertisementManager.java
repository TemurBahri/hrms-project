package Humanresourcesmanagementsystem.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.JobAdversitementService;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessDataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessResult;
import Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs.JobAdvertisementDao;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdversitementService {

	private JobAdvertisementDao jobAdvertisementDao;
	

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}
	
	
	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(),"İş ilanları başarıyla listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC,"applicationDeadline");
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(sort),"Başarılı");
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İlan eklendi");
	} 

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActive() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByIsActive(),"Aktiflik durumu listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveAndSortedByApplicationDeadline() {
		Sort sort =Sort.by(Sort.Direction.DESC,"applicationDeadline");
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(sort),"Tarihe göre aktif ilanlar sıralandı");
	}

	@Override
	public DataResult<JobAdvertisement> getById(int id) {
		return new SuccessDataResult<JobAdvertisement>
		(this.jobAdvertisementDao.getOne(id));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByactiveTrueAndEmployer_companyName(String companyName) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByactiveTrueAndEmployer_companyName(companyName),"Firmanın aktif ilanları listelendi ");
	}
}
