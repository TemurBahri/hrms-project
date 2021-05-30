package Humanresourcesmanagementsystem.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.EmployerService;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.ErrorResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessDataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessResult;
import Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs.EmployerDao;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}
	

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "İşveren başarıyla listelendi.");
	}

	@Override
	public Result add(Employer employer) {
		if(employer.getCompanyName().isEmpty()) {
			return new ErrorResult("Lütfen şirketinizin ismini giriniz.");
		}if(employer.getWebAddress().isEmpty()) {
			return new ErrorResult("Lütfen web sitenizi giriniz.");}
			if(employer.getPhoneNumber()==null) {
			return new ErrorResult("Lütfen telefon numaranızı giriniz.");
		}
		if(employer.getPassword()== null) {
			return new ErrorResult("Lütfen şifrenizi giriniz.");
		}for (Employer employers : this.employerDao.findAll()) {
			if(employer.getEmail().equals(employers.getEmail())) {
				return new ErrorResult("E posta alınmış!!!");
			}
		}
		
		return new SuccessResult(" İş veren kullanıcı eklendi.");
	}

}
