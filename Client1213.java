public class Client1213{
	public static void main(String[] args){
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		SmartDate date = new SmartDate(m,d,y);
		System.out.println(date);
		String who = args[3];
		double amount = Double.parseDouble(args[4]);
		Transaction transaction = new Transaction(who, date, amount);
		System.out.println(transaction);
		Transaction transaction2 = new Transaction("Frank 1/1/2017 10000.0");
		System.out.println(transaction2);
		System.out.println(transaction2.equals(transaction));
	}
}