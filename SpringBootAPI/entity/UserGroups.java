package com.example.myproject.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "UserGroups")


public class UserGroups {
	@Id
	  public String id;

	  public String Name;
	  public String Address;
	  public String City;
	  public Integer Postalcode;
	  
	  public UserGroups() {}

	  public UserGroups(String Name, String Address, String City, Integer Postalcode) {
	    this.Name = Name;
	    this.Address = Address;
	    this.City = City; 
	    this.Postalcode = Postalcode;
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "Customer[id=%s, Name='%s', Address='%s', City='%s', Postalcode='%d']",
	        id, Name, Address, City, Postalcode);
	  }
  

}




