/*
 * You can use the following import statements
 * 
 * import org.springframework.web.server.ResponseStatusException;
 * import org.springframework.http.HttpStatus;
 * 
 */


package com.example.employee;

import com.example.employee.Employee;
import com.example.employee.EmployeeRepository;

import java.util.*;
 

// Do not modify the below code

public class EmployeeService implements EmployeeRepository {

    private static HashMap<Integer, Employee> employeeList = new HashMap<>();
    int uniqueEmployeeId=5;

    public EmployeeService() {
        employeeList.put(1, new Employee(1, "John", "Doe",250000, 0, 0));
        employeeList.put(2, new Employee(2, "Jane", "Smith",450000, 12500, 0));
        employeeList.put(3, new Employee(3, "Bob", "Johnson",750000, 37500,0));
        employeeList.put(4, new Employee(4, "Alice", "Lee",1000000,100000,0 ));
    }

    // Do not modify the above code

    // Write your code here

     @Override
    public ArrayList<Employee> getEmployees() {
        Collection <Employee> employeeCollection=employeeList.values();
        ArrayList <Employee>employees=new ArrayList<>(employeeCollection);
        return employees;

    }
       
    
}