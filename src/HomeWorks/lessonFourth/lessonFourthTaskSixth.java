package HomeWorks.lessonFourth;

public class lessonFourthTaskSixth {
    //Найти в массиве чисел элементы с наибольшим и наименьшим значениями.
    public static void main(String[] args) {
        int [] x = {51, 22, 13, 61, 12, 61, 32, 77, 21};
        int min = x[0];
        int max = x[0];
        for(int i = 0; i < x.length; i++) {
            if(x[i] > max)
                max = x[i];

            if(x[i] < min)
                min = x[i];
        }
        System.out.println("min " + min+", " + "max " + max );
    }
}
