package javaprograms1;

public class Palindromnumbers {

	public static void main(String[] args) {
		//System.out.println("Palindrome");
		
		for (int i=0;i<1001;i++)
		{
		int n=i,rev=0,r;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			
		}
		
		if (i==rev)
			System.out.println("Palindrome number  "+i);
		
		
		}
	}
}
