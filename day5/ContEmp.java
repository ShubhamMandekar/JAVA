package day5;

import java.time.LocalDate;

public class ContEmp extends Employee{
private int hrs;
private int rate;

public ContEmp()
{
	super();
	}
public ContEmp(int id, String name,int ag,int empid, int mobile, String email,LocalDate datejoin,int hrs, int rate) {
	super(id,name,ag,empid,mobile,email,datejoin);
	this.hrs = hrs;
	this.rate = rate;
}
public int getHrs() {
	return hrs;
}
public void setHrs(int hrs) {
	this.hrs = hrs;
}
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
public double calulateSal()
{
   return hrs*rate;	
}

@Override
public String toString() 
{
	return super.toString()+"ContEmp [hrs=" + hrs + ", rate=" + rate + "]";
}

}
