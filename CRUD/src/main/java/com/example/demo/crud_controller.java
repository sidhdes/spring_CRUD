package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class crud_controller {
@Autowired
	userservice us;
	
	@RequestMapping("/")
	public String one() {
		return "register";
	}
	
@PostMapping("/savedata")
	public String save(@ModelAttribute("u1") users u1) {
		if(u1.getUpass().equals(u1.getUcpass())) {
			us.register(u1);
			return "redirect:/display";
		}
		return "register";
	}
	
	@RequestMapping("/display")
	public String display(Model m) {
		List<users> ul=us.getallinfo();	
m.addAttribute("ku",ul);
return "display";
	}
	
	
	@GetMapping("/del/{id}")	
	public String deldata(@PathVariable int id) {
		us.deldata(id);
		return "redirect:/display";
		
	}
	
	
	@GetMapping("/editdata/{id}")
	public String edit(@PathVariable int id, Model m) {

		users u = us.getsingleinfo(id);
		m.addAttribute("kk",u);	
		return "editdata";
		
		
	}
	
	@PostMapping("/updatedata")
	public String update(@ModelAttribute("u2") users u2) {
		users sf = new users();
	
		sf.setUname(u2.getUname());
		sf.setUemail(u2.getUemail());
		sf.setUpass(u2.getUpass());
	
		
		us.register(u2);
		return "redirect:/display";
	}
	

}


