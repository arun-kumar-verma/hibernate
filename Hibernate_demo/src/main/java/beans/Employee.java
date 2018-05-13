package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
@Id
private int empid;
private String empname;
@Column(name="empdsg")
private String empdesignation;
private int empsalary;
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpdesignation() {
	return empdesignation;
}
public void setEmpdesignation(String empdesignation) {
	this.empdesignation = empdesignation;
}
public int getEmpsalary() {
	return empsalary;
}
public void setEmpsalary(int empsalary) {
	this.empsalary = empsalary;
}



}
