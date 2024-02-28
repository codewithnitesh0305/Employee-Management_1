package com.springcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.EmployeeService.EmpService;
import com.Entity.Employee;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@Autowired
	private EmpService empService;
	
	@RequestMapping("/home")
	public String home(Model model) {
		//System.out.println("Home controller");
		List<Employee> list =  empService.readEmployee();
		model.addAttribute("emplist",list);
		return "home";
	}
	
	@RequestMapping("/addEmp")
	public String addEmp() {
		//System.out.println("Add Employee controller");
		return "addEmp";
	}
	
	@RequestMapping(path="createEmp", method= RequestMethod.POST)
	public String employeeDataHandler(@ModelAttribute("Employee") Employee employee, HttpSession session) {
		//System.out.println(employee);
		int i = empService.createEmployee(employee);
		
		session.setAttribute("msg", "Register Successfully");
		return "redirect:/addEmp";
	}
	
	@RequestMapping(path="/editEmp/{id}")
	public String editEmp(@PathVariable("id") int id, Model model) {
		Employee employee = empService.readEmployeeById(id);
		//System.out.println(employee);
		model.addAttribute("emp" ,employee);
		return "editEmp";
	}
	
	@RequestMapping(path="/updateEmp", method=RequestMethod.POST)
	public String updateEmp(@ModelAttribute Employee employee,HttpSession session) {
		empService.updateEmployee(employee);
		session.setAttribute("msg","Update Successfully");
		return "redirect:/home";
	}
	@RequestMapping(path="/deleteEmp/{id}")
	public String deleteEmp(@PathVariable("id") int id, HttpSession session) {
		int i = empService.deleteEmployee(id);
		session.setAttribute("msg", "Delete Data Successfully");
		return "redirect:/home";
	}
}
