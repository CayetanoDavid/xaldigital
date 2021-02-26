package com.example.xaldigital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "xal_digital_empleado")
public class Empleado {
	
	@Id
	@Column(name = "empleado_id")
	private int empleadoId;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String
	last_name;
	
	@Column(name = "company_name")
	private String
	company_name;
	
	@Column(name = "address_emp")
	private String
	address_emp;
	
	@Column(name = "city")
	private String
	city;
	
	@Column(name = "state_emp")
	private String
	state_emp;
	
	@Column(name = "zip")
	private String
	zip;
	
	@Column(name = "phone1")
	private String
	phone1;
	
	@Column(name = "phone2")
	private String
	phone2;
	
	@Column(name = "email")
	private String
	email;
	
	@Column(name = "department")
	private String
	department;

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getAddress_emp() {
		return address_emp;
	}

	public void setAddress_emp(String address_emp) {
		this.address_emp = address_emp;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState_emp() {
		return state_emp;
	}

	public void setState_emp(String state_emp) {
		this.state_emp = state_emp;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
