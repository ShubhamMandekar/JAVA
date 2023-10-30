 package day5;

import java.time.LocalDate;

public class Vendor extends Employee {
	
private double amount;

public Vendor() {
	super();
}


public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public Vendor(int id, String name,int ag,int empid, int mobile, String email,LocalDate datejoin,double amount) {
	super(id,name,ag,empid,mobile,email,datejoin);
	this.amount = amount;
}

@Override
public String toString() {
	return super.toString()+"Vendor [amount=" + amount + "]";
}

public double calulateSal(){
	return amount;
}

  

}
