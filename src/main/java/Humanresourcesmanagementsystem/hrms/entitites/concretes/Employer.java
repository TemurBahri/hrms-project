package Humanresourcesmanagementsystem.hrms.entitites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor

public class Employer  {
	
	
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "web_address")
	private String webAddress;
	
	@Column(name = "phone_number")
	private String phoneNumber;

}
