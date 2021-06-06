package Humanresourcesmanagementsystem.hrms.core.verification;

public class EmailManager implements EmailService {

	@Override
	public boolean isVerified(Boolean isVerifyEmail) {
		if (isVerifyEmail) {
			return true;
		}
		return false;
	}
	
}
