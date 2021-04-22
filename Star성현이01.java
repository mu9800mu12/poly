package exam;

public class Star¼ºÇöÀÌ01 {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {

			if (i < 5) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");

				}
				System.out.println("");
			} else {

				for (int k = i; k < 9; k++) {
					System.out.print("*");
				}
				System.out.println(" ");

			}

		}

	}

}
