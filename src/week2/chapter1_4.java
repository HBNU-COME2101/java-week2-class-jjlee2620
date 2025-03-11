package week2;

import java.util.Scanner;

public class chapter1_4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("여행지 >> ");
		String place = sc.next();
		
		System.out.print("인원수 >> ");
		int count = sc.nextInt();
		
		System.out.print("숙박일 >> ");
		int day = sc.nextInt();
		
		System.out.print("1인당 항공료 >> ");
		int cost = sc.nextInt();
		
		System.out.print("1방 숙박비 >> ");
		int roomCost = sc.nextInt();
		
		int roomCount = (count+1)/2;
		int result = (count*cost) + (roomCount*roomCost*day);
		
		System.out.print(count + "명의 " + place + " " + day + "박 " + (day+1) + "일 여행에는 " + roomCount + "개 필요하며 경비는 " + result + "원입니다.");
		
		sc.close();
	}
}
