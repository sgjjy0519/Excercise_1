package test;

public class CreateStar {

	public static void main(String[] args) {
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
		
//		for( i=1;i<=5;i++) {
//			System.out.println("**********");
//		}
//		System.out.println();
		
		for(int i=1;i<=5;i++) { // 행 (줄)
//				System.out.println("**********");
			for(int j=1;j<=i;j++) { // 열 (옆으로 몇칸)
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
