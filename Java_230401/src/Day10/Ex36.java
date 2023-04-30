package Day10;
//	알고리즘이란
//	컴퓨터가 수행할 수 있도록 문제를 해결하는 절차
//	특정 작업에 대한 순차적인 처리과정

public class Ex36 {
//	선택정렬을 진행할 함수(메소드) 구현
	public static void selection_sort(int [] array, int size) {
//		해당 함수를 호출할 때, 묶음에 대한 정보와 묶음의 전체 크기에 대한 정보를 전달 받음
		
		for(int i=0; i<size-1; i++) {	// size-1인 이유 : 마지막 반복 시에는 자동으로 정렬이 되기 때문에 반복 횟수를 1회 감소
			int min = i;	// 최솟값에 대한 index
//			전체 검색을 통해 최솟값을 찾는다
			for(int j=i+1; j<size; j++) {
//				 위에서 설정한 가장 작은값에 대한 위치 값보다 작으면 
				if(array[j] < array[min]) {
//					그게 가장 작은 값
					min = j;
				}
			}
//			최솟값을 찾았으니 앞의 값과 최솟값을 교환
			swap(array, min, i);
			ArrayPrint(array,size);
		}
		
	}
//	값과 값을 서로 교환하는 함수를 구현
	public static void swap(int[] array, int i, int j) {
//		묶음에서 작업이 진행되는 만큼 묶음에 대한 정보와, 값의 위치를 이용해 교환을 시도

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
//	배열의 전체 값을 출력하는 함수
	public static void ArrayPrint(int[] array, int size) {
//		묶음에 대한 정보와 묶음 전체의 길이에 대한 정보를 추가한다
		for(int i=0; i<size; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
//		기본 알고리즘 - 선택 정렬
//		현재 위치에 들어갈 데이터를 찾아서 선택하는 알고리즘
		
//		선택 정렬의 알고리짐
//		1. 주어진 묶음에서 최솟값을 찾는다
//		2. 최솟값을 맨 앞의 값과 교환한다
//		3. 맨 앞을 제외한 나머지 값에서 같은 과정을 반복한다
		
		int[] array = {4,2,3,9,6,5,1,7,8};
		
		ArrayPrint(array, array.length); // 배열.length는 배열의 길이를 의미한다
		selection_sort(array, array.length);
		ArrayPrint(array, array.length);
		
	}
	
}
