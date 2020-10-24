package com.example.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.entity.Admin;
import com.example.myproject.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@CrossOrigin(origins = "*")
	    @GetMapping(path="/admins")
	    public List<Admin> getAdmin() 
	    {
	        return adminService.getAdmin();
	    }
	@CrossOrigin(origins = "*")
    @PostMapping(path="/saveadmins")
    public String SaveAdmin(@RequestBody Admin admin) 
    {
		adminService.SaveData(admin);
        return "Saved Successfully";
    }
}
