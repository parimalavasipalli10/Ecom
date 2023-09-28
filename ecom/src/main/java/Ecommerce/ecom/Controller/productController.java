package Ecommerce.ecom.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import Ecommerce.ecom.Model.category;
import Ecommerce.ecom.Model.products;
import Ecommerce.ecom.Repository.categoryRepo;
import Ecommerce.ecom.Repository.productsRepo;

@RestController
public class productController {
	@Autowired
	public productsRepo pRepo;
	
	@Autowired
	public categoryRepo cRepo;
	
	@CrossOrigin(origins="http://localhost:4200/")
	@GetMapping("/products")
	public List<products> getProducts() {
		return pRepo.findAll();
	}

	@GetMapping("/getProducts/byCategoryId/{id}")
	public ResponseEntity<List<products>> getCategoryById(@PathVariable("id") Long category) {
		
		return new ResponseEntity<>(pRepo.findByCategory_CategoryId(category), HttpStatus.OK);
	}
	
	@GetMapping("/getCategory")
	public List<category> getCategory(){
		return  cRepo.findAll();
	}
		
}
