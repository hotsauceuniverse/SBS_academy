package Day05;

public class test {

public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("==========");
		
//		1번 방법
		for(int i=1; i<6; i++) {
			for(int j=1; j<6-i; j++) {
					System.out.print(" ");
				}
			for(int k=1; k<=i-1; k++) {
					System.out.print("★");
				}	
				System.out.println("★");
			}
		
//		2번 방법
		for(int i=1; i<6; i++) {
			for(int j=5; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				} else {
					System.out.print("★");
				}
			}
			System.out.println();
		}
		
		System.out.println("==========");
		
//		1번 방법
		for(int i=1; i<6; i++) {
			for(int j=1; j<6-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<2*i-1; k++) {
				System.out.print("★");
			}
			System.out.println("★");
		}
		
//		2번 방법
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("==========");
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<2*i-1; k++) {
				System.out.print("★");
			}
			System.out.println("★");
		}
		for(int a=0; a<4; a++) {
			for(int b=0; b<=a; b++) {
				System.out.print(" ");
			}
			for(int c=5; c>2*a-1; c--) {
				System.out.print("★");
			}
			System.out.println("★");
		}
	}
	
}
