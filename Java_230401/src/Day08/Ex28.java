package Day08;

//	캡슐화 : 클래스 안에 서로 연관되어있는 속성과 기능을 하나의 캡슐로 만들어 데이터를 외부로부터 보호하는 것
//	필드값을 private로, 그필드에 대한 메소드를 public으로 설계

//	사용이유 
//	1. 필드값은 객체의 속성, 정보이기 때문에 함부로 수정이 되면 안됨
//	2. 필드값에 대한 보안성 유지

class Item {
	
	private String name;
	public String description;
	
//	Getter(Get함수) : get+변수이름의 형태에 해당 변수의 타입을 가지고있음
//					 역할은 해당 필드 값에 대한 return 기능
//	Setter(Set함수) : set+변수이름의 형태에 void 타입을 가지고있음
//					 필드 타입과 같은 타입의 매개변수를 통해 인자값을 받는 함수
//					 역할은 매개변수를 통해 인자 값을 받아서 그 값을 필드 값으로 적용
	
//	Getter/Setter를 작업하는 이유
//	아이템이 가지고 있는 정보가 밖에서 접근이 불가능한 상태로 만들었을 경우 그에대한 설정을 처리하기 위해
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}


public class Ex28 {

	public static void main(String[] args) {
		
		Item item01 = new Item();
		item01.setName("장난감 상자");
		System.out.println(item01.getName());
	}
	
}
