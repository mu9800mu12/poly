
public class Day17 {

	public static void main(String[] args) {
	int i=2;
	
	while(i<10) {
		System.out.println(i);
		
		if(i==3||i==5) {
			System.out.println("[3��]");
		}
		
		int j=1;
		while(j<10) {
			System.out.println(i+"*"+j+"="+i*j);
			j++;
	}
		i++;
	}

	}

}
