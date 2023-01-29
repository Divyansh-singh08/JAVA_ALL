import java.util.*;

public class Find_itinerary_from_tickets {
	//starting point
	public static String getStart(HashMap<String,String> tickets) {
		HashMap<String,String> revMap = new HashMap<>();
		
		//to ->> from
		for(String keys : tickets.keySet()) {
			revMap.put(tickets.get(keys),keys);
		}
		
		
		for(String keys : tickets.keySet()) {
			//now match with from(with tickets) and to(with revMap)
			if(!revMap.containsKey(keys)) {
				return keys;//this will be the Starting point
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		HashMap<String,String> tickets = new HashMap<>();
		tickets.put("chennai","Bengaluru");
		tickets.put("Mumbai", "Delhi");
		tickets.put("Goa", "chennai");
		tickets.put("Delhi","Goa");
		
		
		String startPoint = getStart(tickets);
		System.out.print(startPoint);
		for(String key : tickets.keySet()) {
			System.out.print("-->"+tickets.get(startPoint));
			//update
			startPoint = tickets.get(startPoint);
		}
		System.out.println();
		
		
		

	}

}
