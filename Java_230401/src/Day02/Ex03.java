package Day02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int number;
//		System.out.print("숫자를 입력 : ");
//		number = sc.nextInt();
//		System.out.println("숫자의 값 : " + number);
		
//		연습문제 : 정수형 데이터 변수 a, b를 만들어 각각 입력을 진행 후 a와 b의 덧셈 결과를 출력하시오
		int a;
		int b;
		System.out.print("a를 입력 하세요");
		a = sc.nextInt();
		System.out.print("b를 입력 하세요");
		b = sc.nextInt();
		
//		변수 3개로 하기
//		int result = a+b;
//		System.out.println("a+b : " + result);
		
//		변수 2개로 하기
		System.out.println("a+b : " + (a+b));
		
		sc.close();
	}
	
}
