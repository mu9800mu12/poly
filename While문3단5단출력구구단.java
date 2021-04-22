
public class While문3단5단출력구구단 {

	public static void main(String[] args) {
		int a = 2;
		while (a<10) {
			if(a==3||a==5) {
				System.out.println(a == 3 ? "[3단]" : "[5단]");
			}
			int b= 1;
		while (b<10) {
			System.out.println(a*b);
		b++;}
		System.out.println();
		a++;
		}
	}

}
