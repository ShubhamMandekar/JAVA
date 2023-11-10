package com.demo.beans;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	static List<friends> fl=new ArrayList<>();
	public void readData()
	{

		try(BufferedReader br=new BufferedReader(new FileReader("data.txt")))
				{
				
			     String str=br.readLine();
			     while(str!=null)
			     
			     {
			    	 String[] arr=str.split(",");
			    	 fl.add(new friends(Integer.parseInt(arr[0]),arr[1],arr[2]));
			     str=br.readLine();
			    	 
			    	 
			     }
			     System.out.println(fl);
			     
			       
			
				}catch(IOException e) {
					System.out.println("end of file");
				}	
	}
	
	public void WriteData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Name");
		String name = sc.next();
		System.out.println("City");
		String city = sc.next();
		
		friends fa = new friends(id,name,city);
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("data1.txt"))){

			bw.write(fa.toString());
		} catch (IOException e) {
			System.out.println("Error");
		}

	}
	public static void main(String[] args) {
		
		
		Test t = new Test();
		t.WriteData();
		t.WriteData();
		
		

		

		
		
	}

}
