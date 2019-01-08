package HomeWorks.lessonFourth;
import java.util.Arrays;

//Написать метод, который заполнит массив
// произвольного размера числами по возрастанию,
// начиная с центра массива, например,
// [5,4,3,2,1,0,1,2,3,4,5].

public class lessonFourthTaskTenth {
    public static void main(String[] args) {
        int a = 11;
        int [] arr = new int [a];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Math.abs(a/2-i);
        }
        System.out.print(Arrays.toString(arr));

    }
}

