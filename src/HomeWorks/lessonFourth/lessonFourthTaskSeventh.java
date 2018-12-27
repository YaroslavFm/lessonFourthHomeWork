package HomeWorks.lessonFourth;

public class lessonFourthTaskSeventh {
    //Найти в массиве число, которое повторяется наибольшее количество раз. Не использовать коллекции.
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4, 6, 1, 6, 6, 6};
        int num = 0;
        int count = 0;
        int countTemp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) { if (a[j] == a[i])
                countTemp++; }
            if (countTemp > count) { num = a[i];
                count = countTemp; }
        }
        System.out.println(num);
    }
}