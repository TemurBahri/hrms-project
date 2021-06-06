package Humanresourcesmanagementsystem.hrms.business.abstratcs;

import java.util.List;

import Humanresourcesmanagementsystem.hrms.core.utilities.results.DataResult;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv.Image;

public interface ImageService {
	
	Result add(Image image);

	Result delete(int imageId);

	DataResult<List<Image>> getAll();

	DataResult<Image> getByImageId(int imageId);

}
