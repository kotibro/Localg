package DemoConstorruct;

public class Parent {
	
	
	
	String color="blue";
	
	
	int id2;  
	String name2;  
	
	public Parent()
	{
		System.out.println("This is perent Class constructor");
		//System.out.println("id"+id2+"name="+name2);
	}

	
	
public Parent(int id, String name) {
		this.id2=id;
	    this.name2=name;
		System.out.println("id"+id+"name="+name);

	}

	public void m()
	{
		System.out.println("this is parent method");
	}
	
	
	public static void main(String[] args) {
		Parent p=new Parent();
		Parent p1=new Parent(10,"ab");
		
		
	
		
	}

	

}
