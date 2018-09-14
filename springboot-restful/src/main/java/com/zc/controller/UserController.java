package com.zc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zc.pojo.User;
import com.zc.util.JsonUtils;

@Controller
@RequestMapping("/rest")
public class UserController {
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	
//	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	@GetMapping("/user/{id}")
	@ResponseBody
	public User get(@PathVariable("id") int id){
		System.out.println("get" + id);
		User user = new User();
		user.setId(id);
		user.setUsername("wangxf");
		user.setPassword("123");
		return user;
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.POST)
	public String post(@PathVariable("id") int id){
		System.out.println("post" + id);
		return "/hello";
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.PUT)
	public String put(@PathVariable("id") int id){
		System.out.println("put" + id);
		return "/hello";
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") int id){
		System.out.println("delete" + id);
		return "/hello";
	}
	

}
