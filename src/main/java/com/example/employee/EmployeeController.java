/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here

package com.example.employee;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController

public class EmployeeController{
    EmployeeService employeeService= new EmployeeService();

    @GetMapping("/employees")
    public ArrayList<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
}
    