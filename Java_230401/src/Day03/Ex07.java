package Day03;

import java.util.Scanner;

//	값에 따른 명령 처리 switch
//	switch (변수명) {
//		case 값1:
//			명령문 실행코드
//			break;
//		case 값2:
//			명령문 실행코드
//			break;
//		default:
//			명령문 실행코드
//	}

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		String menu;
		
//		배열 : 같은 형태의 데이터를 묶어서 표현할 수 있는 자료구조
		String[] menu = new String[3];
		menu[0] = "커피";
		menu[1] = "에이드";
		menu[2] = "스낵";
		
		String select_menu;
		
		System.out.println("=====MENU=====");
//		System.out.printf("1. \t%3s%n", "커피");
//		System.out.printf("2. \t%3s%n", "에이드");
//		System.out.printf("3. \t%3s%n", "스낵");
		System.out.printf("1. \t%3s%n", menu[0]);
		System.out.printf("2. \t%3s%n", menu[1]);
		System.out.printf("3. \t%3s%n", menu[2]);
		System.out.println("==============");
		
		System.out.print("메뉴 선택(숫자입력) : ");
		int input = sc.nextInt();
		
		switch(input) {
		case 1: 
//			menu = "커피";
//			break;
		case 2: 
//			menu = "에이드";
//			break;
		case 3: 
//			menu = "스낵";
//			break;
			select_menu = menu[input-1];
			break;
		default: 
//			menu = null;
			select_menu = null;
		}
		
		
//		if(menu == null) {
//			System.out.println("입력값이 잘못 되었습니다.");
//		} else {
//			System.out.printf("고르신 메뉴는 %3s 입니다. %n", menu);
//		}
		
		if(select_menu == null) {
			System.out.println("입력값이 잘못 되었습니다.");
		} else {
			System.out.printf("고르신 메뉴는 %3s 입니다. %n", select_menu);
		}
		
		sc.close();
	}
}
