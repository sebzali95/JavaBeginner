package org.example.reCapDemo2;

public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2, 2.5, 3.7, 4.4, 5.7, 6.9};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam = " + total);
        System.out.println("En büyük = " + max);
    }
}
