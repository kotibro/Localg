package javaprograms1;

public class SortingNumbers {

	public static void main(String[] args) { 
		
		int a[]={3,8,4,6,1,2,6};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
							
					
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
		
		
		
		
		
		

	}

}
