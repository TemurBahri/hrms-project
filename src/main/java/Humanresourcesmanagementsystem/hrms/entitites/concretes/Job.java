package Humanresourcesmanagementsystem.hrms.entitites.concretes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Job {
		
	@Id
	@GeneratedValue
	@Column(name="position_id")
	private int id;
	
	@Column(name="position_name")
	private String name;
	
	@Column(name="position_description")
	private String description;
	

	public Job() {
		
	}
	
	public Job(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

}
