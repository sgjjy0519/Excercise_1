package test;

public class MathAddSubMulDi {

	public static void main(String[] args) {
		MyMath mm = new MyMath();                      // MyMath 객체생성
		long result1 = mm.add(5L, 3L);				   // MyMath 객체사용( 객체의 메서드 호출 )
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.max(5L, 3L);
		long result6 = mm.min(5L, 3L);
		mm.printGugudan(12);

		System.out.println("add(5L, 3L) = "+result1);
		System.out.println("subtract(5L, 3L) = "+result2);
		System.out.println("multiply(5L, 3L) = "+result3);
		System.out.println("divide(5L, 3L) = "+result4);
		System.out.println("max(5L, 3L) = "+result5);
		System.out.println("min(5L, 3L) = "+result6);
	}

}
 
class MyMath{                                           // MyMath 클래스생성
	long add(long a, long b) {							// 메서드 작성
		return a + b;
	}
	// 두 값을 받아서 둘중에 큰값을 반환하는 메서드를 작성하시오.
	long max(long a, long b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
//		long result = 0;
//		if(a>b) {
//			result = a;
//		}else {
//			result = b;
//		}
//		return a > b ? a:b;
	}
	long min(long a, long b) {
		return a > b ? b:a;
	}
	
	long subtract(long a, long b) {
		return a - b;
	}
	
	long multiply(long a, long b) {
		return a * b;
	}
	double divide(double a, double b) {
		return a / b;
	}
	void printGugudan(int dan) {
		if(!(2<=dan &&  dan<=9))
			return; // 입력받은 단(dan)이 2~9가 아니면 , 메서드 종료하고 돌아가기
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
		//return;
	}
}
