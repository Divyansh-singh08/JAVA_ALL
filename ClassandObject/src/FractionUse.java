
public class FractionUse {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(4,6);
		f1.print();
//		f1.set_numerator(12);
//		f1.get_numerator(15);
//		f1.increase();
//		f1.print();
		
		
		Fraction f2 = new Fraction(4,8);
		f1.add(f2);
		
//		f1.print();
		
		Fraction f3  = Fraction.add(f1, f2);
		f3.print();
		

	}

}
