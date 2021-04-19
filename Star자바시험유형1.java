
public class Star자바시험유형1 {

	public static void main(String[] args) {
		for(int i = 1; i<10; i++) {
			int j;
			if(i<5) {
				j = i;
			}
			
			else	{
				j=10-i;
			}
			while(j>0) {
				System.out.print("*");
				j--;
			}
			System.out.println();			}
		}

	}


