package HomeWorks.lessonFifth;
import java.util.Random;



//Написать свой вариант ф-и Arrays.toString() для int[].
public class lessonFifthTaskSecond {
    public static String toString (int [] array){
        String a = "";
        for (int i = 0; i < array.length; i++){
            a = a + array.length + " ";
        }
        return a;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 7, 8};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(10);
            System.out.println(toString(arr));
        }
    }
}

