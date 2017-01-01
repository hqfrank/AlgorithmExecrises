public class Client1216{
	public static void main(String[] args){
		Rational num1 = new Rational(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		Rational num2 = new Rational(Integer.parseInt(args[2]),Integer.parseInt(args[3]));
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1.plus(num2));
		System.out.println(num1.minus(num2));
		System.out.println(num1.times(num2));
		System.out.println(num1.divides(num2));
		System.out.println(num1.equals(num2));
	}
}