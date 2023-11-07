package ksy;

import java.util.Scanner;

// 직사각형 별찍기
public class DrawRectangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String star = "";

        for (int i = 0; i < a; i++) {
            star += "*";
        }

        for (int i = 0; i < b; i++) {
            System.out.println(star);
        }
    }
}
