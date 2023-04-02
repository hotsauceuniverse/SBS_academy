package Day02;

//	연산자
//	산술연산자(+,-,*,/,%)
//	대입연산자(=)
//	증감연산자(a++, a--, ++a, --a)
//	비교연산자(<, >, =<, =>, ==, !=)
//	논리연산자(&&, ||, !)
//	삼항연산자(A? a:b) - A가 참일 경우 a, 거짓일 경우 b
//	비트연산자(&,|, ^, ~, <<, >>, >>>)

public class Ex04 {

	public static void main(String[] args) {
//		연습문제 : A학생의 과목별 점수는 다음과 같습니다. A의 평균 접수를 구하시오
//		국 : 85 / 영 : 75 / 수 : 60
		
		int a = 85;
		int b = 75;
		int c = 60;
		
		int total = a+b+c;
		System.out.println("평균점수 : " + total / 3);
		
	}
}
