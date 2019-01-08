package HomeWorks.lessonFifth;
import java.util.Scanner;


//Ввести с консоли целое число. Посчитать количество единиц в его бинарном представлении (“1011” –> 3).
public class lessonFifthTaskThird {

    public static int a;
    public static int sum = 0;

    public static void main(String[] args) {
        bin();
        showSum();
    }

    public static String bin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше число");
        int a = sc.nextInt();
        String b = Integer.toBinaryString(a);
        System.out.println("Ваше число в бинарном представлеии будет " + b);
        return b;
    }

    public static void showSum() {
        for (int i = 0; i < b.length(); i++){
            if (b.charAt(i) == '1') sum++;
            System.out.println("Содержит = " + sum + " символов '1' ");
        }
    }
}