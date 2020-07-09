package Rysowanie;

import java.util.Scanner;

public class Rectangle implements Draw {

    private int a;
    private int b;

    @Override
    public void draw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj bok a");
        int a = sc.nextInt();
        System.out.println("Podaj bok b");
        int b = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
