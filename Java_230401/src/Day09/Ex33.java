package Day09;
//	enum : 열거형으로, 상수를 문자로 표현
//	자바에서는 enum을 클래스 처럼 사용하는 것이 가능 
//	자바에서의 enum 정의 
//	1. 클래스처럼 보이게 하는 상수 
//	2. 서로 관련있는 상수끼리 모아서 정의한 것 

//	enum의 특징
//	1. 선언된 순서에 따라 0부터 index값을 가지게 됨 
//	2. enum 열거형으로 지정된 상수들은 모두 대문자로 선언 
//	3. 열거형 변수를 선언한 후 마지막에는 세미콜론을 붙이지 않음 
//	4. 상수와 특정 값을 연결시키는 경우는 세미콜론을 붙임 


enum Status {
	IDLE, WALK, RUN, ATTACK, DEAD
}

enum SHOP {
	SHOP1("무기 상점"),
	SHOP2("방어구 상점"),
	SHOP3("물약 상점");
	
	private final String value; // 수정이 불가능 하고, enum내에서만 접근가능한 문자형 데이터 value

	// 생성자를 통해 value의 정보를 받으면, 위에서 만든 값이 연결됨
	private SHOP(String value) {
		this.value = value;
	}

	// Getter & Setter 만들기를 통한 Get함수를 만들 수 있음
	// Set 함수의 경우 enum은 상수이기 때문에 값에대한 수정이 불가능해서 만들 수 없
	public String getValue() {
		return value;
	}

}



public class Ex33 {
	public static void main(String[] args) {
	
		Status status; // enum 선언
		status = Status.IDLE;
		
		switch(status) {
		case IDLE:
			System.out.println("플레이어는 대기상태입니다");
			break;
		case WALK:
			System.out.println("플레이어가 걷고있습니다");
			break;
		case RUN:
			System.out.println("플레이어가 달리고있습니다");
			break;
		case ATTACK:
			System.out.println("플레이어가 공격당하고있습니다");
			break;
		case DEAD:
			System.out.println("플레이어가 죽었습니다");
			break;
		}
		
		// enum.values()는 enum에 선언된 모든 상수를 가져오는 기능
		for(SHOP type : SHOP.values()) {
			System.out.println(type.name() + " " + type.ordinal());
			// name은 enum의 이름을 String의 형태로 return 하는 기능 
			// ordinal은 해당 enum이 몇번째로 정의된 것인지 그 숫자를 return하는 기능
		}
		
		
		
	}
}
