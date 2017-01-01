public class Transaction{
	private final String who;
	private final SmartDate when;
	private final double amount;

	public Transaction(String who, SmartDate when, double amount){
		this.who = who;
		this.when = when;
		this.amount = amount;
	}

	public Transaction(String transaction){
		String[] split = transaction.split("\\s+");
		this.who = split[0];
		String[] date = split[1].split("/");
		int month = Integer.parseInt(date[0]);
		int day = Integer.parseInt(date[1]);
		int year = Integer.parseInt(date[2]);
		this.when = new SmartDate(month,day,year);
		this.amount = Double.parseDouble(split[2]);
	}

	public String who(){
		return who;
	}

	public SmartDate when(){
		return when;
	}

	public double amount(){
		return amount;
	}

	public String toString(){
		return who() + " " + when() + " " + amount();
	}

	public boolean equals(Object x){
		if(this == x) return true;
		if(x == null) return false;
		if(this.getClass() != x.getClass()) return false;
		Transaction that = (Transaction) x;
		if(this.who.equals(that.who) == false) {
			System.out.println(this.who);
			System.out.println(that.who);
			System.out.println("Who is not the same");
			return false;}
		if(this.when.equals(that.when) ==  false) {
			System.out.println("When is not the same");
			return false;}
		if(this.amount != that.amount) {
			System.out.println("Amount is not the same");
			return false;}
		return true;

	}
}