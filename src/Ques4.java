/*
GOOD or BAD
In a village in UP, a number n is considered GOOD if it is completely divisible by 2
otherwise it is considered to be BAD. Can you tell whether the given number is GOOD or
BAD ?
Input Format
The only line of input consist of a number N.
Constraints
1&lt;= N &lt;=100
Output Format
Print whether the number if GOOD or BAD.
Sample TestCase 1
Input
32
Output
GOOD
 */

import java.util.*;

public class Ques4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scanner.nextInt();
		if(num%2==0) {
			System.out.println("GOOD");
		}
		else {
			System.out.println("BAD");
		}

	}

}
