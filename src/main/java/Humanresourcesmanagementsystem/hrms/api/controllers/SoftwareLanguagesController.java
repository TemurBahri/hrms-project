package Humanresourcesmanagementsystem.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.SoftwareLanguageService;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv.SoftwareLanguage;

@RestController
@RequestMapping("/api/softwarelanguages")
public class SoftwareLanguagesController {
	
	private SoftwareLanguageService softwareLanguageService;

	
	@Autowired
	public SoftwareLanguagesController(SoftwareLanguageService softwareLanguageService) {
		super();
		this.softwareLanguageService = softwareLanguageService;
	}


	@PostMapping("/add")
	public Result add(@RequestBody SoftwareLanguage softwareLanguage) {
		return this.add(softwareLanguage);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody SoftwareLanguage softwareLanguage) {
		return this.add(softwareLanguage);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody SoftwareLanguage softwareLanguage) {
		return this.add(softwareLanguage);
	}
	
	@GetMapping("/getall")
	public DataResult<List<SoftwareLanguage>> getAll(){
		return this.softwareLanguageService.getAll();
	}

}
