package Rysowanie;

import java.util.Scanner;

public class Tree implements Draw {
    private int high;

    public void draw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wysokość: ");
        high = sc.nextInt();
        int star = 1;
        int space = high-1;
        for (int i = 0; i < high; i++) {
            drawSpace(space);
            drawStars(star);
            System.out.println();
            star+=2;
            space--;
            }

        }

    private void drawStars(int stars) {
        for (int i = 0; i <  stars; i++) {
            System.out.print("*");
        }
    }

    private void drawSpace(int high) {
        for (int i = 0; i <high; i++) {
            System.out.print(" ");

        }
    }
}
