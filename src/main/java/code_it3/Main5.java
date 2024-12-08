package code_it3;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Конвертер температур");
        System.out.println("Введите градусы цельсия");
        double celsiusCount = new Scanner(System.in).nextDouble();
        int coof = 32;
        double coof2 = 1.8;
        System.out.println(celsiusCount + " Градусов по цельсию " + (celsiusCount * coof2 + coof));

    }
}
