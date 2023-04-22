package Day07;

import java.util.Scanner;

//	피보나치 수열을 입력받은 숫자의 갯수만큼 출력 
//	피보나치 수 : 1 1 2 3 4 5 8 13.... => a+b=c

public class Ex23 {

	public static int Fibo(int N) {
		
		if(N<2) {
			return N;
		}
		
		return Fibo(N-2) + Fibo(N-1);	
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			System.out.print(Fibo(i) + " ");
		}
	}
	
}
