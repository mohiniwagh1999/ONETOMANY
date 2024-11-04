package com.herry.__ONETOMANY.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herry.__ONETOMANY.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee,Integer> {

}
