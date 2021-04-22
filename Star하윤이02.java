package exam;

public class Star«œ¿±¿Ã02 {

	public static void main(String[] args) {
		int k = 5;

		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				k--;
			} else {
				k++;
			}

			for (int j = 0; j < 5; j++) {

				System.out.print(j < k ? " " : "*");

			}

			System.out.println();
		}
	} 

}
