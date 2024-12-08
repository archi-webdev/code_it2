package code_it3;

public class Main {
    public static void main(String[] args) {
        int a = 15;
        if (a < 15) {
            System.out.println("я бомж");
        } else if (a > 15) {
            System.out.println("Паша чёрт");
        } else if (a == 5) {
            System.out.println("Миша чёрт");
        }else  {
            System.out.println("мы все ебанаты ");
        }


        System.out.println((5 * 5) / 5);

        System.out.println("Температура по цельсию : " + 32);
        System.out.println(32 + " градуса по цельсию это " + (32*1.8*32) + " по фарингейту");


        System.out.println(100 + " рублей это " + (100 * (1/62.08f)) +  " долларов") ;
    }


}
