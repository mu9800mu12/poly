
public class Star마름모 {

	public static void main(String[] args) {

		int k = 2;
		int p = 3;
		for (int a = 1; a <= 5; a++) {
			if (a <= 3) {
				k++;
				p--;
			} else {
				k--;
				p++;
			}

			for (int b = 1; b <= k; b++) {
				if (k < 6) {
					System.out.print(b > p ? "*" : " ");
				}
				if (b == 1) {
					System.out.print(" "); //이거 지우면 그냥 띄워쓰기 없어짐
				}

				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}
