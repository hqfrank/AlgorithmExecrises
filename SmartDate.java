public class SmartDate{
	private final int month;
	private final int day;
	private final int year;

	public SmartDate(int m, int d, int y){
		if (m>12 || m < 1){
			System.out.println(m+"/"+d+"/"+y);
			throw new RuntimeException("Month data is illegal.");
		}
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
			if(d > 31 || d < 1){
				System.out.println(m+"/"+d+"/"+y);
				throw new RuntimeException("Day data is illegal.");}
		}
		if (m == 4 || m == 6 || m == 9 || m == 11){
			if(d > 30 || d < 1){
				System.out.println(m+"/"+d+"/"+y);
				throw new RuntimeException("Day data is illegal.");}
		}
		if (y % 4 == 0 && y % 100 != 0 && m == 2){
			if(d > 29 || d < 1){
				System.out.println(m+"/"+d+"/"+y);
				throw new RuntimeException("Day data is illegal.");}
		}
		else if (y % 400 == 0 && m == 2) {
			if(d > 29 || d < 1){
				System.out.println(m+"/"+d+"/"+y);
				throw new RuntimeException("Day data is illegal.");}
		}
		else if(m == 2){
			if(d > 28 || d < 1){
				System.out.println(m+"/"+d+"/"+y);
				throw new RuntimeException("Day data is illegal.");}
		}
		month = m;
		day = d;
		year = y;
	}

	public int month(){
		return month;
	}

	public int day(){
		return day;
	}

	public int year(){
		return year;
	}

	public String toString(){
		return month() + "/" + day() + "/" + year();
	}

	public boolean equals(Object x){
		if (this == x) return true;
		if (x == null) return false;
		if (this.getClass() != x.getClass()) return false;
		SmartDate that = (SmartDate) x;
		if (this.day != that.day) return false;
		if (this.month != that.month) return false;
		if (this.year != that.year) return false;
		return true;
	}
}