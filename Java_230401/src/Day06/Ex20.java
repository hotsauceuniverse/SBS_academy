package Day06;

//	함수 : 특정 명령문들을 모아놓은 명령 집합체
// 	설계한 함수는 프로그햄 내에서 호출을 통해 여러번 사용하는것
// 	tip 
//  1. 메소드 : 클래스 단위의 프로그래밍에서 클래스 내부에 존재하는 함수를 지칭하는 말 / 클래스의 메소드는 특정 동작, 작업에 대한 표현을 진행할 때 사용
//  2. 매개변수 : 함수를 호출할 때, 함수로부터 받은 값에 대한 형태 
//	3. return : 함수를 종료하고, return 다음에 적혀있는 값을 함수가 호출된 위치로 전달하는 기능

public class Ex20 {

//	함수 만드는 방법
//	접근제한자 자료형 함수명(매개변수) {
//		명령문
//	}
	
	public static int ByTwo(int value) {
		
		return value * 2;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(ByTwo(10));
		
	}
	
}
