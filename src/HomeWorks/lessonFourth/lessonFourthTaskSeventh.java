package HomeWorks.lessonFourth;

public class lessonFourthTaskSeventh {
    //Найти в массиве число, которое повторяется наибольшее количество раз. Не использовать коллекции.
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4, 6, 1, 6, 6, 6};
        int res = 0, cc, cp = 0;
        for (int i = 0; i < a.length; i++) { cc = 0;
            for (int j = 0; j < a.length; j++) { if (a[j] == a[i])
                cc++; }
            if (cc > cp) { cp = cc;
                res = a[i]; }
        }
        System.out.println(res);
    }
}