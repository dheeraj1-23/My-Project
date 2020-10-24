package com.example.myproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myproject.entity.UserGroups;
import com.example.myproject.repository.UserGroupsRepository;


@Service

public class UserGroupsService {
	@Autowired
	private UserGroupsRepository userGroupsRepository;
	
	public List<UserGroups> getUserGroups() {
		return userGroupsRepository.findAll();
	}

	public UserGroups SaveData(UserGroups userGroups) {
		// TODO Auto-generated method stub
		return userGroupsRepository.save(userGroups);
	}

}
