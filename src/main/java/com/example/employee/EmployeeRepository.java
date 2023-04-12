// Write your code here

package com.example.employee;
import com.example.employee.Employee;
import java.util.*;


public interface EmployeeRepository{
    ArrayList<Employee> getEmployees();
    Employee addEmployee(Employee employee);
}