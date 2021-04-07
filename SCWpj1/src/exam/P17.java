package exam;

import java.util.Scanner;						//컨 + 쉬 + o

public class P17 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a,b ;
		while(true) {	//무조건 트루로 만들어서 무한루프를 생성해버림
			System.out.println("더할 첫 번째 수 입력 : ");
			a = s.nextInt();
			System.out.println("더할 두 번째 수 입력 : ");
			b = s.nextInt();
			
			
			
			System.out.println(a + b);
			if((a+b) > 10) {
				
				break; //종료되어버림
			}
			
		}
		
		
		
		
	}

}





















