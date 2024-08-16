package com.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;
	private String EmployeeName;
	private String emailId;
	private String mobileNumber;
	private LocalDate hiredate;
	private Integer jobId;
	private Double salary;
	private String designation;
	
	
    
	@ManyToOne
	@JoinColumn(name="departmentId")
	private Department department;
	
	private String skills;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	

	public Employee(Integer employeeId, String employeeName, String emailId, String mobileNumber, LocalDate hiredate,
			Integer jobId, Double salary, String designation, Department department, String skills) {
		super();
		this.employeeId = employeeId;
		EmployeeName = employeeName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.hiredate = hiredate;
		this.jobId = jobId;
		this.salary = salary;
		this.designation = designation;
		this.department = department;
		this.skills = skills;
	}



	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	

	
	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}



	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", EmployeeName=" + EmployeeName + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + ", hiredate=" + hiredate + ", jobId=" + jobId + ", salary="
				+ salary + ", designation=" + designation + ", department=" + department + ", skills=" + skills + "]";
	}
	
	

	
	
	

}
