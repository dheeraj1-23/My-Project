package com.example.myproject.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Registration")
public class Admin {
	
	
	@Id
	  public String id;

	  public String FirstName;
	  public String LastName;
	  public String Password;
	  public String Emailid;
	  
	  public Admin() {}

	  public Admin(String firstName, String LastName, String Password, String Emailid, String FirstName) {
	    this.FirstName = FirstName;
	    this.LastName = LastName;
	    this.Password = Password; 
	    this.Emailid = Emailid;
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "Customer[id=%s, FirstName='%s', LastName='%s', Password='%s', Emailid='%s']",
	        id, FirstName, LastName, Password, Emailid);
	  }
    

}
