package com.example.employee;

public class Employee {
    private int EmployeeId;
    private String FirstName;
    private String LastName;
    private int salary;
    private int TaxAmount;
    private int CessAmount;
    public Employee(int EmployeeId, String FirstName, String LastName,int salary, int TaxAmount, int CessAmount) {
        this.EmployeeId=EmployeeId;
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.salary=salary;
        this.TaxAmount=TaxAmount;
        this.CessAmount=CessAmount;
    }
    public int getEmployeeId(){
        return this.EmployeeId;
    }
    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId=EmployeeId;
    }
    public String getFirstName(){
        return this.FirstName;
    }
    public void setFirstName(String FirstName) {
        this.FirstName=FirstName;
    }
    public String getLastName(){
        return this.LastName;
    }
    public void setLastName(String LastName) {
        this.LastName=LastName;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary=salary;
    }
    public int getTaxAmount(){
        return this.TaxAmount;
    }
    public void setTaxAmount(int TaxAmount){
        this.TaxAmount=TaxAmount;
    }

    public int getCessAmount(){
        return this.CessAmount;
    }
    public void setCessAmount(int CessAmount) {
        this.CessAmount=CessAmount;
    }




}
