package Humanresourcesmanagementsystem.hrms.entitites.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="job_advertisement")
@AllArgsConstructor
@NoArgsConstructor

public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", updatable = false)
	private int id;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="min_salary")
	private Double minSalary;
	
	@Column(name="max_salary")
	private Double maxSalary;
	
	@Column(name="number_open_positions")
	private int numberOpenPositions;
	
	@Column(name="application_deadline")
	private Date applicationDeadline;
	
	@Column(name="active")
	private Boolean active;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne()
	@JoinColumn(name="company_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name="job_id")
	private JobTitle jobTitle;

}
