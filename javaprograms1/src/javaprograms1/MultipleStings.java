package javaprograms1;

public class MultipleStings {

	public static void main(String[] args) {
		
		String []str={"raju","laxman","venkat","kullai"};
		for(int i=0;i<str.length;i++)
		{
			String s=str[i].substring(0, 2).toLowerCase()+str[i].substring(2, 3).toUpperCase()+str[i].substring(3).toLowerCase();
			System.out.print(s+" ");
			/*char [] ch=s.toCharArray();
			for(int j=0;j<=ch.length;j++)
			{
				if(Character.isUpperCase(ch)
				*/
			//}
			
		}

	}

}
