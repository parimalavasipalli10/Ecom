package Ecommerce.ecom.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import Ecommerce.ecom.LoginDetails;
import Ecommerce.ecom.Model.Users;
import Ecommerce.ecom.Model.products;
import Ecommerce.ecom.Repository.productsRepo;
import Ecommerce.ecom.Repository.usersRepo;



@RestController
public class userController {
	@Autowired
	public usersRepo uRepo;
	
	@CrossOrigin(origins="http://localhost:4200/")
	@PostMapping("/userRegistration")
	public Users addUser(@RequestBody Users u) {
		return uRepo.save(u);
	}
	public Users getUserDetails(Long id) {
		Optional<Users> op=uRepo.findById(id);
		Users p=null;
		try {
			p=op.get();
			return p;
		}
		catch(Exception e) {
			return null;
		}
	}
	@GetMapping("/getUserById/{id}")
	public Users getProduct(@PathVariable("id") Long id) {
		return getUserDetails(id);
		
	}
	@GetMapping("/getAllUsers")
	public List<Users> getAllProducts() {
		return uRepo.findAll();
	}
	
	@CrossOrigin(origins="http://localhost:4200/")
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginDetails u) {
		String email= u.getUser_Email();
		String password=u.getUser_password();
		Users userDetails=null;
		
		 Optional<Users> optionalUser= uRepo.findByUser_Email(email);
		 if(optionalUser.isPresent()) {
			 userDetails=optionalUser.get();
			 String p=userDetails.getUser_password();
			 if (p.equals(password)) {
//				 return ResponseEntity.ok(new ApiResponse("Login Successful"));
				 return ResponseEntity.ok("Login Successful");
			 }
			 else {
				 return ResponseEntity.ok(new ApiResponse("Password Incorrect"));
			 }
		 }
		 else {
			 return ResponseEntity.ok(new ApiResponse("User Does not exist"));
		 }
	}
	
}
