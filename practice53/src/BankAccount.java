//컴퓨터학과_20220740_가유빈
import java.util.Random;

public class BankAccount {
	Random rd = new Random();
	
	private String name, accoutNo;
	private int balance;
	private double interest;
	// 설정자와 접근자 추가
	public void setName(String n) {
		name = n;
	}
	public void setAccoutNo(String a) {
		accoutNo = a;
	}
	public void setBalance(int b) {
		balance = b;
	}
	public void setRate(double r) {
		interest = r;
	}
	public String getName() {
		return name;
	}
	public String getAccoutNo() {
		return accoutNo;
	}
	public int getBalance() {
		return balance;
	}
	public double getRate() {
		return interest;
	}
	//생성자
	public BankAccount() {
		this("모름", 0, 0);
	}
	public BankAccount(String name, int balance) {
		this("", 0, 0);
	}
	public BankAccount(String name, int balance, double interest) {
		this.name = name;
		this.balance = balance;
		this.interest = interest;
	}
	//소속 메소드
	int a,b;
	private String makeID() {
		a = rd.nextInt(9000) + 1000;
		b = rd.nextInt(9000) + 1000;
		
		String s = "";
		s += a + " - " + b;
		
		return s;
	}
	public String toString() {
		String rslt = "";
		
		rslt += "이름: " + name;
		rslt += "\n계좌 번호: " + makeID();
		rslt += "\n잔액: " + balance;
		rslt += "\n이자율: " + interest + "%";
		rslt += "\n이자: " + calcInterest() + "원";
		
		return rslt;
	}
	private int calcInterest() {
		return (int)(interest*balance/100);
	} // 잔액과 이자율을 이용하여 이자 계산

}
