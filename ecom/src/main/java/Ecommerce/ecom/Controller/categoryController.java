package Ecommerce.ecom.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import Ecommerce.ecom.Model.category;
import Ecommerce.ecom.Repository.categoryRepo;

public class categoryController {

	@Autowired
	public categoryRepo cRepo;
	
	@GetMapping("/getCategory")
	public List<category> getCategory(){
		System.out.println("Working");
		return  cRepo.findAll();
	}

}
