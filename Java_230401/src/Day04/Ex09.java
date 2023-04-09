package Day04;

import java.util.Scanner;

//while (조건식) {
//	조건식의 결과가 만족하는 동안 실행할 명령문
//}

public class Ex09 {

	public static void main(String[] args) {
		
		int count = 1;
		while(count <= 10) {
			System.out.printf("명령을 %2d회 실행합니다.%n", count);
			count++;
		}
		System.out.println("======================");
		
//		while문을 이용하여 1부터 입력받으 숫자까지의 법위중에서 짝수만 출력하는 프로그램을 구현하시오
		Scanner sc = new Scanner(System.in);
		int start = 1;
		int end = sc.nextInt();
		while(start <= end) {
			if(start %2 == 0)
				System.out.print(start + " ");
//			if문 다음에 처리할 명령문이 하나일 경우 {}을 생략할 수 있다
			start++;
		}
	}
}
