import java.util.Scanner;

public class Day14 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a, b, k;

		k = s.nextInt();

		for (a = 0; a < k; a++) {
			for (b = 0; b < k; b++) {

				if (a > b)//a=1, b=0   a=2 b=0, 1, 
					System.out.print("*");

			}

			System.out.println("*");
		}

	}

}
