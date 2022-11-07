/*
3.Find the largest and smallest number in an unsorted integer array.
 */
public class Question3 {
	public static void main(String[] args) {
		int numArray[]=new int[] {4,6,2,8,3,10,1,9,5,7};
		int small=numArray[0];
		int large=numArray[0];
		
		for(int i=0;i<numArray.length;i++) {
			if(numArray[i]<=small) {
				small=numArray[i];
			}
			else if(numArray[i]>large) {
				large=numArray[i];
			}
			else {
				continue;
			}
		}
		System.out.println("The smallest number:"+small);
		System.out.println("The largest number:"+large);
	}

}
