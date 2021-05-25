package Humanresourcesmanagementsystem.hrms.entitites.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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

}
