package com.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.EmployeeDAO;
import com.Entity.Employee;

@Service
public class EmpService {

	@Autowired
	private EmployeeDAO employeedao;
	
	public int createEmployee(Employee employee) {
		int i = employeedao.saveData(employee);
		return i;
	}
	
	public List<Employee> readEmployee(){
		List<Employee> list = employeedao.retrieveData();
		return list;
	}
	
	public Employee readEmployeeById(int id) {
		Employee employee = employeedao.retrieveDataById(id);
		return employee;
	}
	
	public int updateEmployee(Employee employee) {
		int i = employeedao.editData(employee);
		return i;
	}
	
	public int deleteEmployee(int id) {
		int i = employeedao.deleteData(id);
		return i;
	}
}
