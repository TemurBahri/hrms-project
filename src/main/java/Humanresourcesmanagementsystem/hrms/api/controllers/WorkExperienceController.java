package Humanresourcesmanagementsystem.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.WorkExperienceService;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv.WorkExperience;

@RestController
@RequestMapping("/api/workexperiences")
public class WorkExperienceController {
	
	private WorkExperienceService workExperienceService;

	@Autowired
	public WorkExperienceController(WorkExperienceService workExperienceService) {
		super();
		this.workExperienceService = workExperienceService;
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody WorkExperience workExperience) {
		return this.workExperienceService.add(workExperience);
	}

	@GetMapping("/getall")
	public DataResult<List<WorkExperience>> getAll() {
		return this.workExperienceService.getAll();
	}

}
