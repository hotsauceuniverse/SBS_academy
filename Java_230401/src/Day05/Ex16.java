package Day05;

public class Ex16 {

	public static void main(String[] args) {

//		자료형 배열명[][] = new 자료형[세로형][가로형]
		int iArray[][] = new int[2][3];
		int number = 1;
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				iArray[i][j] = number++;
			}
		}
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(iArray[i][j] + " ");
			}
			System.out.println();
		}
		
//		1차원 배열을 요소로 초기화 하는 법 (1차원 배열은 배열의 요소가 자료형)
//		자료형 배열명[] = {요소1, 요소2,...}
		int array[] = {1,2,3,4,5};
		
//		2차원 배열을 요소로 초기화 하는 법
//		자료형 배열명[][] = {{요소1}, {요소2}, ....}
		String inven[][] = {
				{"체력포션", "마나포션"},
				{"검", "방패"},
				{"지도", "돈"}
		};
		
//		배열의 형태에서 사용할 수 있는 for문
//		for(변수선언 : 배열의 형태) {
//			명령문;
//		}
		
		for(String[] items : inven) {	// 2차원 배열 내에서 1차원 배열의 개수만큼 반복 진행
			for(String item : items) {	// 1차원 배열 내에서 문자열의 개수만큼 반복을 진행
				System.out.printf("%s%n", item);
			}
		} 
		
		
		
		
	}
	
}
