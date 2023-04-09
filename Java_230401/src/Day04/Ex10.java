package Day04;

import java.util.Scanner;

//	do-while
//	do {}안에있는 명령문을 실행한 후 아래에 설정된 while문의 조건식을 확인해서 해당 조건이 만족하는 동안 반복적으로 명령문을 처리한다.

//	do {
//	
//	} while(조건식);

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
//		입력값이 stop이면 프로그램 종료
		String data;
		do {
			System.out.println("문장을 입력해 주세요 : ");
			data = sc.next();
		} while(!data.equals("stop"));
//		String의 경우 입력한 값과의 비교가 정상적으로 처리되지 않습니다.
//		변수명.equals(값)을 통해서 같은지에 대해 판단을 진행할 수 있습니다
	}
}
