package com.example.IntellectTest.Controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.IntellectTest.DOA.AppUser;
import com.example.IntellectTest.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/user" , method=RequestMethod.GET)
	public List<AppUser> getUser()
	{
		return  userService.getUsers();
	}
	
	@RequestMapping(value="/user" , consumes="application/JSON", method=RequestMethod.POST)
	public ResponseEntity<String> addUser(@RequestBody AppUser user) throws ParseException
	{
		
				
		String result=userService.addUser(user);
		ResponseEntity<String> responseEntity = new ResponseEntity<>(result,
                HttpStatus.OK);
		
		return responseEntity;
		
	}
	
	@RequestMapping(value="/user/{id}" , method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteUser(@PathVariable String id)
	{
		String result=  userService.deleteUser(id);
		
		ResponseEntity<String> responseEntity = new ResponseEntity<>(result,
                HttpStatus.OK);
		
		return responseEntity;
	}

}
