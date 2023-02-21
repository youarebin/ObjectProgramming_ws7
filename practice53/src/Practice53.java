//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		BankAccount b1 = new BankAccount();
		System.out.print(b1.toString());
		
		System.out.println("\n\n두 번째 은행 계좌의 정보입니다.");
		BankAccount b2 = new BankAccount();
		b2.setName("김동덕");
		b2.setBalance(100);
		System.out.print(b2.toString());
		
		System.out.println("\n\n세번째 은행 계좌의 정보입니다.");
		BankAccount b3 = new BankAccount("홍길동",2000, 2.15);
		System.out.print(b3.toString());
	}

}
