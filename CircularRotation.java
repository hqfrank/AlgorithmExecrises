public class CircularRotation{
	public static boolean validation(String s, String t){
		if(s.length()!=t.length()){
			return false;
		}
		else{
			s = s.concat(s);
			return s.contains(t);
		}
	}

	public static void main(String[] args){
		String s = args[0];
		String t = args[1];
		System.out.println("String "+s+" and String "+ t + " are circular rotation of each other. : "+validation(s,t));
	}

}