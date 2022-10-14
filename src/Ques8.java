/*
Reading Input and Printing
The input is read from stdin and printed to stdout. The challenges requires you to read
input from stdin and print to stdout.
Input can be read using the BufferedReader class or the Scanner class.
Input Format
The first line of input consist of a string.
Next 2 lines consist of an integer.
Constraints
1&lt;= |string| &lt;=10
1&lt;= Integer &lt;=50
Output Format
Print the input read to stdout in the similar format in separate lines.
Sample TestCase 1
Input
practice
10
Output
practice
10 
*/

import java.util.*;

public class Ques8 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string(1-10 char):");
		String text=scanner.nextLine();
		System.out.println("Enter an integer(1-50):");
		int number=scanner.nextInt();
		System.out.println("output");
		System.out.println(text);
		System.out.println(number);
	}
}
