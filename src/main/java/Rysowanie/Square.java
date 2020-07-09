package Rysowanie;

import java.util.Scanner;

public class Square implements Draw {
    private int a;
    @Override
    public void draw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj jaki powinien mieć kwadrat bok");
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
