package com.demo.test;
import com.demo.service.*;
public class PersonTest {

	public static void main(String[] args) {
	Personservice ps=  new PersonserviceIMPL();
	ps.createPerson();
	ps.createPerson();
	ps.display_all();
	

	}

}
