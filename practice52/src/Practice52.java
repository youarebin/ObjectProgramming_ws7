//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("디폴트 영화의 정보입니다.\n");
		Movie m0 = new Movie();
		System.out.print(m0.toString());
		
		Movie m1 = new Movie();
		
		System.out.print("\n\n영화정보를 입력하세요.\n");
		System.out.print("영화제목은?");
		String title = sc.next();
		m1.setTitle(title);
		System.out.print("감독은? ");
		String director = sc.next();
		m1.setDirector(director);
		System.out.print("제작 년도는?");
		int year = sc.nextInt();
		m1.setYear(year);
		System.out.print("평점은?");
		int score = sc.nextInt();
		m1.setScore(score);
		
		System.out.print("\n입력한 영화의 정보입니다.\n");
		System.out.print(m1.toString());
	}

}
