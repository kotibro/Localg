package DemoConstorruct;

public class child extends Parent{
	
	String color="blue";
	int marks;
	
	
	

	public child(int id,String name,int marks){
	    super(id, name);
		this.marks=marks;
		
	}

	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
		super.m();
		System.out.println(id2+"   "+name2+"  "+marks);
		
	}
	public void m()
	{
		System.out.println("This is chid class mehode");
	}
	
	
	public static void main(String[] args) {
		
	    child c=new child(1,"raju",22);
	    c.display();
	    c.m();
	

	}

}
