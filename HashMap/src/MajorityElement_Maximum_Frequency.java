//import HashMapCode.HashMap;
import java.util.*;

public class MajorityElement_Maximum_Frequency {

	public static void main(String[] args) {
		int arr[] = {2,3,2,5,2,3,2,5,1,5,5,5};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		
		for(int i = 0; i < arr.length; i++) {
//			if(map.containsKey(arr[i])) {
//				map.put(arr[i], map.get(arr[i]) + 1);
//			}else {
//				map.put(arr[i], 1);
//			}
			//shortcut
			map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
		}
		//iterate on the map
//		Set<Integer> keyset = map.keySet();
//		shortcut
		for(Integer i:map.keySet()) {
			if(map.get(i) > arr.length/3 ) {
				System.out.println(i);
			}
		}
		

	}

}
