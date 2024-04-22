package com.example.demo;

import java.util.List;

public interface userservice {

	
	public void register(users u1);

	public List <users> getallinfo();
	
public users getsingleinfo(int id);

	void deldata(int id);
}
