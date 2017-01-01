public class readInts1215{
	public static int[] readInts(String name){
		In in = new In(name);
		String input = StdIn.readAll();
		String[] words = input.split("\\s+");
		int[] ints = new int[words.length];
		for (int i = 0; i < words.length; i++){
			ints[i] = Integer.parseInt(words[i]);
		}
		return ints;
	}
}