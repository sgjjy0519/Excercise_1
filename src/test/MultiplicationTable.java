package test;

public class MultiplicationTable {

	public static void main(String[] args) {
		int a,b;
		
		for(a=2;a<=9;a++) {
			for(b=1;b<=9;b++) {
				System.out.println(a+"*"+b+"="+(a*b));
			}
		System.out.println();
		}
	}

}
