package code_it3;

import java.util.Scanner;

public class Main2 {
    // калькулятор чаевых
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double chai = sc.nextDouble();
        System.out.println("Чаевые " + (chai * 15) / 100);


        System.out.println("Введите кол-во рублей");
        double rubCount = new Scanner(System.in).nextDouble();

        System.out.println("Введите актуальный курс евро");
        double eurCount = new Scanner(System.in).nextDouble();

        System.out.println("Введите актуальный курс Доллара");
        double dolCount = new Scanner(System.in).nextDouble();

        System.out.println(rubCount + " рублей это " + rubCount * (1/eurCount) + " ");

    }
}
