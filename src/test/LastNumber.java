package test;

public class LastNumber {

	public static void main(String[] args) {
		//10으로 나머지 연산을 하면 마지막자리를 얻는다.
		//system.out.println(12345%10);
		
		int num = 12345, sum = 0;
		
		while(num>0) {
			sum += num %10;
			System.out.println("sum="+sum+",sum="+num);
			num = num / 10;
			
		}
		System.out.println("각 자리수의 합="+sum);
	}

}
