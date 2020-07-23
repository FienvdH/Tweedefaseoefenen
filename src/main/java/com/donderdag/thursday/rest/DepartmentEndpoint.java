package com.donderdag.thursday.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.donderdag.thursday.controller.*;
import com.donderdag.thursday.domain.*;

@RestController
public class DepartmentEndpoint {

	@Autowired
	Serviceclass sc;
	
	@GetMapping("/check")
	public String check() {
		return "werkt het?";
	}
	
	@GetMapping("/voegleegtoe")
	public String voegLegeToe() {
		sc.inDeService();
		return "nieuw object toegevoegd";
	}
	
	@GetMapping("/allDepartments")
	public Iterable<Department> checkDepartmentManager() {
		System.out.println("in endpoint check de service");
		return sc.geefAlleDepartementen();}
	
	
	@PostMapping("/voegtoe")	
	public Department nieuwDepartment(@RequestBody Department dp) {	
		return sc.voegToe(dp);
				
	}
	
	@DeleteMapping("/delete/{id}")
    public void deleteDepartmentById(@PathVariable(value="id") long id) {
        	sc.deleteById(id);
    }
	
	@GetMapping("/id/{id}")
    public Department getDepartmentById(@PathVariable(value="id")long id) {
        return sc.getById(id);
    }
	
	@GetMapping("/name/{name}")
    public Department getDepartmentByName(@PathVariable(value="name")String name) {
        return sc.getByName(name);
    }
}
