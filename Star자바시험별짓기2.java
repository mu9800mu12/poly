package exam;

public class Star자바시험별짓기2 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if (i < 6) {
					System.out.print(i + j > 4 ? "*" : "");
				} else {
					System.out.print(i + j <= 9 ? "*" : "");
				}
			}
			System.out.println();
		}

	}

}
//선배님 버전
