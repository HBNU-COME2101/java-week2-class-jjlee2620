package week2;

import java.util.Scanner;

public class chapter1_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = -1;

        while (age <= 0) {
            System.out.print("나이 >> ");
            age = sc.nextInt();

            if (age <= 0) {
                System.out.print("나이는 양수로만 입력하세요.\n");
            }
        }

        int red = age / 10;
        int blue = (age%10) / 5;
        int yellow = age % 5;
        int result = red + blue + yellow;
        
        System.out.print("빨간 초 " + red + "개, 파란 초 " + blue + "개, 노란 초 " + yellow + "개. 총 " + result + "개가 필요합니다.");
        
        sc.close();
    }
}
