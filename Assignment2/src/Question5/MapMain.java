package Question5;

import java.util.*;

public class MapMain {

	public static void main(String[] args) {
		String[] stringArray=new String[]{"aaa","bb","aaa","c","bb","bb"};
		Map<String, Integer> map=new HashMap<>();
		int count=0;
		
		for(String str:stringArray) {
			if(!map.containsKey(str)) {
				//first occurrence
				map.put(str, 1);
			}
			else {
				count=map.get(str);
				map.put(str, count+1);
			}
		}
		System.out.println(map);
	}

}
