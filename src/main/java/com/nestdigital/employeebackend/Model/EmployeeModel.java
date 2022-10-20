package com.nestdigital.employeebackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class EmployeeModel {
    @Id
    @GeneratedValue

    private int id;
    private int employeeCode;
    private String name;
    private String address;
    private int salary;
    private String company;
    private String dateOfJoining;
    private int experiance;
    private String designation;
    private String dob;

    public EmployeeModel() {
    }

    public EmployeeModel(int id, int employeeCode, String name, String address, int salary, String company, String dateOfJoining, int experiance, String designation, String dob) {
        this.id = id;
        this.employeeCode = employeeCode;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.company = company;
        this.dateOfJoining = dateOfJoining;
        this.experiance = experiance;
        this.designation = designation;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}