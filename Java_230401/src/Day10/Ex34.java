package Day10;

//	상속 : 기존의 클래스의 기능을 새로 만들 클래스에 전달해주는 기능
//	객페지향 프로그래밍 설계 기법 중 하나이며, 프로그램 데이터 간의 관계를 표현

//	상속의 특징 :
//	1. 기존에 있던 클래스를 부모 클래스 
//	2. 새로 만들어질 클래스를 자식 클래스
//	3. 자식 클래스가 다중 상속을 받을 수 없음

//	상속 사용 방법
//	class 새로 만들 클래스명 extends 기존에 있던 클래스 명 {
//	
//	}

class Parent {
	public String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}

class Child extends Parent {
	
}


//	연습) 다음 클래스에 대해 작업을 처리하시오
class A {
	private int a;
	public void setA(int a){
		this.a = a;
	}
}

class B extends A {
	protected int b;
	
}

class C extends B {
	public int c;
}

//	1. main코드에서 A classA = new A();를 통해 classA 인스턴스를 생성했을 때, 객체 classA의 멤버들을 모두 나열하시오
//		private int a = 필드
//		public void setA(int a) = 메소드

//	2. main코드에서 B classB = new B();를 통해 classB 인스턴스를 생성했을 때, 객체 classB의 멤버들을 모두 나열하시오
//		protected int b = 필드
//		public void setA(int a) = 메소드

public class Ex34 {

	public static void main(String[] args) {
		
//		Child child = new Child();
		
		
	}
}























