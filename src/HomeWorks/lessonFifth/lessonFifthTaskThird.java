package HomeWorks.lessonFifth;
import java.util.Scanner;


//Ввести с консоли целое число. Посчитать количество единиц в его бинарном представлении (“1011” –> 3).
public class lessonFifthTaskThird {

    public static void main(String[] args) {
        bin();
        //showSum();
    }
    static String bin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше число");
        int a = sc.nextInt();
        String b = Integer.toBinaryString(a);
        System.out.println("Ваше число в бинарном представлеии будет " + b);
        return showSum(b);
    }
    private static String showSum(String b) {
        int sum = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '1') sum++;
        }
        System.out.println("Содержит = " + sum + " символов '1' ");
        return b;
    }
}