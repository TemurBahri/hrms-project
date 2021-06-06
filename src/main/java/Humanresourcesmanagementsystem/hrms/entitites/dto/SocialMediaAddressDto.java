package Humanresourcesmanagementsystem.hrms.entitites.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialMediaAddressDto {
	
	private int id;
	private String gitHubAddress;
	private String linkedinAddress;

}
