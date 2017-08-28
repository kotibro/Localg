package javaprograms1;

public class SortingSting {

	public static void main(String[] args) 
	{
		
		String s="rajakullai";
		char []s1=s.toCharArray();
		char temp=0;
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i]>s1[j])
				{
					temp=s1[j];
					s1[j]=s1[i];
					s1[i]=temp;
							
					
				}
						}
			System.out.print(s1[i]);

		}
		

	}

}
