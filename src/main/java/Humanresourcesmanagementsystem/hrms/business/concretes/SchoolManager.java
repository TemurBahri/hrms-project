package Humanresourcesmanagementsystem.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.SchoolService;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessDataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessResult;
import Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs.SchoolDao;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv.School;

@Service
public class SchoolManager implements SchoolService{
	
	private SchoolDao schoolDao;
	
	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public Result add(School school) {
		if (school.getFinishDate() == null) {
			school.setFinishDate(LocalDate.parse("Devam ediyor"));
		}
		this.schoolDao.save(school);
		return new SuccessResult("Eğitim durumu eklendi");
	}

	@Override
	public DataResult<List<School>> getAll() {
		return new SuccessDataResult<List<School>>(this.schoolDao.findAll(),"Okul durumu listelendi");
	}

	@Override
	public DataResult<List<School>> sortByFinishDate() {
		Sort sort = Sort.by(Sort.Direction.DESC,"finishDate");
		return new SuccessDataResult<List<School>>(this.schoolDao.findAll(sort));
	}

}
