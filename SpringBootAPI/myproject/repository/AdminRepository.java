package com.example.myproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.myproject.entity.Admin;

@Repository
public interface AdminRepository extends MongoRepository < Admin, String >{

}
