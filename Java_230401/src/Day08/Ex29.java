package Day08;

//	원 객체를 표현할 클래스 Circle을 구현

class Circle {
	private double radius;
	public static double PI = 3.14;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * PI;
	}
}

public class Ex29 {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.setRadius(5);	// 반지름 5
		System.out.println("원의 넓이 : " + c.getArea());	// 원의 넓이 출력
	}
}
