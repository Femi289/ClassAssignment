import java.util.Scanner;
public class Prime {
	public static void main(String args[]){
		System.out.println("Enter the number");
		int limit =new Scanner (System.in);
		System.out.println("print number from 1 to");
		for(int number=2; number<=limit;number++){
			if(isPrime (number)){
				System.out.println(number)
			}
		}
	}

}
