package Day02;

//	조건문(if)
//	if(조건식) {
//		참일 경우 명령문;
//	} else if(조건식2) {
//		조건식이 거짓일 때, 조건식2의 참일 경우 명령문  
//	} else {
//		모든 조건이 거짓일때 실행할 명령문
//	}

public class Ex05 {

	public static void main(String[] args) {
		
		int num = 11;
		if(num % 2 == 0) {
			System.out.println("number는 짝수 입니다");
		} else {
			System.out.println("number는 홀수 입니다");
		}
		
		
//		논리연산 and의 사용예제
		int Player_level = 50;
		int Dragon_level = 100;
		int item = 1;
		boolean hasItem = true;
		
//		만약에 플레이어의 레벨의 *2의 수치가 던전레벨과 작거나 같으면, 아이템을 가지고 있을 경우 아이템을 1개 소모하여 던전에 입장합니다
		if(Player_level *2 <= 100 && hasItem) {
			item--;
			System.out.println("아이템 사용, 남은 아이템 갯수 : " + item + "개");
			System.out.println("던전입장");
		}
		
//		입장하고 나서 아이템을 가지고 있지 않을 경우 item을 false로 전환
		if(item < 1) {
			hasItem = false;
			System.out.println("아이템 갯수 : " + item + "개");
		}
	}
}
