import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {

		int a;
		int b = 0;
		Scanner s = new Scanner(System.in);

		System.out.println("원하는 숫자를 적으십시오");
		a = s.nextInt();

		for (int i = 0; i <= a; i++) {
			
			 
		b+=i;	
	 
		} 
			
			System.out.println(b);

		
	}

}
