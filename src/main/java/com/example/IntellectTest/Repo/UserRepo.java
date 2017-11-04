package com.example.IntellectTest.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.IntellectTest.DOA.AppUser;

public interface UserRepo extends CrudRepository<AppUser, String> {

}
