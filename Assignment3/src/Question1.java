/*
1.Find the missing number in a given integer array of 1 to 100.
*/
public class Question1 {
	public static void main(String[] args) {
		int numArray[]=new int[99];
		numArray=assign(numArray);
		
		for(int i=1;i<100;i++) {
			if(numArray[i-1]!=i) {
				System.out.println("\nThe missing number is "+i);
			}
		}
		
	}
	private static int[] assign(int[] array) {
		for(int i=0;i<99;i++) {
			if(i+1!=30) {
				array[i]=i+1;
			}
			else {
				continue;
			}
		}
		return array;
	}
	

}
