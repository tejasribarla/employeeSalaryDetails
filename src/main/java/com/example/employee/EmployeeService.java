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
        employeeList.put(1, new Employee(1, "John", "Doe", "johndoe@example.com", 934798343L, 948938496L, "March-07", 250000));
        employeeList.put(2, new Employee(2, "Jane", "Smith","janesmith@example.com", 9837495834L, 9837498334L, "May-10", 450000));
        employeeList.put(3, new Employee(3, "Bob", "Johnson","bjohnson@example.com",978394873L, 98374928323L, "Oct-15", 700000));
        employeeList.put(4, new Employee(4, "Alice", "Lee", "alee@example.com", 398739847L, 978438734L, "Sep-30", 1000000));
    }

    // Do not modify the above code

    // Write your code here

     @Override
    public ArrayList<Employee>getEmployees() {
        Collection <Employee> employeeCollection=employeeList.values();
        ArrayList <Employee>employees=new ArrayList<>(employeeCollection);
        return employees;        
    }
    @Override
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeId(uniqueEmployeeId);
        employeeList.put(uniqueEmployeeId,employee);
        uniqueEmployeeId+=1;
        return employee;
    }
    
    
}