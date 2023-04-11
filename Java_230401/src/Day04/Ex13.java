package Day04;

public class Ex13 {

	public static void main(String[] args) {
			
		for (int i = 1; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=================");
		int i = 0;
		int j = 7;
		
		do {
			System.out.print(i);
			if(i++ > --j) {
				break;
			}
		} while(true);
	}
}


//	과제
//	  *
//	 **
//	***
//     ****
