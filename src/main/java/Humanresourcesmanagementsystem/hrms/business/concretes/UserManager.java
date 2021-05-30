package Humanresourcesmanagementsystem.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.UserService;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessDataResult;
import Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs.UserDao;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.User;

@Service
public class UserManager implements UserService{
	
	private UserDao userDao;
	
	@Autowired
	public UserManager (UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(this.userDao.findAll(), "Kullanıcılar başarıyla listelendi.");
	}

}
