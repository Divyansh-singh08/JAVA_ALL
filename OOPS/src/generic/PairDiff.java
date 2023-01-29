package generic;

public class PairDiff<T,S> {
		
		private T first;
		private S second;
		
		
//		default cnstructor
		
		public PairDiff() {
			
		}
		//constructor
		public PairDiff(T first,S second) {
//			super();
			this.first = first;
			this.second = second;
		}
		
		public T getFirst() {
			return first;
		}
		
		public void setFirst(T first) {
			this.first = first;
		}
		
		public S getSecond() {
			return second;
		}
		
		public void setSecond(S second) {
			this.second = second;
		}
}
