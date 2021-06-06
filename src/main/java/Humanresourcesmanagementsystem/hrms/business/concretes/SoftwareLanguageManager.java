package Humanresourcesmanagementsystem.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.SoftwareLanguageService;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessDataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessResult;
import Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs.SoftwareLanguageDao;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv.SoftwareLanguage;

@Service
public class SoftwareLanguageManager implements SoftwareLanguageService {
	
	private SoftwareLanguageDao softwareLanguageDao;

	@Autowired
	public SoftwareLanguageManager(SoftwareLanguageDao softwareLanguageDao) {
		super();
		this.softwareLanguageDao = softwareLanguageDao;
	}

	@Override
	public Result add(SoftwareLanguage softwareLanguage) {
		this.softwareLanguageDao.save(softwareLanguage);
		return new SuccessResult("Yabancı dil eklendi");
	}

	@Override
	public Result delete(SoftwareLanguage softwareLanguage) {
		this.softwareLanguageDao.delete(softwareLanguage);
		return new SuccessResult("Yabancı dil silindi");
		
	}

	@Override
	public Result update(SoftwareLanguage softwareLanguage) {
		this.softwareLanguageDao.save(softwareLanguage);
		return new SuccessResult("Yabancı dil güncellendi");
	}

	@Override
	public DataResult<List<SoftwareLanguage>> getAll() {
		return new SuccessDataResult<List<SoftwareLanguage>>(this.softwareLanguageDao.findAll(),"Yabancı diller listelendi");
	}

	

}
