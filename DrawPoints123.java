import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;


public class DrawPoints123{
	public static void Interval2D(int N, double Min, double Max){
		double[][] intervals = new double[N][4];
		StdDraw.setXscale(0.0,1.0);
		StdDraw.setYscale(0.0,1.0);
		for(int i = 0; i < N; i++){
			// the center coordinates
			intervals[i][0] = StdRandom.random();
			intervals[i][1] = StdRandom.random();
			// height and width
			intervals[i][2] = (Max-Min)*StdRandom.random()+Min;
			intervals[i][3] = (Max-Min)*StdRandom.random()+Min;
			StdDraw.rectangle(intervals[i][0],intervals[i][1],intervals[i][2]/2,intervals[i][3]/2);
		}
		int countPairs = 0;
		int countContain = 0;
		for(int i = 0; i < N-1; i++)
			for(int j = i+1; j < N; j++){
				double ileft = intervals[i][0]-intervals[i][2]/2;
				double iright = intervals[i][0]+intervals[i][2]/2;
				double jleft = intervals[j][0]-intervals[j][2]/2;
				double jright = intervals[j][0]+intervals[j][2]/2;
				double itop = intervals[i][1]+intervals[i][3]/2;
				double ibottom = intervals[i][1]-intervals[i][3]/2;
				double jtop = intervals[j][1]+intervals[j][3]/2;
				double jbottom = intervals[j][1]-intervals[j][3]/2;
				double leftbound = ileft;
				if(jleft < ileft)
					leftbound = jleft;
				double rightbound = iright;
				if(jright > iright)
					rightbound = jright;
				double topbound = itop;
				if(jtop > itop)
					topbound = jtop;
				double bottombound = ibottom;
				if(jbottom < ibottom)
					bottombound = jbottom;
				double sumW = intervals[i][2]+intervals[j][2];
				double sumH = intervals[i][3]+intervals[j][3];
				if(rightbound-leftbound <= sumW && topbound-bottombound <= sumH){
					countPairs++;
					if(rightbound-leftbound == intervals[i][2] && topbound-bottombound == intervals[i][3]){
						countContain++;
					}
					if(rightbound-leftbound == intervals[j][2] && topbound-bottombound == intervals[j][3]){
						countContain++;
					}
				}
			}
		System.out.println("There are " + countPairs + " of intervals that intersect.");
		System.out.println("There are " + countContain + " pairs of intervals of which one is contained in the other.");

	}

	public static void main(String[] args){
		int N = Integer.parseInt(args[0]);
		double Min = Double.parseDouble(args[1]);
		double Max = Double.parseDouble(args[2]);
		Interval2D(N,Min,Max);
	}
}