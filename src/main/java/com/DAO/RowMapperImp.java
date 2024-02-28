package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Entity.Employee;

public class RowMapperImp implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setId(rs.getInt(1));
		employee.setName(rs.getString(2));
		employee.setAddress(rs.getString(3));
		employee.setEmail(rs.getString(4));
		employee.setPassword(rs.getString(5));
		employee.setDesignation(rs.getString(6));
		employee.setSalary(rs.getString(7));
		return employee;
	}

}
