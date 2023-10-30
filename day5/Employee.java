package day5;

import java.time.LocalDate;

abstract public class Employee extends Person{
private int empid;
private int mobile;
private String email;
private LocalDate datejoin;

public Employee()
{
	super();
	
}
public Employee(int id, String name,int ag,int empid, int mobile, String email,LocalDate datejoin) {
	super(id,name,ag);
	this.empid = empid;
	this.mobile = mobile;
	this.email = email;
	this.datejoin=datejoin;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

abstract public double calulateSal();

@Override
public String toString() {
	return super.toString()+"Employee [empid=" + empid + ", mobile=" + mobile + ", email=" + email + "]";
}


}
