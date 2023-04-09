package Day04;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

//	while(true) : 조건식을 true로 작성하여, 조건이 항상 만족하는 상태, 즉 무한으로 실행하기위한 코드

public class Ex11 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int check = 0;
		
		while(true) {
			System.out.println("마이크 테스트");
			if(check == 10) {
				break;
			}
			check++;
		}
		
		while(true) {
			String input = sc.nextLine();
			System.out.println(input);
		}
	}
}
