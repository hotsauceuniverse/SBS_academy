package Day10;

public class Ex37 {

	public static void main(String[] args) {
//		랭크 알고리즘
//		주어진 범위의 데이터의 순위를 구하는 알고리즘
//		1. 비교할 점수를 배열로 표현
		int[] array = {100,99,76,88,98,54,23};
//		2. 점수의 개수와 동일하게 점수별 순위를 배열로 표현
		int[] rank = {1,1,1,1,1,1,1};
//		3. 배열의 길이만큼 반복을 진행
		for(int i=0; i<array.length; i++) {
			rank[i] = 1;	// 점수를 반복마다 1로 초기화
			for(int j=0; j <array.length; j++) {	// 점수끼리 비교
				if(array[i] < array[j]) {
					rank[i] = rank[i] + 1;	// index값보다 크다면 순위를 증가
				}
//				System.out.printf("점수 : %d 순위 : %d%n", array[i], rank[i]);
			}
		}
//		4. 전체 출력을 통해 바뀐 부분을 확인
		for(int i=0; i<array.length; i++) {
			System.out.printf("점수 : %d 순위 : %d%n", array[i], rank[i]);
		}
	}
	
}
