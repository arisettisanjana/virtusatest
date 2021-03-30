package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("")
public class UserController {
  @Autowired
  private UserRepository userRepository;
  
  @PostMapping("login")
  public boolean IsValid(@RequestBody Login l)
  {
	  //List(userRepository.findByEmail(l.getEmail());
	  
	  
	  return true;
  }
  
  @PostMapping("signup")
  public boolean check(@RequestBody User u)
  {
//	  int s=(userRepository.findByEmail(u.getEmail())).size();
//	  if(s==0)
//	  { userRepository.save(u);
//	  return true;
//	  }
//	  
//	  else
//		  return false;
	  List<User> l=userRepository.findByEmail(u.getEmail());
	  System.out.println(l);
	  return true;
		  
  }
  
  @GetMapping("/users")
  public List<User> getUsers(){
	  return this.userRepository.findAll();
  }
}
