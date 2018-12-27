package HomeWorks.lessonFourth;

public class lessonFourthTaskFirst {
    public static void main(String[] args) {
        //Вывести на экран числа от 10 до 20 с помощью всех известных циклов.
        //if
        for (int a = 10; a <= 20; a++) {
            System.out.println("a = " + a);
        }

        //while
        int b = 10;
        while (b <= 20 && b >= 10) {
            System.out.println("b = " + b);
            b++;
        }
        //do/while
        int i = 10;
        do {
            System.out.println("c = " + i++); } while (i++ <= 20);
    }
}

