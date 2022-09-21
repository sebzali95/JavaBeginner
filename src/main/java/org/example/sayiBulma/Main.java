package org.example.sayiBulma;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,3,4,5,6,7};
        int aranacak = 1;
        boolean varMi = false;

        for (int sayi : sayilar){
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayı mevcuttur");
        }else {
            System.out.println("Sayı mevcut deyildir");
        }
    }
}
