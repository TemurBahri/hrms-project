package Humanresourcesmanagementsystem.hrms.business.abstratcs;

import java.util.List;

import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv.WorkExperience;

public interface WorkExperienceService {

	Result add(WorkExperience workExperience);

	DataResult<List<WorkExperience>> getAll();

	DataResult<List<WorkExperience>> sortByEndYearOfWork();
}
