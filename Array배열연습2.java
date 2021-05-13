package exam;

public class Array배열연습2 {

	public static void main(String[] args) {

		int aa[] = { 10,20,30,40,50};
		int count, size;
		
		count =aa.length;
		size =count * Integer.BYTES;
		
		System.out.println("배열aa[]의 요소의 개수는 "+ count + "입니다.");
		System.out.println("바이트는"+size+"바이트 입니다.");
		
	}

}
