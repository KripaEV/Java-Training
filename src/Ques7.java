/*
What is the SIZE?
Rohan wants to buy a t-shirt for him. The problem is there are numbers written on t-shirts
but not the size. He saw a chart according to which SMALL, MEDIUM and LARGE are
labeled. He needs you to write a program for him so that he could the right t-shirt.

RANGE	SIZE
1-30	SMALL
31-60	MEDIUM
61-100	LARGE

Input Format
The only line of input consists of a number, N

Constraints
1<= N <=100
Output Format
Print SMALL, MEDIUM or LARGE based on the number provided.

Sample TestCase 1
Input
20
Output
SMALL
 */

import java.util.*;

public class Ques7 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=scanner.nextInt();
		if(size>=1 && size<=30) {
			System.out.println("SMALL");
		}
		else if(size>=31 && size<=60) {
			System.out.println("MEDIUM");
		}
		else if(size>=61 && size<=100) {
			System.out.println("LARGE");
		}
		else {
			System.out.println("Invalid size");
		}

	}

}
