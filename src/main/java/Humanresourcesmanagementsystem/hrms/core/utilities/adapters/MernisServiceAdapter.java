package Humanresourcesmanagementsystem.hrms.core.utilities.adapters;

import org.springframework.stereotype.Service;

import Humanresourcesmanagementsystem.hrms.entitites.concretes.JobSeeker;

@Service
public class MernisServiceAdapter implements CheckUserService {

	@Override
	public boolean checkIfRealPerson(JobSeeker jobseeker) {
		if(jobseeker.getIdentityId() == jobseeker.getIdentityId()
				&& jobseeker.getFirstName() == jobseeker.getFirstName()
				&& jobseeker.getLastName() == jobseeker.getLastName()
				&& jobseeker.getBirthDate()== jobseeker.getBirthDate()) {
			return true;
		}
	return false;
	
	}
	

}
