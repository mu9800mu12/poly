package exam;

public class Star�ڹٽ��躰���� {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if (i < 6) {
					System.out.print(i + j > 4 ? "*" : " ");
				} else {
					System.out.print(i - j < 6 ? "*" : " ");
				}//���׿�����
			}
			System.out.println();
		}
	}
}
//����� ����