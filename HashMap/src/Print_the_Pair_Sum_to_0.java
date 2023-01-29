import java.util.HashMap;

public class Print_the_Pair_Sum_to_0 {

	public static int PairCount(int[]arr){
        int size = arr.length;
        if(size == 0) {
        	return 0;
        }
        
        int countPair = 0;
        //create HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(-i) && map.get(-i)!=0){
                //true or false && 
                //contain pair
                countPair = countPair + map.get(-i);
            }
            if(map.containsKey(i)){
                //present update here
                map.put(i,map.get(i) + 1);
            }else{
                //not present  add to the hashmap
                map.put(i,1);
            }
        }
        return countPair;
    }
    public static void main(String[] args) {
        // pair sum to 0
        int arr[] = {-2,-12,2,11,12,-2,1,-2,2,-11,12,2,6};
//    	int arr[] = {15,-2,2,-8,1,7,10,23};
//    	int arr[] = new int[0];
        int ans = PairCount(arr);
        System.out.println("Print the Pair Sum to 0=> "+ ans);
    }

}
