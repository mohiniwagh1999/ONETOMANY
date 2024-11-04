package com.herry.__ONETOMANY.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herry.__ONETOMANY.entity.Address;
import com.herry.__ONETOMANY.entity.Employee;
import com.herry.__ONETOMANY.repo.AddressRepo;
import com.herry.__ONETOMANY.repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo emprepo;
	@Autowired
	private AddressRepo repo;
	
	public void saveEmp()
	{
		Employee e=new Employee();
		e.setName("rajni");
		e.setSalary(1200.0);
		//onr emp having multiple address
		Address a=new Address();
		a.setCity("mumbai");
		a.setCountry("india");
		a.setState("maharashtra");
		//set each address same emp
        a.setEmployee(e);
        
		Address a1=new Address();
		a1.setCity("pune");
		a1.setCountry("india");
		a1.setState("maharashtra");
		//set each address same emp//associuation
		a1.setEmployee(e);
		//association set one emp having multiple address
		List<Address> asList = Arrays.asList(a,a1);
		e.setAddress(asList);
		
		//save data using parent entity
		emprepo.save(e);
		
		
		}
	
	   public void getEmp()
	   {
		   Optional<Employee> byId = emprepo.findById(1);
		   if(byId.isPresent())
		   {
			   Employee employee = byId.get();//only parent when fetch type is lazy
			   System.out.println(employee.getAddress());
		   }
	   }
	
	   public void getAddress()
	   {
		   repo.findById(1);//child + parent data when fetch type is lazy by default
	   }
	   
	   public void deleteEmp()
	   {
		   emprepo.deleteById(1);//first parents will be deleted then child also deleted
	   }

}
