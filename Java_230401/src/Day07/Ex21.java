package Day07;
//	재귀함수 : 함수 내에서 자기 자신이 다시 호출되는 형태의 함수 	
//	문제점 : 어느정도 반복하고 나면 StackOverFlow 현상 발생
//	Stack은 함수가 호출되면 그 함수를 임시로 저장하는 공간
//	함수는 호출 뒤 처리가 끝나면 데이터 내에서 삭제되야 하기 때문에 기존의 데이터와 다르게 따로 임시 저장공간에 보관되어 사용됨 
//	함수가 삭제되기 전에 새롭게 호출이 계속 진행되다보니 제거가 되지 않고 쌓이기만 하면서 저장공간이 부족한 상황
//	해결방법 : 함수에 대한 종료조건을 설계해서 무한정 실행되지 않게 방지함 

//	재귀함수 사용목적 
//	1. 반복문 없이 반복문의 형태를 표현할 수 있음
//	2. 특정알고리즘을 구축할 때 표현이 더 단순하게 진행될 수 있음


public class Ex21 {

	public static void Recoursive() {
		System.out.println("hello");
		Recoursive();
	}
	
	
	public static void main(String[] args) {
	
		Recoursive();
		
	}
	
}
