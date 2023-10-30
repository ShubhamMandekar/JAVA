package day5;

public class A {
	 int b;
	private final int i;
	
	public A(int b,int i) {
		this.b=b;
		this.i=i+2;
		
	}
	public A(int j)
	{
		i=j;
	}
	

	


	@Override
	public String toString() {
		return "A [b=" + b + ", i=" + i + "] ";
	}





	public static void main(String[] args) {
		
            A a=new A(29,30);
            System.out.println(a);
            A ob = new A(19);
            System.out.println(ob);
	}

}
