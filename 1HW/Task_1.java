// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
import java.util.Scanner;



public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner iScanner = new Scanner(System.in);
        int number = iScanner.nextInt();
        iScanner.close();
        int sum = 0;
        int multiply = 1;
        for (int i = 1 ; i <= number; i++) {
            sum += i;
            multiply *= i;
        }
        System.out.printf("Треугольное число равно %d \nФакториал равен %d ", sum, multiply );
    }
}
