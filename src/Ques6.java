/*
SUMMATION
Rohan wants to find the summation of N integers. But he don&#39;t know how to do that. Can
you Help Rohan find the summation ?
Input Format
The first line of input consists of number of integers, N.
The second line of input consist of N space separated integers.
Constraints
1<= N <=10
1<= Ai <=50
Output Format
Print the summation of N integers.
Sample TestCase 1
Input
5
1 2 3 4 5
Output
15
 */

import java.util.*;

public class Ques6 {

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
		int sum=0;
		System.out.println("Output:");
		for(int i=0;i<size;i++) {
			sum+=intArray[i];
		}
		System.out.println(sum);

	}

}
