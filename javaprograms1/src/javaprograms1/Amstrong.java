package javaprograms1;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		
		
		//System.out.println("Enter a value");
		//Scanner s=new Scanner(System.in);
		//int n=s.nextInt();
		
		
		for(int j=1;j<5000;j++){
			int count=0,r,sum=0,n;
			//int temp=n;
			n=j;
		while(n!=0){
			n=n/10;
			count++;
			
		}
		//System.out.println(count);
		//n=temp;
		n=j;
		while((n!=0))
		{
			r=n%10;
			int mul=1;
			for(int i=1;i<=count;i++)
			{
				mul=mul*r;
				
				
				}
			sum=sum+mul;
			
			n=n/10;
			}
		if(j==sum)
		{
			System.out.println("is am    "+sum);
			
		}
		}
		
	
		
	}

}
