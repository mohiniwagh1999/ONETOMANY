package com.herry.__ONETOMANY;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.herry.__ONETOMANY.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext 
		c=SpringApplication.run(Application.class, args);
		EmpService e=c.getBean(EmpService.class);
		e.saveEmp();
		//e.getEmp();
		//e.getAddress();
		//e.deleteEmp();
	}

}
