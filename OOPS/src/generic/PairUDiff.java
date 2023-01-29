package generic;

public class PairUDiff {

	public static void main(String[] args) {
		
		
//		PairDiff<String,Integer> pSI = new PairDiff<String,Integer>("Divyansh",8);
////		pSI.setSecond(15);
//		System.out.println(pSI.getSecond()+" "+pSI.getFirst());
		
		
//		Pair<String> p = new Pair<>("ac","");
//		System.out.println(p.getFirst()+" generic_pair "+p.getSecond());
//		
//		
//		//created pair object
////		Pair p = new Pair(12,15);
////		//why it is dangerious ?
////		p.setFirst("aa");
////		p.setFirst(20);
////		
////		String f = (String)p.getFirst();
//		
////		System.out.println(p.getFist()+" pair "+p.getSecond());
//		
////		PairString pS = new PairString("aa", "bb");
////		PairDouble pS = new PairDouble(3.1, 7.12);
//		
//		
//		Pair<String> pS = new Pair<String>("aa","bb");
//		System.out.println(pS.getFirst()+" generic_pair "+pS.getSecond());
//		pS.setFirst("divyansh");
//		System.out.println(pS.getFirst()+" generic_pair "+pS.getSecond());
//		
//		Pair<Integer> pI = new Pair<Integer>(15,19);
//		System.out.println(pI.getFirst()+" Integer "+pI.getSecond());
//		
//		Pair<Double> pD = new Pair<>(8.4,11.5);
//		System.out.println(pD.getFirst()+" Double "+pD.getSecond());
//		
		//we can also create class generic
		
//		Pair<Vehicle> pV = new Pair<Vehicle>(new Vechicle(), new Vehicle());
		
		
		
		
//		chained generic pairs
		
		PairDiff<String,Integer> pInner = new PairDiff<>("Singh",8);//this is for the first inner pair
		
		PairDiff<PairDiff<String, Integer>,String> pP = new PairDiff<>();//this is for the main pair
		pP.setFirst(pInner);
//		System.out.println(pP.getFirst());//print the address of the 51 line code syntax
		pP.setSecond("Divyansh");
		System.out.println(pP.getSecond());
		
		System.out.println(pP.getFirst().getFirst());
		System.out.println(pP.getFirst().getSecond());
		
		
		
	}

}
