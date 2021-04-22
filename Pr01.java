package exam;
public class Pr01 {
	public static void main(String[]args) {
		int a;
		int k = 0;
		
		for(a=0;a<9;a++) {
			if(a<5) {
				k++;}
			else {k--;}
			for( int j = 0; j < k; j++) {
				System.out.print("*");
			}
			System.out.println("");
			}
		}
}