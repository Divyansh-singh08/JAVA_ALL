import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Print_the_Intersection_btw_two_array {

	public static void intersection(int[]arr1,int[]arr2){
        //using hash_map
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr1.length; i++){
            //condition
            if(map.containsKey(arr1[i])){
                //update the size
                int size = map.get(arr1[i]);
                map.put(arr1[i],size+1);
            }else{
                //new element
                map.put(arr1[i],1);
            }
        }
        
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int j = 0; j < arr2.length; j++){
            //condition
            if(map2.containsKey(arr2[j])){
                //update the size
                int siz = map2.get(arr2[j]);
                map2.put(arr2[j],siz+1);
            }else{
                //new element
                map2.put(arr2[j],1);
            }
        }
        
        ArrayList<Integer> arrans = new ArrayList<>();
        //for iteration we can use Set<Integer> /keySet() function
        for(Integer key : map.keySet()){
            //condition
            if(map2.containsKey(key)){
                //present in both
                //check with condition bcz we need to check how may time
                while(map.get(key) > 0 && map2.get(key) > 0){
                    arrans.add(key);//add it to array_list
                    int m1 = map.get(key);
                    int m2 = map2.get(key);
                    map.put(key,m1-1); //update the let's us key value
                    map2.put(key,m2-1);//update the let's us key value
                }
            }
        }
        
        Collections.sort(arrans);
        for(Integer arr : arrans){
            System.out.print(arr+" ");
        }
        
    }
    
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int arr1[] = {2,6,8,5,4,3,2};
        int arr2[] = {2,3,4,7,2};
        
        intersection(arr1,arr2);
    }

}
