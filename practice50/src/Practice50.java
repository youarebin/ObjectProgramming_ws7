//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("디폴트 상자의 정보입니다.");
		Box b = new Box();
		System.out.print(b.toString());
		
		System.out.println("\n첫번째 상자의 정보입니다.");
		Box b2 = new Box();
		b2.setX(30);
		b2.setY(45);
		b2.setZ(53);
		b2.fillBox();
		System.out.print(b2.toString());
		
		System.out.println("\n두번째 상자의 정보입니다.");
		Box b3 = new Box(100,60,20);
		System.out.print(b3.toString());
	}

}
