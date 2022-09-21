package org.example.loopDemo;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitdi");

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü Bitdi");

        int j = 20;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

        System.out.println("Do while döngüsü bitdi");
    }


}
