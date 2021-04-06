package test;

import java.util.Scanner;

public class SeasonOfKor {

	public static void main(String[] args) {
		System.out.print("현재의 월을 입력>");
		
		Scanner s=new Scanner(System.in);
		int month = s.nextInt();
		
		switch(month) {
			case 3: case 4: case 5:
				System.out.println("봄,Spring");
				break;
			case 6: case 7: case 8:
				System.out.println("여름,Summer");
				break;
			case 9: case 10: case 11:
				System.out.println("가을,Fall");
				break;
			default :
				System.out.println("겨울,Winter");		
		}
		s.close();
	}

}
