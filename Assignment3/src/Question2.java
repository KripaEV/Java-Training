/*
2.Find the duplicate number on a given integer array.
 */
public class Question2 {
	public static void main(String[] args) {
		int numArray[]=new int[] {1,2,3,2,5,6,7,8,9,10};
		int dupArray[]=new int[10];
		int k=0;
		
		for(int i=0;i<numArray.length;i++) {
			for(int j=i+1;j<numArray.length;j++) {
				if(numArray[i]==numArray[j]) {
					dupArray[k]=numArray[i];
					k++;
				}
			}
		}
		
		System.out.print("The duplicate number:");
		for(int i=0;i<k;i++) {
			System.out.print(" "+dupArray[i]);
		}
	}


}
