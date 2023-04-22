package Day07;

import java.util.Scanner;

//	재귀함수 연습문제 
//	N! 문제 


public class Ex22 {

//	일반 반복문 
	public static int ForFact(int N) {
		
		int mul = 1;
		for(int i=1; i<N; i++) {
			mul *= i;
		}
		return mul; 
	}
	
	
//	재귀함수의 형태로 같은 문제 구현 
	public static int Factorial(int N) {
//		1. 종료시점 작성 
		if(N == 1) {
			return 1;
		}
//		2. 반복의 형태 설계 
		return N * Factorial(N-1);
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		System.out.println(ForFact(N));
		System.out.println(Factorial(N));
		
	}
	
}
