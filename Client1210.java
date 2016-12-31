import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

public class Client1210{
	public static void main(String[] args){
		int N = Integer.parseInt(args[0]);
		StdDraw.setXscale(0,N);
		int max = Integer.parseInt(args[1]);
		StdDraw.setYscale(-max,max);
		StdDraw.setPenRadius(0.01);
		VisualCounter1210 Ctr = new VisualCounter1210(N,max);
		while(Ctr.getCounter() < N){
			String input = StdIn.readLine();
			String[] temp = input.split("\\s+"); 
			String operation = temp[0];
			int number = Integer.parseInt(temp[1]);
			System.out.println(operation);
			System.out.println(number);
			
			if(operation.equals("Add")){
				Ctr.add(number);
				System.out.println("This is an Add operation.");
			}
			else if(operation.equals("Minus")){
				Ctr.minus(number);
				System.out.println("This is a Minus operation.");
			}
			else{
				System.out.println("Undefined operation.");
			}
		}
		
	}
}