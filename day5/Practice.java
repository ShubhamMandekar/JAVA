package day5;

abstract public class Practice {
	
	
	public Practice(){
		
		System.out.println("calling parent default");
	}
   public void f1()
   {
	   System.out.println("pARENT METHOD");
   }
	public static void main(String[] args) {
		 Practice p=new Child();
		 p.f1(); 
		 ((Child)p).f2();         
	}

}

class Child extends Practice{
	
public Child(){
		
		System.out.println("calling child default");
	}
	
	public void f1() {
		System.out.println("calling child class method");
	}
	public void f2() {
		System.out.println("calling child class f2 method");
	}
}
