package Humanresourcesmanagementsystem.hrms.api.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import Humanresourcesmanagementsystem.hrms.business.abstratcs.ImageService;

import Humanresourcesmanagementsystem.hrms.core.utilities.results.Result;
import Humanresourcesmanagementsystem.hrms.core.utilities.results.SuccessResult;
import Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv.Image;

@RestController
@RequestMapping("/api/images")
public class ImagesController {
	
	private ImageService  imageService;

	@Autowired
	public ImagesController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Image image,MultipartFile multipartFile) {
		this.imageService.add(image);
		return new SuccessResult("Başarılı");
	}
	 

}
