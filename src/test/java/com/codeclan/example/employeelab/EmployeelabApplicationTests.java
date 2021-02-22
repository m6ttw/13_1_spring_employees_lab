package com.codeclan.example.employeelab;

import com.codeclan.example.employeelab.models.Employee;
import com.codeclan.example.employeelab.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeelabApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee employee = new Employee("Bob", 45, "1234", "bob@live.com");
		employeeRepository.save(employee);
	}

}
