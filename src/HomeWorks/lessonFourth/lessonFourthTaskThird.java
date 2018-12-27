package HomeWorks.lessonFourth;
import java.util.Arrays;

public class lessonFourthTaskThird {
    // Заполнить массив числами от 100 до 0.
    public static void main(String[] args) {
        int [] array = new int [101];
        for (int i = 0; i <= 100; i++)
            array [i] = 100-i;
        String s = Arrays.toString(array);
        System.out.println(s);
    }
}