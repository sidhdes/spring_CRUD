package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class users {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String uname;
private String uemail;
private String upass;
private String ucpass;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUemail() {
	return uemail;
}
public void setUemail(String uemail) {
	this.uemail = uemail;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}
public String getUcpass() {
	return ucpass;
}
public void setUcpass(String ucpass) {
	this.ucpass = ucpass;
}

}
