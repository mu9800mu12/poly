package exam;

import java.util.Scanner;						//�� + �� + o

public class P17 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a,b ;
		while(true) {	//������ Ʈ��� ���� ���ѷ����� �����ع���
			System.out.println("���� ù ��° �� �Է� : ");
			a = s.nextInt();
			System.out.println("���� �� ��° �� �Է� : ");
			b = s.nextInt();
			
			
			
			System.out.println(a + b);
			if((a+b) > 10) {
				
				break; //����Ǿ����
			}
			
		}
		
		
		
		
	}

}





















