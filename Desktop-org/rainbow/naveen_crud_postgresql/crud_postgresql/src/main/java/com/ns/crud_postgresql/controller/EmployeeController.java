package com.ns.crud_postgresql.controller;

import com.ns.crud_postgresql.dao.EmployeeRepo;
import com.ns.crud_postgresql.model.Employee;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/Employees")
    public List<Employee> getEmployee() {
        return employeeRepo.findAll();
    }

    @GetMapping("/Employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {

        Optional<Employee> employee = employeeRepo.findById(id);

        return employee.get();

    }

    @DeleteMapping("/Employees/{id}")
    public Employee deleteEmployeeById(@PathVariable int id) {

        Optional<Employee> employee = employeeRepo.findById(id);

        employeeRepo.delete(employee.get());

        return employee.get();
    }

    @PutMapping("/Employees")
    public Employee editEmployee(@RequestBody Employee emp) {

        return employeeRepo.save(emp);

    }

    @PostMapping("/Employees")
    public Employee saveEmployee(@RequestBody Employee emp) {
        return employeeRepo.save(emp);

    }

}
