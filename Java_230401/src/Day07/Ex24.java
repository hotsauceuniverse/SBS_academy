package Day07;

import java.util.Scanner;

//	소수를 구하는 프로그램 코드 

public class Ex24 {
	
	public static int Number(int N) {
		
		// 소수의 조건 
		if(N == 2 || N % 2 != 0) {
			return N;
		}
		
		// 종료조건 
		if(N<2 || N%2 == 0) {
			return 0;
		}
		
		return Number(N-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=2; i<=N; i++) {
			if(Number(i) != 0) {
				System.out.print(Number(i));
			}
		}
	}
	
}
