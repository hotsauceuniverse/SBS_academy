package Day06;

public class Ex19 {

	public static void main(String[] args) {
		
		int a = 50000;
		int b = 1800;
		int c = a-b;
		int money_type[] = new int[5];
		int money_list[] = {10000, 5000, 1000, 500, 100};
		System.out.printf("물건을 구입하고 남은 거스름돈은 %d원이며, " , c);
		
		
//		money_type[0] =  c/10000;	// 10000원짜리 개수 표현
//		c %=10000;					// 거스름돈에서 40000원만큼 제거
//		money_type[1] = c/5000;
//		c%=5000;
//		money_type[2] = c/1000;
//		c%=1000;
//		money_type[3] = c/500;
//		c%=500;
//		money_type[4] = c/100;
//		c%=100;
		
		for(int i=0; i<money_list.length; i++) {
			money_type[i] = c / money_list[i]; // money_type과 money_list는 서로 연관되어있는 같은 길이의 배열이기에 가능한 식
			c %= money_list[i];
		}
		
		
//		System.out.printf("10000원짜리 %d개, 5000원짜리 %d개, 1000원짜리 %d개, 500원짜리 %d개, 100원짜리 %d개 입니다", money_type[0], money_type[1], money_type[2], money_type[3], money_type[4]);
		
		for(int i=0; i<money_list.length; i++) {
			System.out.printf("%d원의 개수 : %d개 ", money_list[i], money_type[i]);
		}
		
		
		
	}
	
}
