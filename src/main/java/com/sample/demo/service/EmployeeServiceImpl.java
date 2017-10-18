package com.sample.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.demo.mappers.EmployeeMapper;
import com.sample.demo.vo.Criteria;
import com.sample.demo.vo.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public List<Employee> serchByOpt(Criteria c) {
		return employeeMapper.serchByOpt(c);
	}

	public List<Employee> serchByOther(Criteria c) {
		return employeeMapper.serchByOther(c);
	}
	
	
}
