package Day05;

public class Ex17 {

	public static void main(String[] args) {
		
		int a[][] = new int[3][3];
		int number = 1;
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				a[i][j] = number++;
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=========");
		
		
		int arr[][] = new int[3][3];
		int num = 1;
		
		for(int i=0; i<3; i++) {
			if(i%2 == 0) {	// 세로열이 짝수
				for(int j=0; j<3; j++) {
					arr[i][j] = num++;
				}
			} else {	// 세로열이 홀수
				for(int j=2; j>=0; j--) {
					arr[i][j] = num++;
				}
			}	
		}
		
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}


// 과제 + 달팽이
// 1 6 7
// 2 5 8 
// 3 4 9

