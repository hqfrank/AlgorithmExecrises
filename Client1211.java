public class Client1211{
	public static void main(String[] args){
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		SmartDate date = new SmartDate(m,d,y);
		System.out.println(date);
	}
}