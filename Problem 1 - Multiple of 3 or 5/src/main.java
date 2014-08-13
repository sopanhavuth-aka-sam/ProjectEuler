
import java.util.*;
public class main {

	/**
	 * Project Euler; Problem 1: sum of multiples of 3 or 5 from 1 to 1000
	 * 
	 * Author: Sopanhavuth Som of CSULB
	 */
	public static void main(String[] args) {
		
		int sum = 0;
		Scanner input = new Scanner(System.in);

		//user input for range
		System.out.println("Find multiples of 3 or 5 between number(minimum): ");
		int min = input.nextInt();
		System.out.println("and number(maximum): ");
		int max = input.nextInt();
		//END	user input for range
		
		//computation
		for(int i=min; i<max ;i++){
			if((i%3==0)||(i%5==0)){
				sum = sum + i;
			}
		}
		//END 	computation
		
		System.out.printf("The sum of multiples of 3 or 5 between %d and %d is %d.", min, max, sum);
	}

}
