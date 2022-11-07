import java.util.*;

/*
6.Remove duplicates from a given array in Java.
 */
public class Question6 {
	public static void main(String[] args) {
		int numArray[]=new int[] {1,2,3,2,5,6,7,7,8,9};
		
		
		int j=remove(numArray, numArray.length);
		
		System.out.print("The array without duplicate numbers:");
		for(int i=0;i<j;i++) {
			System.out.print(" "+numArray[i]);
		}
	}
	
	private static int remove(int[] array, int n) {
		HashMap<Integer, Integer> map=new HashMap<>();
		int j=0;
		
		if(n==0 || n==1) {
			return n;
		}
		
		for(int i=0;i<n;i++) {
			if(!map.containsKey(array[i])) {
				map.put(array[i], 1);
				array[j++]=array[i];
			}
		}
		
		return j;
	}
}
