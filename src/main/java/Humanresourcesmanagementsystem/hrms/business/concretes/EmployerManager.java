package Humanresourcesmanagementsystem.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.EmployerService;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessDataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessResult;
import Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs.EmployerDao;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Employer;

public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}
	

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Data listelendi.");
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("İş veren kayıt edildi.");
		
	}

}
