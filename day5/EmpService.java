package day5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmpService {
	
	static Employee[] empArr;
	static int indCnt;
	static 
	{
		empArr=new Employee[10];
		empArr[0]=new SalEmp(1,"Kunal",22,100,9834,"kunal@gmail",LocalDate.of(2023,10,15),10000,500);
		empArr[1]=new SalEmp(2,"Aditya",24,200,8834,"adi@gmail",LocalDate.of(2022,9,12),20000,600);
		empArr[2]=new ContEmp(3,"Vikram",28,300,8784,"vikram@gmail",LocalDate.of(2012,8,10),10,500);
		empArr[3]=new ContEmp(4,"Pratham",21,400,6834,"pratham@gmail",LocalDate.of(2022,5,14),10,1200);
		indCnt=4;
	}

	public static void createEmp()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter id");
		int id =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		String name =sc.nextLine();
		System.out.println("Enter age");
		int age =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter empid");
		int empid =sc.nextInt();
		System.out.println("Enter mobile");
		int mobile =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter email");
		String email =sc.nextLine();
		System.out.println("Enter joining date");
		String doj =sc.next();
		LocalDate ldt=LocalDate.parse(doj,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("1 for salared emp");
		System.out.println("2 for contract emp");
		int opt =sc.nextInt();
		
		switch(opt)
		{
		case 1:
		{
			System.out.println("Enter basic sal");
			double basicSal =sc.nextDouble();
			System.out.println("Enter bonus");
			double bonus =sc.nextDouble();
			
			SalEmp se = new SalEmp(id,name,age,empid,mobile,email,ldt,basicSal,bonus);
			empArr[indCnt]=se;
			indCnt++;
			break;
		}
		case 2:
		{
			System.out.println("Enter hours");
			int h=sc.nextInt();
			System.out.println("Enter charges");
			int ch=sc.nextInt();
			ContEmp ce=new ContEmp(id,name,age,empid,mobile,email,ldt,h,ch);
			empArr[indCnt]=ce;
			indCnt++;
			break;
		}
		}
		
	}
	
	public static void displayAll()
	{
		for(int i=0;i<=indCnt;i++)
		{
			System.out.println(empArr[i]);
		}
	}
	
	public static void searchByPid()
	{
		System.out.println("Enter Id to be searched :");
		Scanner sc = new Scanner(System.in);
		int sid = sc.nextInt();
		int i;
		boolean flag=false;
		for(i=0;i<indCnt;i++)
		{
			if(sid==empArr[i].getPid())
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(empArr[i]);
		}
		else {
			System.out.println("Pid not Found");
		}

	}
	
	public static void calSalById()
	{
		System.out.println("Enter Id to be searched to find Sal :");
		Scanner sc = new Scanner(System.in);
		int sid = sc.nextInt();
		int i;
		boolean flag =false;
		for(i=0;i<indCnt;i++)
		{
			if(sid==empArr[i].getPid())
			{
                flag=true;
				break;
			}
		}
		if(true)
		{
			   if (empArr[i] instanceof SalEmp) {
				   System.out.println(((SalEmp)empArr[i]).calulateSal());
			   }
			   else if(empArr[i] instanceof ContEmp)
				{
					System.out.println(((ContEmp)empArr[i]).calulateSal());
				}
			   
		}
		else {
			System.out.println("Id not found to calulate salary");
		}
		
	}
	
	public static void modifySalById() {
		boolean flag =false;
		int i;
		for(i=0;i<indCnt;i++) {
			System.out.println("Enter Id to be searched to find Sal :");
			Scanner sc = new Scanner(System.in);
			int sid = sc.nextInt();
			if(sid==empArr[i].getPid())
			{
                flag=true;
				break;
			}
		}
		
		if(flag) {
			if(empArr[i] instanceof SalEmp) {
				((SalEmp)empArr[i]).setBasicSal(s);
				
				
			} else if(empArr[i] instanceof ContEmp) {
				syso((ContEmp)empArr[i]).setRate(s1);
			}
		}
	}
}
