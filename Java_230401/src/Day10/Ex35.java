package Day10;

//	공통적인 부분을 펜 클래스로 구현하고 상속을 통해 최적화 진행
//	상속의 장점
//	1. 기존의 클래스의 변수, 메소드 등을 재사용하기 때문에 시간이 단축
//	2. 상속을 통해 기능을 물려주면, 클래스마다 일일히 같은 형태의 값을 작성할 필요가 없어짐
//	3. 기존에 작성된 코드를 재사용한다는 건, 이미 검증된 코드임
//	4. 클래스가 상속을 통해 상위/하위와 같은 계층적인 분류 관리를 표현하기 때문에 유지보수가 용이해짐

//	상속의 단점
//	1. 캡슐화에 대한 위반(보안에 대한 위반)
//	2. 상속이 많아질수록 구조가 복잡해짐
//	3. 자유도 높은 코드를 작성하는 것이 제한될 수 있음

class Pen {
	private int amount;

	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

class Sharp extends Pen {
	private int width;
//	private int amount;

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
//	public int getAmount() {
//		return amount;
//	}
//	public void setAmount(int amount) {
//		this.amount = amount;
//	}
	
}

class Ballpoint extends Pen {
	private String color;
//	private int amount;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
//	public int getAmount() {
//		return amount;
//	}
//	public void setAmount(int amount) {
//		this.amount = amount;
//	}
	
}

class Fountain extends Ballpoint {
	
	public void Change() {
		
	}
	
//	private String color;
//	private int amount;
	
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	public int getAmount() {
//		return amount;
//	}
//	public void setAmount(int amount) {
//		this.amount = amount;
//	}
}

public class Ex35 {

	public static void main(String[] args) {
		
	}
	
}
