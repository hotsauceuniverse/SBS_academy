package Day06;

public class Funtion {

//	일반함수
	public static void Method1() {
//		void타입은 비어있는 타입
//		void함수는 return을 진행하지 않음
//		일반함수는 값 전달이 아닌 값에대한 설정, 처리 등을 할 때 사용
		System.out.println("메소드 1 호출");
	}
	
//	return함수
	public static int Method2() {
//		return함수는 void이외의 타입으로 설계된 함수들은 return을 통해 함수의 자료형의 형태를 내보내줘야하기 때문
		
		return 10;
	}
	
//	static 키워드가 없는 일반함수
	public void Method3() {
		System.out.println("메소드 3 호출");
	}
	
//	static 키워드가 없는 return함수
	public int Method4() {
		return 20;
	}
	
	public static void main(String[] args) {
//		일반 함수와 return 함수
		
		Method1(); // 일반함수의 경우 바로 호출만 진행
		
		System.out.println(Method2()); // return함수의 경우 출력문을 통해 출력 진행
		
		int a = Method2(); // 변수에 함수를 호출해 그 값을 전달해서 사용하는 경우 존재
		System.out.println(a);
		
//		클래스 변수 만드는 방벙
//		클래스명 클래스변수명 = new 클래스명();
		
//		Method3(); // static키워드가 없는 메소드는 바로 사용할 수 없음
		Funtion fe = new Funtion(); // 클래스를 사용하기 위해 클래스 변수를 만들어서 
		fe.Method3(); // 해당 변수가 가지고 있는 Method3()을 호출해야 됨
		
		System.out.println(fe.Method4());
		
		
	}
	
}













