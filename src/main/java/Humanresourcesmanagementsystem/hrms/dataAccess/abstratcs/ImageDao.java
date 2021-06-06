package Humanresourcesmanagementsystem.hrms.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;

import Humanresourcesmanagementsystem.hrms.entitites.concretes.Cv.Image;

public interface ImageDao extends JpaRepository<Image,Integer> {

	Image getByImageId(int imageId);
}
