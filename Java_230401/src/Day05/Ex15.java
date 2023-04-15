package Day05;

public class Ex15 {

	public static void main(String[] args) {

//		1번 문제
		for(int i=0; i<10; i++) {
			System.out.print(i+"단 : "); 
			for(int j=0; j<10; j++) {
				System.out.print(i + "x" + j + "=" + (i*j) + " " );
			}
			System.out.println();
		}
		
//		2번 문제
		int count = 4; // 한줄에 출력할 단의 갯수
		for (int a=0; a<2; a++) {	// 영역	
			for (int dan = 1; dan <10; dan++) {
				for (int b=2+count*a; b<6+count*a; b++) {
					System.out.printf("%d X %d = %2d ", b, dan, b*dan);
				}
				System.out.println();
			}
		}
		
		
		
		
	}
	
}
