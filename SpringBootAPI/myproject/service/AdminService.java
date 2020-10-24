package com.example.myproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myproject.entity.Admin;
import com.example.myproject.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	public List<Admin> getAdmin() {
		return adminRepository.findAll();
	}

	public Admin SaveData(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}
}
