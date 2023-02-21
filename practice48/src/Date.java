
public class Date {

	private int year;
	private int month;
	private int day;
	public String toString() {
		return getYear() + "년 " + getMonth() + "월 " + getDay() + "일 입니다.";
	}
	// 설정자 메소드 수정
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	// 접근자 메소드
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
}
