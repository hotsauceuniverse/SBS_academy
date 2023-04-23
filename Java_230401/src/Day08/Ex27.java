package Day08;

import java.util.Scanner;

//	가격과 이름과 설명으로 구성되어있는 클래스 food를 구현
//	food를 이용해 메인에서 메뉴판 프로그램을 설계
//	메뉴판 프로그램에서는 총 3개의 음식에 대한 정보가 화면에 출력되며
//	입력을 통해 메뉴를 선택할 수 있고, 해당 메뉴를 선택 했을 경우 음식을 구매할 수 있음
//	사용자는 제한된 금액을 가지고 있으며, 금액이 부족한 경우에는 구매를 진행할 수 없음

class Food
{
	public int price;
	public String name;
	public String description;
	
	public void FoodInfo()
	{
		System.out.printf("메뉴 이름 : %s 가격 %d ￦ 메뉴 설명 : %s%n", name, price, description);
	}
	
	public void FoodSetting(String name , int price, String description)
	{
		//this는 클래스에서 자기 자신을 지칭하는 말
		this.name = name;
		this.price = price;
		this.description = description;
	}
}

public class Ex27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 10000;
		int select; //메뉴 선택
		Food foods[] = new Food[3]; //음식 3개 표현
		//위에서는 클래스의 배열을 만든 것이기 때문에 각각에 클래스 생성을 따로 진행해줄 필요
		for(int i = 0 ; i <3; i++)
		{
			foods[i] = new Food();
		}
		
		//메뉴 값 설정
		foods[0].FoodSetting("라면", 3000, "가장 많이 팔리는 주력 메뉴");
		foods[1].FoodSetting("닭 튀김", 4000, "가장 많이 팔리는 사이드 메뉴");
		foods[2].FoodSetting("제육덮밥", 6000, "많이 맵습니다.");
		
		for (Food food : foods) {
			food.FoodInfo();
		}
		System.out.print("메뉴를 선택해주세요 ex) 1 -> 라면 >> ");
		select = sc.nextInt();
		
		if(select > 0 && select < 3)
		{
			if(foods[select-1].price > money)
			{
				System.out.println("잔액이 부족합니다.");
			}
			else
			{
				money -= foods[select-1].price;
				System.out.printf("구매하신 메뉴은 %s이며, 가격은 %d원이고 남은 금액은 %d원입니다.%n", 
						foods[select-1].name, foods[select-1].price, money);
			}
		}
		else
		{
			System.out.println("없는 메뉴입니다.");
		}
		
		
		
		sc.close();
	}

}
