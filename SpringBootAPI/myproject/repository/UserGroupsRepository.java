package com.example.myproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.myproject.entity.UserGroups;

@Repository

public interface UserGroupsRepository extends MongoRepository < UserGroups, String >{


}
