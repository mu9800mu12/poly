
public class Star자바시험유형2 {

	public static void main(String[] args) {
		int j;
		int i;
		int k;
		for(i = 1; i<10; i++) {
			
			if(i<5) {
				j = i;
				k = 5 - i;
			}
			else	{
				j=10-i;
				k=i-5;
			}
			while(k>0) {
				System.out.print(" ");
				k--;
			}
			
			while(j>0) {
				System.out.print("*");
				j--;
			}
			System.out.println();			
		}


}}