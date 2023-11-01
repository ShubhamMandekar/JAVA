package com.demo.beans;

public class Person {

		private int pid;
		private int age;
		private String name;
		
		
		public Person() {
			pid=0;
			age=0;
			name=null;
		}
		
		public Person(int pid, int age, String name) {
			super();
			this.pid = pid;
			this.age = age;
			this.name = name;
		}

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Person [pid=" + pid + ", age=" + age + ", name=" + name + "]";
		} 
	
		
		
		
		
		

}
