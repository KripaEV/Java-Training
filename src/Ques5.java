/*
MULTIPLY
Aahan is doing homework where he has to find the product of N integers. The problem is,
he missed the class of MULTIPLICATION and doesn't know how to do it. Can you write
a code to help him?
Input Format
The first line of input consist of number of integers, N.
The second line of input consist of N space separated integers.
Constraints
1<= N <=10
1<= Integer <=25

Output Format
Print the product of N integers.
Sample:
Input: 5
1 2 3 4 5
Output: 120
 */

import java.util.*;

public class Ques5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of integers:");
		int size=scanner.nextInt();
		int[] intArray=new int[size];
		System.out.println("Enter the integers:");
		for(int i=0;i<size;i++) {
			intArray[i]=scanner.nextInt();
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
		int prod=1;
		System.out.println("Output:");
		for(int i=0;i<size;i++) {
			prod*=intArray[i];
		}
		System.out.println(prod);
	}

}
