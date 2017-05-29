
	import java.util.Scanner;
	public class primee {

		public static void main (String args[]){
		
		
			
			
			boolean IsPrime=true;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a number");
			
			int num=scan.nextInt();
			for(int i=2; i<=num/2; i++)
			{
				int fill=num%i;
				if(fill==0)
				{
					IsPrime=false;
					break;
				
				}
				
			}
			if(IsPrime){
				System.out.println(num + " " + "Is a prime number");
			}
			else{
				System.out.println(num + " " + "is not a prime number");
			}
		}
	}




