/*
7.Reverse an array in place in Java?
 */
public class Question7 {
	public static void main(String[] args) {
		int numArray[]=new int[] {4,6,2,8,3,10,1,9,5,7};
		int j=numArray.length, temp;
		
		System.out.println("Original array:");
		for(int i=0;i<numArray.length;i++) {
			System.out.print(" "+numArray[i]);
		}
		
		for(int i=0;i<numArray.length/2;i++) {
			temp=numArray[i];
			numArray[i]=numArray[j-1-i];
			numArray[j-1-i]=temp;
		}
		
		System.out.println("\nReversed array:");
		for(int i=0;i<numArray.length;i++) {
			System.out.print(" "+numArray[i]);
		}
	}
}
