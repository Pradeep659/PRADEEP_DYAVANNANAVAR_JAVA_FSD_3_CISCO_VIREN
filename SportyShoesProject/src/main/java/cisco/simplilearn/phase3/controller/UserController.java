package cisco.simplilearn.phase3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import cisco.simplilearn.phase3.model.User;
import cisco.simplilearn.phase3.repository.UserRepository;

@RestController
@RequestMapping("users")
public class UserController {
	
    @Autowired
	UserRepository userrepository;
	
	@GetMapping("all")
	public List<User> getAllUser() 
	{
		List<User> user = (List<User>) userrepository.findAll();
		return user;
	}
	
	// insert new Shoes into database
	@PostMapping("add")
	public User addUser(@RequestBody User user)
	{
		return userrepository.save(user);
	}
	
	// get particular Shoes by their ID
	@GetMapping("user/{id}")
	public Optional<User> getUserId(@PathVariable int id)
	{
		return userrepository.findById(id);
	}
	
	// update existing Shoes
	@PutMapping("update/{id}")
	public User updateUser(@RequestBody User user)
	{
		return userrepository.save(user);
	}
	
	// delete particular Product from database
		@DeleteMapping("delete/{id}")
		public void deleteUser(@PathVariable int id)
		{
			userrepository.deleteById(id);
		}
}
