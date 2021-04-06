package test;

import java.util.Scanner;

//import java.util.Scanner;

public class ScoreGrdaeCalculator {

	public static void main(String[] args) {
//		int score = 0;
//		char grade;
//		
//		System.out.print("점수를 입력하세요>");
//		Scanner s = new Scanner(System.in);
//		score = s.nextInt();
//		
//		if(score>=90) {
//			grade='A';
//		}else if(score>=80) {
//			grade='B';
//		}else if(score>=70) {
//			grade='C';
//		}else if(score>=60) {
//			grade='D';
//		}else {
//			grade='F';
//		}
//		System.out.println("학점은 "+grade+"입니다.");
		
		int score = 0;
		char grade = ' ', opt = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("점수를 입력>");
		score = s.nextInt();
		
		if(score>90) {
			grade = 'A';
			if(score>=98) {
				opt = '+';
			}else if(score<94) {
				opt = '-';
			}		
		}else if(score>80) {
			grade = 'B';{
			if(score>=84) {
				opt = '+';	
			}else if(score<84) {
				opt = '-';
			}
			}
		}
		System.out.printf("학점은%c%c",grade,opt);
	}

}
