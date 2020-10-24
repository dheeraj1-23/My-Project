package com.example.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.entity.UserGroups;
import com.example.myproject.service.UserGroupsService;



@RestController
public class UserGroupsController {
	@Autowired
	private UserGroupsService UserGroupsService;
	
	@CrossOrigin(origins = "*")
    @GetMapping(path="/usergroups")
    public List<UserGroups> getUserGroups() 
    {
        return UserGroupsService.getUserGroups();
    }
	@CrossOrigin(origins = "*")
    @PostMapping(path="/saveuserGroups")
    public String SaveUserGroups(@RequestBody UserGroups userGroups) 
    {
		UserGroupsService.SaveData(userGroups);
        return "Saved Successfully";
}

}