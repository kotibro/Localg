package javaprograms1;

public class firsthigt {

	public static void main(String[] args) {
		int [] a={11,2,16,12,4,10};
		   /*int second;
		   int first=0;
		   for(int i=0;i<a.length;i++)
		   {
			   if(first>a[i]){
				   second=first;
				   first=a[i];
			   }
				  
				  else if(second>a[i]) {
					   second=a[i];
					   
				   }
				  }
		   System.out.println(first);
		   System.out.println(second);
*/
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[a.length-2]+" ");
		}
		
		
		
	}

}
