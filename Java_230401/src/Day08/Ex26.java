package Day08;
//	클래스 : 객체를 정의하는 틀
//	프로그램에서 실제로 사용할 특정 데이터를 객체로 취급하고, 클래스 내부의 변수를 객체의 상태, 클래스 내부의 함수를 객체의 행동으로 보고 설계 진행

//	클래스 설계 방법
//	class 클래스명 {
//		필드;		: 필드는 클래스 내부에서 선언된 변수를 의미하고, 클래스를 통해 만들어지는 객체의 상태, 속성 등을 표현
//		메소드;	: 메소드는 클래스 내부에서 선언된 함수를 의미하고, 클래스를 통해 만들어지는 객체의 행동, 기능 등을 표현
//	}

//	클래스의 장점 : 틀을 만들고나서 클래스 생성을 통해 객체를 생성하면, 해당 객체는 클래스 틀에서 설계한 정보를 가지게 됨. 따라서 같은 형태의 데이터를 양산하기 좋음
//	 

class Animal{
	public String name;
	public int age;
	
	public void cry() {
		System.out.println("야옹");
	}
	public void AnialInfo() {
		System.out.printf("동물의 이름은 %s이며, 나이는 %d살입니다.%n", name, age);
	}
}


public class Ex26 {

	public static void main(String[] args) {
//		클래스 생성
//		클래스명 클래스변수명 = new 클래스명();
		
		Animal animal = new Animal();	// Animal 객체 animal, 인스턴스
//		인스턴스 : 클래스 생성을 통해 만들어지는 객체
		animal.age = 6;
		animal.name = "야옹이";
		animal.cry();
		animal.AnialInfo();
		
		Animal ani = new Animal();
		ani.age = 7;
		ani.name = "흰둥이";
		ani.AnialInfo();
		
	}
}
