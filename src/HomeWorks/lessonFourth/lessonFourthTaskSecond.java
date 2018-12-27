package HomeWorks.lessonFourth;

public class lessonFourthTaskSecond {
    //Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
    public static void main(String[] args) {
        for (int a = 1; a <= 100; a++) {
            if (a % 3 == 0)
            System.out.println("a = " + a);
        }
    }
}