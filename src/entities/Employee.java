package entities;

import entities.enums.EmployeeLevel;

public class Employee {
	
//ATTRIBUTES
	private String name;
	private EmployeeLevel level;
	private double baseSalary;
	//COMPOSITIONS
	private Department department;
	
//CONSTRUCTORS
	public Employee(String name, EmployeeLevel level, double baseSalary) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
	}
	
//GETS & SETS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmployeeLevel getLevel() {
		return level;
	}
	public void setLevel(EmployeeLevel level) {
		this.level = level;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	

}
