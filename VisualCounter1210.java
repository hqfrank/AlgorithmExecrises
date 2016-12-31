import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

public class VisualCounter1210{
	private final int N;
	private final int max;
	private int Counter;
	private int value;

	public VisualCounter1210(int N, int max){
		this.N = N;
		this.max = max;
		this.Counter = 0;
		this.value = 0;
	}

	public void add(int x){
		if(Counter+1 <= N && value+x <= max){
			Counter++;
			value = value + x;
			StdDraw.point(Counter,value);
		}		
	}

	public void minus(int x){
		if(Counter+1<=N && value-x >= -1*max){
			Counter++;
			value = value - x;
			StdDraw.point(Counter,value);
		}
	}

	public int getCounter(){
		return Counter;
	}
}