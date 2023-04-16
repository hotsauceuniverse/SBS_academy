package Day06;

public class Ex18 {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][3];
		int num = 1;
		
		
		for(int i=0; i<3; i++) {
			if(i%2==0) {	// i가 0, 2일 때 짝수 조건
				for(int j=0; j<3; j++) {
					// i가 고정일 때, j가 반복하는 형태
					// 둘의 위치를 바꿔 대입
					arr[j][i] = num++;
				}
			} else {	//i가 홀수 일 때 
				for(int j=2; j>=0; j--) {	// j가 감소할 때 값이 오르는 형태 
					arr[j][i] = num++;
				}
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
}
