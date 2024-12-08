package code_it3;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        int a = 4;
        int b = 2;
        int dibApple = 5;
        int fullAps = 3;
        String names = "home";
        char c = 'a';
        int test = 10;

        //  System.out.println(a + b + names + fullAps);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int key = sc.nextInt();
        int bay = sc.nextInt();
        System.out.println("Cумма двух чисел = " + (key + bay));


        System.out.println("Введите 2 числа");
        int ki = sc.nextInt();
        int mi = sc.nextInt();
        System.out.println("Cумма двух чисел = " + (ki - mi));

    }
}
