package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class userdao implements userservice {

	
	@Autowired
	userrepo ur;
	@Override
	public void register(users u1) {
		// TODO Auto-generated method stub
ur.save(u1);
	}
	@Override
	public List<users> getallinfo() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}
	@Override
	public void deldata(int id) {
		// TODO Auto-generated method stub
		ur.deleteById(id);
	}
	@Override
	public users getsingleinfo(int id) {
		// TODO Auto-generated method stub
		return ur.getById(id);
	}


	

}
