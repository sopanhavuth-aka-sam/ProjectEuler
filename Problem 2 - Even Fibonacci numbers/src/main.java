
import java.util.*;
public class main {

	/**
	 * Project Euler; Problem 2: sum of even fibonacci numbers under 4 millions.
	 * 
	 * Author: Sopanhavuth Som of CSULB
	 */
	public static void main(String[] args) {
		
		int sum = 0;
		int n1 = 0;// n1 and n2 are starting number; 0,1,1,2,3,5,8,13,...
		int n2 = 1;
		int n3 = 0;// n3 is placeholder when switching n1 and n2
		Scanner input = new Scanner(System.in);
		
		//requesting input
		System.out.println("Sum of even fibonacci numbers under: ");
		int max = input.nextInt();
		//END	requesting input
		
		while(n2<=max){
			
			//Sum if new fibonacci is even
			if(n3%2==0){
				sum = sum + n3;
			}//END	Sum
			
			// new fibonacci number
			n3 = n1 + n2; 
			
			//switching
			n1 = n2;
			n2 = n3;
			//END	switching
		}
		
		System.out.printf("The sum of even fibonacci number under %d is %d",max,sum);
	}

}
