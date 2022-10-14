/*
Conversion
The conversion can be of two types - Explicit or Implicit. Sometimes the conversions are
necessary to get the desired output. This challenge is to test if you can successfully
convert an integer to a string or not.
Input Format
The only line of input consist of an integer, N
Constraints
-20 <= N <= 20
Output Format
Print Successful Conversion if the integer is Successfully converted else print Conversion
Unsuccessful.
Sample TestCase 1
Input
10
Output
Conversion Successful
*/

import java.util.*;

public class Ques2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		Integer N=scanner.nextInt();
		String type=Integer.toString(N);
		if(type instanceof String) {
			System.out.println("Conversion successful");
		}
		else {
			System.out.println("Conversion unsuccessful");
		}

	}

}
