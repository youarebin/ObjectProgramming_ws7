//컴퓨터학과_20220740_가유빈

import java.util.Scanner;

public class Practice49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("디폴트 비행기의 정보입니다.");
		Plane i = new Plane();
		System.out.print(i.toString());
		
		System.out.println("\n제주행 비행기의 정보입니다.");
		Plane m = new Plane();
		m.setId(1030615);
		m.setModel("보잉 737");
		m.setCapacity(75);
		System.out.print(m.toString());
		
		System.out.println("\n서울행 비행기의 정보입니다");
		Plane c = new Plane(2464737,"보잉 747", 150);
		System.out.print(c.toString());

	}

}
