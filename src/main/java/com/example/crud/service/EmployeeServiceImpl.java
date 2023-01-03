package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.crud.DAO.EmployeeDAO;
import com.example.crud.DAO.EmployeeRepository;
import com.example.crud.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO employeeDao;
	
//	private EmployeeRepository employeeRepository;
//	
	public EmployeeServiceImpl(@Qualifier("employeeDAOJPAimpl") EmployeeDAO theEmployeeDao) {
		employeeDao = theEmployeeDao;
	}
	
//	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository ) {
//		employeeRepository = theEmployeeRepository;
//	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		return employeeDao.findById(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeDao.save(theEmployee);
		
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		employeeDao.deleteById(theId);		
	}

}
