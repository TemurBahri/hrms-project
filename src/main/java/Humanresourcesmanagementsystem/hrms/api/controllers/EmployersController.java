package Humanresourcesmanagementsystem.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.EmployerService;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployersController(EmployerService employerService) {
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}

}
