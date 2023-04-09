package Day04;

//	배열과 for문
//	배열 : 같은 형태의 데이터를 묶어서 순서대로 저장하는 자료구조
//	배열의 개념 
//	1. index : 0부터 배열의 전체 길이(개수) -1까지의 범위를 가지고 있는 배열 안에 위치하는 데이터의 순서를 표현해주는 정수형 데이터
//	2. 요소   : 배열 안에 있는 데이터 그 자체

//	자료형[] 배열명 = new 자료형[배열의 길이]


//	for문: while문과 마찬가지로 반복문
//	for(초기식; 조건식; 증감식;) {
//		명령문
//	}
//	1. 초기식 실행(1회)
//	2. 조건식 확인
//	3. 조건식의 결과가 참일 경우 {}안의 명령문 실행
//	4. 증감식 처리


public class Ex12 {

	public static void main(String[] args) {
		
		int[] number_array = new int[10];
//		index를 이용해 배열의 위치에 값을 초기화를 진행
//		배열명[index번호] = 값;
		
//		number_array[0] = 1;
//		배열의 길이만큼 1부터 순서대로 값을 추가해보시오
		int start = 1;
		int index = 0;
		while (index < 10) {
			number_array[index] = start;
			System.out.printf("number_array[%d] = %d%n", index, number_array[index]);
			index++;
			start++;
		}
		
		System.out.println("==================================");
//		위와 동일 코드
		start = 1;
		for(int i = 0; i < 10; i++) {
			number_array[i] = start++;
//			number_array[i]에 start값을 초기화 하고 start의 값을 1 증가한다
			System.out.printf("number_array[%d] = %d%n", i, number_array[i]);
		}
		
		
	}
	
}
