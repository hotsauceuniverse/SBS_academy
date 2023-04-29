package Day09;

//	클래스의 생성자(constructor)
//	1. 클래스와 이름이 동일한 메소드를 의미
//	2. 해당 메소드는 별도의 타입이 없음 
//	3. 생성자의 매개변수를 수정해 주는 것으로 클래스 생성 시, 인자값을 널고 생성 할 수 있

//	생성자/메소드 오버로딩 : 
//	같은 이름의 메소드에 매개변수의 개수, 순서, 유형이 다르다면, 다른 메소드로 판단함
//	=> 메소드 시그니처에 따라 메소드를 판단함 
//	메소드 시그니처 : 메소드() <- 부분에 작성되는 매개변수의 리스트
//	매개변수를 볼 때, 데이터로만 판단

// 	매개변수(parameter) : 함수(메소드)의 도입부에 작성되는 변수
//	함수가 호출되면 함수 내부에서 생성이 이루어지고, 함수의 호출이 끝나면 값은 사라짐
//	함수 호출 시, 다른 쪽에서 전달해준 인자의 값을 복사해어서 함수 내에서 사용

//	인자(argument) : 함수를 호출 할 때 넣어줄 값 그 자체를 의미. 
//	함수에서 지정한 매개변수의 형태에 맞는 데이터


class Book {
	//	필드 : 클래스 내부에 만들어진 변수
	public String name;
	public String author;
	public String publisher;
	public int price;
	
	//	생성자 구축
	public Book(String name, String author, String publisher, int price) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	//	책의 정보를 출력하는 메소드 BookInfo
	public void BookInfo() {
		System.out.printf("책 제목 : %s 책 저자 : %s 출판사 : %s 가격 : %d%n", name, author, publisher, price);
	}
	
}

public class Ex30 {
	public static void main(String[] args) {
//		Book book = new Book(); //	생성자를 수정했기 떄문에 에러 발생
		Book book = new Book("나의라임오렌지나무", "세영", "자바", 6500);
//		생성자의 매개변수로 지정한 데이터의 유형 순서대로 인자 값을 작성
		book.BookInfo();
	}
}
