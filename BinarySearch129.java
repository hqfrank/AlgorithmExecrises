import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;

public class BinarySearch129{
	public static int rank(int key, int[] a, int Counter){
		// Array must be sorted.
		int lo = 0;
		int hi = a.length-1;
		while(lo <= hi){
			// Key is in a[lo..hi] or not present.
			Counter ++;
			int mid = lo + (hi-lo)/2;
			if (key < a[mid]) hi = mid -1;
			else if (key > a[mid]) lo = mid +1;
			else {
				StdOut.println("The key " + key + " is found.");
				return Counter;}
		}
		return Counter;
	}

	public static void main(String[] args){
		int[] whitelist = In.readInts(args[0]);
		int Counter = 0;

		Arrays.sort(whitelist);

		while(!StdIn.isEmpty()){
			int key = StdIn.readInt();
			Counter = rank(key, whitelist, Counter);
		}
		StdOut.println("The total number searches is "+ Counter);
	}
}