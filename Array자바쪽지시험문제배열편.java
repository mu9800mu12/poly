package exam;

public class Array자바쪽지시험문제배열편 {

	public static void main(String[] args) {
	      int[] aa = new int[10];
	      
	      for(int i =0; i<10; i++) {
	         aa[i]=(i+1)*10;
	      }
	   
	      int i =0;
	      while(i <aa.length) {
	         System.out.println(aa[i]);
	         i++;
	      }
	      
	   }
	}