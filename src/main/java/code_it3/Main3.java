package code_it3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int carrot = 23;
        int apple = 1234;
        System.out.println((carrot+apple) / 2);

      //  byte b = -127; // 8 бит
        short b1 = 32767; // 16 бит 2b
        char ch = 'b';
        int n = 32; // 32 бита дефолт
        long l = 1_000_000; // 64 бита 8b
        float f = 2.5F; // 32 bita
        double d = 5.5D; // 64 bita
        boolean bool = false; // true/false

       // System.out.println(Integer.MAX_VALUE);
       // System.out.println(Long.MAX_VALUE);
       // System.out.println(Float.MAX_VALUE);
      //  System.out.println(Double.MAX_VALUE);


       // System.out.println("Введите свой вес(кг): ");
      //  double weight = new Scanner(System.in).nextDouble();
      //  System.out.println("Введите свой рост(м): ");
       // double height = new Scanner(System.in).nextDouble();
      //  System.out.println("BMI " + weight / (height * height));

        System.out.println("! добро пожаловать в кальякулятор умножения !");
        System.out.println("Введите первое число: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println( a + " * " + b + " = " + a * b);


    }



}
