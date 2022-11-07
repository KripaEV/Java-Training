/*
5.Find duplicate numbers in an array if it contains multiple duplicates.
 */
public class Question5 {
	public static void main(String[] args) {
		int numArray[]=new int[] {1,2,3,2,5,6,7,7,8,9};
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
		
		System.out.print("The duplicate numbers:");
		for(int i=0;i<k;i++) {
			System.out.print(" "+dupArray[i]);
		}
	}
}
