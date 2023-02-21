//컴퓨터학과_20220740_가유빈
import java.util.Random;

public class Practice51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rg = new Random();
		
		int[] s = new int[10000];
		int count1 = 0, count2 = 0;
		for(int i = 0; i < 10000; i++)
		{
			s[i] = rg.nextInt(9000) + 1000;
			if(s[i] == 1000)
				count1++;
			else if(s[i] == 9999)
				count2++;
		}
		for(int i = 0; i < 10000; i++)
		{
			if(s[i] == 1000)
				System.out.print(1000 + "*\t");
			else if(s[i] == 9999)
				System.out.print(9999 + "+\t");
			else
				System.out.print(s[i] + "\t");
			if((i + 1)%10 == 0)
				System.out.print("\n");
		}
		System.out.println("# of 1000: " + count1);
		System.out.print("# of 9999: " + count2);

	}

}
