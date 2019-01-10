package HomeWorks.lessonFifth;
import java.util.Scanner;

public class myCalc {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numFirst = getInt();
        int numSecond = getInt();
        char operation = getOperation();
        int result = calc(numFirst, numSecond, operation);
        System.out.println("Ваш результат " + result );

    }
    public static int getInt (){
        System.out.println("Введите целое число");
        int num;
        if (sc.hasNextInt()){
            num = sc.nextInt();
        }
        else {
            System.out.println("Ошибка. А ну ка введи целое число!");
            sc.next();
            num = getInt();
        }
        return num;
    }
    public static char getOperation (){
        System.out.println("Введите операцию");
        char operation;
        if (sc.hasNext()){
            operation = sc.next().charAt(0);
        }
        else {
            System.out.println("Ошибка! Ну емае, я не все умею делать, давай нормальную операцию!");
            sc.next();
            operation = getOperation();
        }
        return operation;
    }
    public static int calc (int numFirst, int numSecond, char operation){
        int result = 0;
        switch (operation){
            case '+':
                result = numFirst + numSecond;
                break;
            case '-':
                result = numFirst - numSecond;
                break;
            case '*':
                result = numFirst * numSecond;
                break;
            case '/':
                result = numFirst / numSecond;
                break;
            default:
                System.out.println("Твоя операция мною не поддерживается, давай как введи что нибудь попроще");
                result = calc(numFirst, numSecond, getOperation());
        }
        return result;
    }

}
