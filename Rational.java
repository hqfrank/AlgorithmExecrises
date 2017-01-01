public class Rational{
	private final long numerator;
	private final long denominator;

	public int gcd(int p, int q){
		if(q==0) return p;
		int r = p % q;
		return gcd(q,r);
	}

	public Rational(int numerator, int denominator){
		int cd = gcd(numerator, denominator);
		numerator /= cd;
		denominator /= cd;
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public long num(){
		return numerator;
	}

	public long den(){
		return denominator;
	}

	public Rational plus(Rational b){
		int tempNum = (int) (this.numerator*b.den() + this.denominator*b.num());
		int tempDen = (int) (this.denominator*b.den());
		int cd = gcd(tempNum, tempDen);
		return new Rational(tempNum/cd,tempDen/cd);
	}

	public Rational minus(Rational b){
		int tempNum = (int) (this.numerator*b.den() - this.denominator*b.num());
		int tempDen = (int) (this.denominator*b.den());
		int cd = gcd(tempNum, tempDen);
		return new Rational(tempNum/cd,tempDen/cd);
	}

	public Rational times(Rational b){
		int tempNum = (int) (this.numerator*b.num());
		int tempDen = (int) (this.denominator*b.den());
		int cd = gcd(tempNum, tempDen);
		return new Rational(tempNum/cd,tempDen/cd);
	}

	public Rational divides(Rational b){
		int tempNum = (int) (this.numerator*b.den());
		int tempDen = (int) (this.denominator*b.num());
		int cd = gcd(tempNum, tempDen);
		return new Rational(tempNum/cd,tempDen/cd);
	}

	public String toString(){
		return this.numerator + "/" + this.denominator;
	}

	public boolean equals(Object x){
		if(this == x) return true;
		if(x == null) return false;
		if(this.getClass() != x.getClass()) return false;
		Rational that = (Rational) x;
		if(this.numerator != that.numerator) return false;
		if(this.denominator != that.denominator) return false;
		return true;
	}
}