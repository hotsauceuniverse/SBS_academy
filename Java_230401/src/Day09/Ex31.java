package Day09;

import java.util.Random;

//	트럼프 카드에 대한 클래스를 구현해 main에서 랜덤뽑기를 진행
//	1. 트럼프의 속성을 필드로 구현
//	2. 트럼프 생성 시, 트럼프의 모양과 트럼프의 숫자에 대한 랜덤 선택이 이루어짐
//	3. 트럼프의 모양에 따라 색깔이 결정
//	카드 클래스에는 트럼프의 내용을 확인할 수 있는 CardInfo메소드가 존재
//	카드의 내용을 확인 할 때, 특정 값(A, J, Q, K)로 출력
class Card{
	String Shape;
	int number;
	String Color;
	
	public Card() {
		Random random = new Random(); //랜덤 클래스 연결
		int shape_select = random.nextInt(4);//0~3까지의 숫자중 하나를 선택
		
		switch(shape_select){
		case 0 :
			Shape = "♠"; break;
		case 1 :
			Shape = "◆"; break;
		case 2 :
			Shape = "♥"; break;
		case 3 :
			Shape = "♣"; break;
		}
		
		number = random.nextInt(13)+1; //1~13까지의 숫자 중 하나를 선택
		
		if (Shape.equals("♠") || Shape.equals("♣")) {
			Color = "Black";
		} else {
			Color = "Red";
		}
		
	}
	
	public void CardInfo() {
		if(number == 1) {
			System.out.printf("%s %s A%n", Color, Shape);
		} else if(number == 11) {
			System.out.printf("%s %s J%n", Color, Shape);
		} else if(number == 12) {
			System.out.printf("%s %s Q%n", Color, Shape);
		} else if(number == 13){
			System.out.printf("%s %s K%n", Color, Shape);
		} else {
			System.out.printf("%s %s %d%n", Color, Shape, number);
		}
	}
}

public class Ex31 {

	public static void main(String[] args) {
		//System.out.println(random.nextInt(10) + 1); //0 ~ 9 -> 1~10
		//nextInt는 int의 범위 내의 랜덤 값을 return하는 기능
		//nextInt에 숫자를 넣을 경우 0부터 숫자-1까지의 범위를 가지게됨
		Card c = new Card();
		c.CardInfo();
		
	}

}

