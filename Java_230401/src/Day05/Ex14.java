package Day05;

public class Ex14 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println("===="+i+"단===="); 
			for(int j=0; j<10; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}	
	}	
}
