package com.example.employee;

public class Employee {
    private int EmployeeId;
    private String FirstName;
    private String LastName;
    private String email;
    private long PhoneNum;
    private long PhoneNum2;

    private String DOJ;
    private int salary;
    public Employee(int EmployeeId, String FirstName, String LastName, String email, long PhoneNum, long PhoneNum2, String DOJ, int salary) {
        this.EmployeeId=EmployeeId;
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.email=email;
        this.PhoneNum=PhoneNum;
        this.PhoneNum2=PhoneNum2;
        this.DOJ=DOJ;
        this.salary=salary;
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
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public long getPhoneNum(){
        return this.PhoneNum;
    }
    public void setPhoneNum(long PhoneNum){
        this.PhoneNum=PhoneNum;
    }
    public long getPhoneNum2() {
        return this.PhoneNum2;
    }
    public void setPhoneNum2(long PhoneNum2){
        this.PhoneNum2=PhoneNum2;
    }
    public String getDOJ(){
        return this.DOJ;
    }
    public void setDOJ(String DOJ){
        this.DOJ=DOJ;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary=salary;
    }


}
