/*
You just need to read 5 strings from stdin and print them to stdout.
Input Format
Read 5 strings with one string on each line.
Constraints
1 <=|S|<=10^5
Output Format
Print your strings to the stdout with each string in each line.
Sample TestCase 1
Input
I am awesome.
How are you?
I m Fine.
Ok
Same Here
Output
I am awesome.
How are you?
I m Fine.
Ok
Same Here
*/
import java.util.*;

public class Ques1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 5 strings");
		String[] lines=new String[5];
		for(int i=0;i<lines.length;i++) {
			lines[i]=scanner.nextLine();
			
		}
		System.out.println("Output");
		for(int i=0;i<lines.length;i++) {
			System.out.println(lines[i]);
		}
	}

}
