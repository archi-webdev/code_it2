package code_it3;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("Имитация работы вендингого аппарата : ");
        int twix = 77;
        int mars = 78;
        int snikers = 100;
        int water = 50;

        boolean isCanBuy = false;

        int moneyCount = new Scanner(System.in).nextInt();

        if (moneyCount >= twix) {
            System.out.println("Вы можете купить твикс ");
            isCanBuy = true;
        } else if (moneyCount >= mars) {
            System.out.println("Вы можете купить марс ");
            isCanBuy = true;
        } else if (moneyCount >= water) {
            System.out.println("Вы можете купить воду ");
            isCanBuy = true;
        } else if (moneyCount >= snikers) {
            System.out.println("Вы можете купить сникерс ");
            isCanBuy = true;
        } else {
            System.out.println("Я бомж");
        }

        if (isCanBuy == false) {
            System.out.println("денег нет");
        }


    }
}
