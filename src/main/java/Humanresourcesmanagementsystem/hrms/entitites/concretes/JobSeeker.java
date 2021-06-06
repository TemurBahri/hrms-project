package Humanresourcesmanagementsystem.hrms.entitites.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv.ForeignLanguage;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv.School;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv.SoftwareLanguage;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Entity
@Table(name="job_seekers")
public class JobSeeker extends User {
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_id")
	private String identityId;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="gender")
	private String gender;
	
	@ManyToOne()
	@JoinColumn(name="id")
	private ForeignLanguage foreignLanguage;
	
	
	

}
