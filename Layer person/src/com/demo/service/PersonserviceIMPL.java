package com.demo.service;
import java.util.Scanner;
import com.demo.beans.Person;
import com.demo.dao.PersonDao;
import com.demo.dao.PersonDaoIMPL;

public class PersonserviceIMPL implements Personservice {

	PersonDao pd;
	public PersonserviceIMPL() {
		pd=new PersonDaoIMPL();
	}
	
	public void createPerson() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter Person id");
		int ID= sc.nextInt();
		System.out.println("eneter age of person");
		int AGE = sc.nextInt();
		sc.nextLine();
		
		System.out.println("person name");
		String name= sc.nextLine();
		Person p= new Person(ID,AGE,name);
		pd.save(p);
		
	}
	
	public void display_all() {
		pd.display();
	}
}
