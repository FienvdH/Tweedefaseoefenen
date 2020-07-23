package com.donderdag.thursday.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.donderdag.thursday.domain.Department;


@Component
public interface Repository extends CrudRepository<Department, Long>{

}
