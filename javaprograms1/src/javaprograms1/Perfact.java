package javaprograms1;

public class Perfact {

	public static void main(String[] args) {
		
		
		int  number;
		for(int i=1;i<1000;i++){
		 int temp = 0;
		     number=i;
	        for(int j=1;j<=number/2;j++){
	            if(number%j == 0){
	                temp=temp+j;
	            }
	            if(temp==number)
	            {
	            	System.out.println("per "+number);
	            }
	        }
		}

	}

}
