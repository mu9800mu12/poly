
public class While������ {

	public static void main(String[] args) {
		int i = 2;

		while (i < 10) {
			int j = 1;
			System.out.println(i + "[��] : ");
			while (j < 10) {
				System.out.println(i + "*" + j + "=" + (j * i));
				j++;
			}

			System.out.println();
			i++;

		}
	}

}
