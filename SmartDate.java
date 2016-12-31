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

	public String dayOfTheWeek(){
		if(year < 2000){
			return "It's not a date in 21st Century.";
		}
		else{
			// 1/1/2000 is Saturday
			int totalyearPrev = year - 2001;
			int totalLeapYears = totalyearPrev / 4 - totalyearPrev / 100 + totalyearPrev / 400 +1;
			int totalDatePrevYears = (totalyearPrev+1) * 365 + totalLeapYears;
			if(year == 2000) totalDatePrevYears = 0;
			int totalDate = totalDatePrevYears;
			int totalMonthPrev = month - 1;
			int totalDatePrevMonth = totalMonthPrev * 31;
			if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
				if(month == 3 || month == 4) totalDatePrevMonth -= 2;
				if(month == 5 || month == 6) totalDatePrevMonth -= 3;
				if(month == 7 || month == 8 || month == 9) totalDatePrevMonth -= 4;
				if(month == 10 || month == 11) totalDatePrevMonth -= 5;
				if(month == 12) totalDatePrevMonth -= 6;
			}
			else{
				if(month == 3 || month == 4) totalDatePrevMonth -= 3;
				if(month == 5 || month == 6) totalDatePrevMonth -= 4;
				if(month == 7 || month == 8 || month == 9) totalDatePrevMonth -= 5;
				if(month == 10 || month == 11) totalDatePrevMonth -= 6;
				if(month == 12) totalDatePrevMonth -= 7;
			}
			totalDate = totalDate + totalDatePrevMonth + day;
			if(totalDate % 7 == 0) return "Friday";
			if(totalDate % 7 == 1) return "Saturday";
			if(totalDate % 7 == 2) return "Sunday";
			if(totalDate % 7 == 3) return "Monday";
			if(totalDate % 7 == 4) return "Tuesday";
			if(totalDate % 7 == 5) return "Wednesday";
			if(totalDate % 7 == 6) return "Thursday";
			return "Error!";
		}
	}

	public String toString(){
		return month() + "/" + day() + "/" + year() + " " + dayOfTheWeek();
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