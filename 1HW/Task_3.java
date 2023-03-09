
// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Введите число: ");
       double number1 = in.nextDouble();
       System.out.println("Введите действие: ");
       String action = in.next();
       System.out.println("Введите второе число: ");
       double number2 = in.nextDouble();
       in.close();
       double result = 0;
       switch (action) {
        case "+":
            result = number1 + number2;
            System.out.printf("%.2f %s %.2f = %.2f", number1, action, number2, result);
            break;
        case "-":
            result = number1 - number2;
            System.out.printf("%.2f %s %.2f = %.2f", number1, action, number2, result);
            break;
        case "*":
            result = number1 * number2;
            System.out.printf("%.2f %s %.2f = %.2f", number1, action, number2, result);
            break;
        case "/":
            result = number1 / number2;
            System.out.printf("%.2f %s %.2f = %.2f", number1, action, number2, result);
            break;    
        default:
            System.out.println("Неизвестное действие");
            break;
       }
    }
}
