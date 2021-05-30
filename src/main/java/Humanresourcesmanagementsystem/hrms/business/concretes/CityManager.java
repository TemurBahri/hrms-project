package Humanresourcesmanagementsystem.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.CityService;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessDataResult;
import Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs.CityDao;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.City;

@Service
public class CityManager implements CityService{
	
	private CityDao cityDao;
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}
	@Override
	public DataResult<List<City>> getAll() {
		
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"Şehirler başarıyla listelendi.");
	}
}
