package javaprograms1;

public class SumOfDigits {

	public static void main(String[] args) {
		
		
		
		int n=123,sum=0,r;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
			
		}
		System.out.println(sum);

	}

}
