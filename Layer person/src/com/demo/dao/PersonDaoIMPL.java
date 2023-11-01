package com.demo.dao;
import com.demo.beans.Person;
public class PersonDaoIMPL implements PersonDao {
	static Person[] parr;
	static int count;
	static {
		parr=new Person[10];
		count=0;
		
	}
	public void save(Person p) {
		parr[count]=p;
		count++;
		
	}
	public void display() {
		for (int i=0;i<count;i++)
		{
			System.out.println(parr[i]);
		}
		
	}

}
