package Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;


import Humanresourcesmanagementsystem.hrms.entitites.concretes.User;

public interface UserDao extends JpaRepository<User,Integer> {
	
	

}
