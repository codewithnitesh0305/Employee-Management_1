package com.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.Entity.Employee;

@Repository
public class EmployeeDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//Save Employee Information from Database
	public int saveData(Employee employee) {
		String query = "insert into Employee_1(Name,Address,Email,Password,Designation,Salary) values(?,?,?,?,?,?)";
		int i = jdbcTemplate.update(query,employee.getName(),employee.getAddress(),employee.getEmail(),employee.getPassword(),employee.getDesignation(),employee.getSalary());
		return i;
	}
	
	//Retrieve Information from Database
	public List<Employee> retrieveData(){		
		String query = "select * from employee_1";
		List<Employee> list = jdbcTemplate.query(query, new RowMapperImp());
		return list;		
	}
	
	//Retrieve Information from database by id
	public Employee retrieveDataById(int id) {
		String query = "select * from employee_1 where id = ?";
		RowMapper<Employee> rowMapper = new RowMapperImp();
		Employee employee = jdbcTemplate.queryForObject(query, rowMapper,id);
		return employee;			
	}
	
	//Edit Information of Employee
	public int editData(Employee employee) {
		String query = "Update employee_1 set name = ? , address = ? , email = ? ,password = ? , designation = ?, salary = ? where id = ?";
		int i = jdbcTemplate.update(query,employee.getName(),employee.getAddress(),employee.getEmail(),employee.getPassword(), employee.getDesignation(),
				employee.getSalary(),employee.getId());
		return i;
	}
	
	//Delete Information from database
	public int deleteData(int id) {
		String query = "delete from employee_1 where id = ?";
		int i = jdbcTemplate.update(query,id);
		return i;
	}
}
