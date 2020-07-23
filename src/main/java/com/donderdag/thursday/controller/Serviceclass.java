package com.donderdag.thursday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.donderdag.thursday.domain.Department;


@Service
@Transactional
public class Serviceclass {
	

	@Autowired
	Repository dr;
	
	public void inDeService() {
		System.out.println("We zijn hier in de DepartmentManagerService.");
		dr.save(new Department());
	}
	
	public Iterable<Department> geefAlleDepartementen(){
		return dr.findAll();
	}

	public Department voegToe(Department dp) {
		dr.save(dp);
		return dp;
	}

	public void deleteById(long id) {
		dr.deleteById(id);
		
	}

	public Department getById(long id) {
		return dr.findById(id).get();
	}

	public Department getByName(String name) {
		   for (Department d : geefAlleDepartementen()) {
			   try {
	            if (d.getName().equalsIgnoreCase(name)) {
	                return d;}
	            }catch (NullPointerException e) {
	            	continue;}
	            }
		   		return null;
	        }
	       
	}



