package day5;

import java.time.LocalDate;

public class SalEmp extends Employee{
private double basicSal;
private double bonus;


public SalEmp()
{
super();	
}
public SalEmp(int id, String name,int ag,int empid, int mobile, String email,LocalDate datejoin,double basicSal, double bonus) {
	super(id,name,ag,empid,mobile,email,datejoin);
	this.basicSal = basicSal;
	this.bonus = bonus;
}


public double getBasicSal() {
	return basicSal;
}
public void setBasicSal(double basicSal) {
	this.basicSal = basicSal;
}
public double getBonus() {
	return bonus;
}
public void setBonus(double bonus) {
	this.bonus = bonus;
}
  
public double calulateSal() {
     return basicSal+bonus;

}


@Override

public String toString() {
	return super.toString()+"SalEmp [basicSal=" + basicSal + ", bonus=" + bonus + "]";
}


}
