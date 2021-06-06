package Humanresourcesmanagementsystem.hrms.business.abstratcs;

import java.util.List;

import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv.SoftwareLanguage;

public interface SoftwareLanguageService {
	
	Result add(SoftwareLanguage softwareLanguage);
	Result delete(SoftwareLanguage softwareLanguage);
	Result update(SoftwareLanguage softwareLanguage);

	DataResult<List<SoftwareLanguage>> getAll();	
	
}
