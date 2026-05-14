
public class TestDate {
	
		int day, month, year;
		String dow;

		//default constructor
		TestDate(){
		day=1;
		month=2;
		year=2026;
		dow="Sunday";
		}

		//parameterized constructor
		TestDate( int day, int month, int year, String dow){
		this.day = day;
		this.month = month;
		this.year = year;
		this.dow = dow;
		}

		int getDay() {return day; }
		void setDay(int day) {this.day = day; }

		int getMonth() {return month; }
		void setMonth(int month) {this.month = month; }

		int getYear() {return year; }
		void setYear(int year) {this.year = year; }

		String getDow() {return dow; }
		void setDow(String dow) {this.dow = dow; }

		void display(){
		System.out.println(day + "/" + month + "/" + year + "-" + dow);
		}

		
		public static void main(String [] args)
		{
		TestDate d = new TestDate(1,3,2026,"sunday");
		d.display();
		System.out.println(d.hashCode());
		}
}
