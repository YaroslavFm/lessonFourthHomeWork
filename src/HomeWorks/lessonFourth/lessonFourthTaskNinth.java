package HomeWorks.lessonFourth;
import java.util.Arrays;


//Написать метод для зеркального переворота элементов в массиве ([1, 2, 3, 4] -> [4, 3, 2, 1]).
public class lessonFourthTaskNinth {
    public static int[] backToStart (int[] arr) {
        for (int i = 0, j = arr.length-1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(Arrays.toString(backToStart(arr)));
    }
}
