package day5;

public class Person 
{
	private int pid;
	private String pName;
	private int age;
	
   public Person()
    {
       super();
    }
     public Person(int id, String name,int ag)
     {
    	 pid=id;
    	 pName=name;
    	 age=ag;
     }
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Person [pid=" + pid + ", pName=" + pName + ", age=" + age + "]";
	}
     
     
     
}
