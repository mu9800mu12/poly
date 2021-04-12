import java.util.Scanner;

public class Day16 {

	public static void main(String[] args) {

		int a, b, k;

		Scanner s = new Scanner(System.in);

		k = s.nextInt();

		for (a = 1; a <= k; a++) {
			for (b = k; b > 0; b--) {

				if (a < b) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}

			System.out.println();

		}
	}
}