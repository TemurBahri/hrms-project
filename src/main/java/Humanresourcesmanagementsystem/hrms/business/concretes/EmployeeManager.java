package Humanresourcesmanagementsystem.hrms.business.concretes;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.EmployeeService;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessDataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessResult;
import Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs.EmployeeDao;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Employee;

public class EmployeeManager implements EmployeeService {
	
private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	
	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(), "Data listelendi.");
	}

	@Override
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("Sistem çalışanı kayıt edildi.");
	}

}
