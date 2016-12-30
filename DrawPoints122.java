import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

public class DrawPoints122{
	public static void Interval1D(int N){
		double[][] intervals = new double[N][2];
		for (int i = 0; i < N; i++){
			intervals[i][0] = StdIn.readDouble();
			double temp = StdIn.readDouble();
			if (temp < intervals[i][0]){
				intervals[i][1] = intervals[i][0];
				intervals[i][0] = temp;
			}
			else{
				intervals[i][1] = temp;
			}

			System.out.println("The "+ i + "th interval is from "+intervals[i][0] + " to "+ intervals[i][1]);
		}

		for (int i = 0; i < N-1; i++)
			for (int j = i+1; j < N; j++){
				boolean flag = false;
				if(intervals[i][0]>=intervals[j][0] && intervals[i][0]<=intervals[j][1]){
					flag = true;	
				}
				if(intervals[i][1]>=intervals[j][0] && intervals[i][1]<=intervals[j][1]){
					flag = true;	
				}
				if(intervals[j][0]>=intervals[i][0] && intervals[j][0]<=intervals[i][1]){
					flag = true;	
				}
				if(intervals[j][1]>=intervals[i][0] && intervals[j][1]<=intervals[i][1]){
					flag = true;	
				}
				if(flag)
					System.out.println("The "+ (i+1) + "th interval and the " + (j+1) +"th interval are intersected.");
			}


	}

	public static void main(String[] args){
		int N = Integer.parseInt(args[0]);
		Interval1D(N);
	}
	
}