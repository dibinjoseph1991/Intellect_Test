package com.example.IntellectTest.Service;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IntellectTest.DOA.AppUser;
import com.example.IntellectTest.Repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	List<AppUser> users=new ArrayList<AppUser>();
	
	public List<AppUser> getUsers()
	{
		users=(List<AppUser>)userRepo.findAll();
		return users;
	}
	
	public String addUser(AppUser user) throws ParseException
	{
		SimpleDateFormat fmt = new SimpleDateFormat("DD-MMM-YYYY");
		Date date = fmt.parse(user.getBirthDate().toString());
		Date currentDate= new Date();
		if(date.before(currentDate) || date.equals(currentDate))
		{
		user.setBirthDate(date.toString());
		userRepo.save(user);
		return "Successfully Added User";
		}
		else
		{
			return "Please check the Entered Birthday";
		}
	}
	
	public String deleteUser(String id)
	{
		userRepo.delete(id);
		return "successfully delete user with id :"+ id;
	}
	
	
	

}
