package PrecyzjaLiczb;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PrecyzjaLiczb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę większą od 0");
        double i1 = sc.nextDouble();
        if(i1>0){
        for (double i=0; i < i1; i+=0.1) {
            System.out.printf("%.1f, ", i );
        }} else {
            for (double i = 0; i > i1; i-=0.1) {
                System.out.printf("%.1f, ", i);
            }
        }

        }
    }
