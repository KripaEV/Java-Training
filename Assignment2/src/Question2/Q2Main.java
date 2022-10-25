package Question2;

public class Q2Main {

	public static void main(String[] args) {

		//widening type casting(implicit)
		//int to double

		System.out.println("Implicit typecasting");
		int intNum=10;
		System.out.println("Value in integer:"+intNum);

		double doubleNum =intNum;
		System.out.println("Value in double:"+ doubleNum);

		//narrowing type casting(explicit)
		//double to int

		System.out.println("\nExplicit typecasting");
		double dNum=25.5;
		System.out.println("Value in double:"+dNum);
		int iNum=(int) dNum;
		System.out.println("Value in integer:"+iNum);

		}

}
