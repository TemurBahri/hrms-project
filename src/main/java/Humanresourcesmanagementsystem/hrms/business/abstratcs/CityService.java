package Humanresourcesmanagementsystem.hrms.business.abstratcs;

import java.util.List;

import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.City;

public interface CityService {

	DataResult<List<City>> getAll();
}
