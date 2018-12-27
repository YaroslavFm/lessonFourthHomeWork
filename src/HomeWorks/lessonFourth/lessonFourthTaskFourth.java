package HomeWorks.lessonFourth;

public class lessonFourthTaskFourth {
    //Дано массив из 10 целых чисел. Вывести на экран сумму всех его элементов кроме первого и последнего.
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int a = x.length-9;
        int b = x.length;
        int c;
        for(int i=0; i<x.length; i++) {
            sum=sum+x[i];
        }
        c = sum - a - b;
        System.out.println(c);
    }
}

//44