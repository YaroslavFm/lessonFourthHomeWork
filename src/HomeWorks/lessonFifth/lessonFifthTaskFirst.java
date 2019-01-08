package HomeWorks.lessonFifth;



//Написать свой вариант ф-и Arrays.equals для short[].
public class lessonFifthTaskFirst {
     public static boolean equal (short [] arr1,short [] arr2){
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++){
            if (arr1 [i] != arr2 [i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        short [] a = {2, 4, 6, -7, 8, 8};
        short [] b = {2, 4, 6, -7, 8, 8};
        short [] c = {2, 4, 8};

        if (equal(a,b)){
            System.out.println("Масив 1ый равен 2му");
        }
        else {
            System.out.println("Масив 1ый не равен 2му");
        }
        if (equal(a,c)){
            System.out.println("Масив 1ый равен 3му");
        }
        else {
            System.out.println("Масив 1ый не равен 3му");
        }
        if (equal(b,c)){
            System.out.println("Масив 2ой равен 3му");
        }
        else {
            System.out.println("Масив 2ый не равен 3му");
        }
    }
}
