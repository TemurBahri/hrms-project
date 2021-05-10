package Humanresourcesmanagementsystem.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.JobService;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobControllers {
	
	private JobService jobService;

	
	@Autowired
	public JobControllers(JobService jobService) {
		super();
		this.jobService = jobService;
	}
	
	@GetMapping("/getall")
	public List<Job> getAll() {
		return this.jobService.getAll();
	}
	

}
