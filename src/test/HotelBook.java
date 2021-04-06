package test;

import java.util.Scanner;

public class HotelBook {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int roomsu;
		
		System.out.print("방의 갯수를 입력하세요 :");
		roomsu = s.nextInt();
		
		boolean room[] = new boolean[roomsu]; //입력한 방의갯수만큼 room배열 생성 true-사용,false-빈방
		
		while(true) {
			System.out.println("----------------------");
			System.out.println("1.입실|2.퇴실|3.보기|4.종료");
			int select = s.nextInt();
			if(select==4)                          // 4를 입력하면 반복문 종료
				break;
			int roomNum; 						   // 방 번호
			boolean check = true;
			
			switch(select) {
			
			case 1:
				do {
					System.out.print("입실하실 방의 번호를 입력하세요 : ");
					roomNum = s.nextInt();
					if(roomNum<1 || roomNum>roomsu)
						System.out.println(roomNum+"호실은 없습니다.");
					else {
						check = false;
					}
				}while(check);
				if(room[roomNum-1])
					System.out.println(roomNum+"호실은 사용중입니다.");
				else {
					room[roomNum-1] = true;
					System.out.println(roomNum+"호실에 입실하셨습니다.");
				}
				break;
				
			case 2:
				do {
					System.out.print("퇴실하실 방의 번호를 입력하세요 : ");
					roomNum = s.nextInt();
					if(roomNum<1 || roomNum>roomsu)
						System.out.println(roomNum+"호실은 없습니다.");
					else {
						check = false;
					}	
				}while(check);
				if(room[roomNum-1]) {
					room[roomNum-1] = false;
					System.out.println(roomNum+"호실에서 퇴실하셨습니다.");
				} else {
					System.out.println(roomNum+"호실은 빈방입니다.");
				}
				break;
				
			case 3:
				for(int i=0;i<room.length;i++)
					if(room[i]) {
						System.out.println(i+1+"은 사용중입니다.");
					} else {
						System.out.println(i+1+"은 빈방입니다.");
					}
				break;
			default :
				System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		s.close();
	}

}
