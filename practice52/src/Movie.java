//컴퓨터학과_20220740_가유빈3
import java.util.Random;
public class Movie {
	Random rd = new Random();
	
	private String title, director, mid;
	private int score, year;
	// 설정자와 접근자 추가
	public void setTitle(String t) {
		title = t;
	}
	public void setDirector(String d) {
		director = d;
	}
	public void setScore(int s) {
		score = s;
	}
	public void setYear(int y) {
		year = y;
	}
	public void setMid(String m) {
		mid = m;
	}
	public String getTitle() {
		return title;
	}
	public String getDirector() {
		return director;
	}
	public int getScore() {
		return score;
	}
	public int getYear() {
		return year;
	}
	
	public String getMid() {
		return mid;
	}
	public String toString() {
		String rslt = "";
		
		rslt += "번호: " + makeID();
		rslt += "\n제목: " + title;
		rslt += "\n감독: " + director;
		rslt += "\n제작년도: " + year + "년";
		rslt += "\n평점: " + score + "점";
		
		return rslt;
	}
	
	public Movie() {
		setMid(makeID());
		setTitle("모름");
		setDirector("모름");
		setYear(-1);
		setScore(-1);
	}
	private String makeID() {
		int a = rd.nextInt(9000) + 1000;
		int b = rd.nextInt(9000) + 1000;
		
		String s = "";
		s += a + " - " + b;
		
		return s;
	}

}
