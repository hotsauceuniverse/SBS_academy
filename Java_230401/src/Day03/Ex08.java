package Day03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("점수를 입력하세요 : ");
			
			int score = sc.nextInt();
//			String rank;
			String[] rank = {"A", "B", "C", "F"};
			String select_rank;
			
			switch(score/10) {
			case 10:
			case 9:
				select_rank = rank[0];
				break;
			case 8:
				select_rank = rank[1];
				break;
			case 7:
				select_rank = rank[2];
				break;
			default:
				select_rank = rank[3];
			}
			System.out.printf("점수 : %d%n등급 : %s%n", score, select_rank);
			
		}
	}
}
