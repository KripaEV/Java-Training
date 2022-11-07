/*
4.Find all pairs of an integer array whose sum equals a given number.
 */
public class Question4 {
	public static void main(String[] args) {
		int numArray[]=new int[] {4,6,2,8,3,10,1,9,5,7};
		int sum=7;//let's assume
		
		System.out.println("Pairs that make up "+sum);
		for(int i=0;i<numArray.length;i++) {
			for(int j=i;j<numArray.length;j++) {
				if(numArray[i]+numArray[j]==sum) {
					System.out.println("("+numArray[i]+","+numArray[j]+")");
				}
			}
		}
	}

}
