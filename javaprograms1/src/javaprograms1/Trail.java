package javaprograms1;

public class Trail {
	//static int a=10;
	static int a =10;
	public void name(int a)
	{
	}
	public void name(float a)
	{
	}

	public static void main(String[] args) {
		
		Trail s = new Trail();
		Trail s1 = new Trail();
		s.a++;
		System.out.println(s.a); 
		s1.a++;
		System.out.println(s.a); //12
		System.out.println(s1.a); //12

	}

}
