package Day06;

import java.util.Scanner;

public class Calculator {

	
	public static int Plus(int a, int b) {
		return a + b;
	}
	
	public static int Minus(int a, int b) {
		return a - b;
	}
	
	public static int Multiple(int a, int b) {
		return a * b;
	}
	
//	캐스팅 크기별 표현
//	char < short < int < long < float < double
	
	public static double Divide(int a, int b) {
		return (double)a / b;
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("더하기 결과 : %d\n", Plus(a,b));
		
	}
}

//	과제 : 계산기 프로그램으로서 확장 (종료를 선택하지 않는 한 계속 반복이 처리됨)
