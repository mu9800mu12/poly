package exam;

public class P19 {

	public static void main(String[] args) {
		
		
		
		
		int sum = 0;
		int i;
		
		myLobel: for(;;) {
			for(i=1;i<=100;i++) {
				sum +=i;
				if (sum >2000) {
					System.out.println(sum);
					
					sum = 0;
					//break;
					return;
					
				}
			}
			
			System.out.println("아직도 반복중...");
		}
	}

}
