package javaprograms1;

import java.util.ArrayList;

public class Findeve {

	public static void main(String[] args) {
		
		
		int a=23498;
		String d=String.valueOf(a);
		char c[]=d.toCharArray();
		int s=c.length-1;
		System.out.println(c[s]);
		
	    ArrayList al=new ArrayList();
	    al.add(0);
	    al.add(2);
	    al.add(4);
	    al.add(6);
	    al.add("8");
	    boolean retval =al.contains(c[s]);
	    System.out.println(retval);
	    if(retval == true)
	    {
	    	System.out.println("evennumber");
	    }
	    else
	    {
	    	System.out.println("odd number");
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
