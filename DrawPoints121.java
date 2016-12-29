import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import java.lang.Math;

public class DrawPoints121{
	public static double Point2D(int N){
		double[][] points = new double[N][2];
		StdDraw.setXscale(0.0,1.0);
		StdDraw.setYscale(0.0,1.0);
		StdDraw.setPenRadius(0.01);
		for(int i = 0; i < N; i++){
			points[i][0] = StdRandom.random();// generate x
			points[i][1] = StdRandom.random();// generate y
			StdDraw.point(points[i][0],points[i][1]);
		}
		double minDist2 = 10000;
		for(int i = 0; i < N-1; i++)
			for(int j = i + 1; j < N; j++){
				double tempDist2 = Math.pow(points[i][0]-points[j][0],2.0)+ Math.pow(points[i][1]-points[j][1],2.0);
				if (tempDist2 < minDist2)
					minDist2 = tempDist2;
			}
		return Math.sqrt(minDist2);
	}

	public static void main(String[] args){
		int N = Integer.parseInt(args[0]);
		System.out.println("The minimum distance between a pair of points is "+ Point2D(N));
	}
}