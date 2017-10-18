package com.sample.demo.service;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sample.demo.vo.Criteria;
import com.sample.demo.vo.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:/META-INF/spring/app-context.xml"})
public class EmployeeServiceTests {

	@Autowired
	EmployeeService employeeService;
	
	@Test
	public void testSearchEmployees() {
		Criteria c = new Criteria();
		//c.setOpt("name");
		//c.setKeyword("HONG");
		c.setOpt("phone");
		c.setKeyword("515.123.4567");
		
		List<Employee> result = employeeService.serchByOpt(c);
		assertEquals(1, result.size());
	}
	
	@Test
	public void testSerchByOther() {
		Criteria c = new Criteria();
		c.setDepts(Arrays.asList(20,30,40,90));
		c.setJobs(Arrays.asList("AD_PRES","AD_VP","IT_PROG"));
		c.setMinSalary(new Long(5000));
		c.setMaxSalary(new Long(20000));
		c.setBeginDate("2007-01-01");
		c.setEndDate("2010-12-30");
		employeeService.serchByOther(c);
	}
}
