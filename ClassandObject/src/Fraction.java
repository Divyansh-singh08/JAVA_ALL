
public class Fraction {
	private int numerator;
	private int denominator;
	
	//constructor
	public Fraction(int numerator,int denominator) {
		if(denominator == 0) {
			//throw error
//			return;
			denominator = 1;
		}
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	public void setNumerator(int num) {
		this.numerator =  num;
		simplify();
	}
	
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setDenominator(int num) {
		if(num == 0) {
			//throw error
			return;
		}
		this.denominator =  num;
		simplify();
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	private void simplify() {
		int gcd = 1;
		int smaller = Math.min(numerator,denominator);
		for(int i=2; i <= smaller; i++) {
			if(numerator %  i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}
		numerator /= gcd;
		denominator /= gcd;
		
	}
	
	
	
	public void increase() {
		numerator += denominator;
		simplify();
	}
	

	public void print() {
		System.out.println(numerator + "/" + denominator);
	}
	
	
	public void add(Fraction f2) {
		//first fraction is the function on which function is called
		//second fraction is passed as argument
		
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		
		this.denominator = this.denominator * f2.denominator;
		
		simplify();
	}
	
	
	public static Fraction add(Fraction f1, Fraction f2) {
		int newNume = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
		int newDeno = f1.denominator * f2.denominator;
		
		Fraction f3 = new Fraction(newNume,newDeno);
		return f3;
	}
	
	
	
}