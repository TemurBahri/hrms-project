package Humanresourcesmanagementsystem.hrms.business.abstratcs;

import java.util.List;

import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv.School;

public interface SchoolService {
	
	Result add(School school);
	
	DataResult<List<School>> getAll();
	
	DataResult<List<School>> sortByFinishDate();

}
