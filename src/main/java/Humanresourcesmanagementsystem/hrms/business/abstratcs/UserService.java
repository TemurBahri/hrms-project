package Humanresourcesmanagementsystem.hrms.business.abstratcs;

import java.util.List;

import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.User;

public interface UserService {
	
	DataResult<List<User>> getAll();

}
