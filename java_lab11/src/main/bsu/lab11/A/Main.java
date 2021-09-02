package main.bsu.lab11.A;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    /** TASK
     * Ввести число, занести его цифры в стек. Вывести число, у которого цифры
     * идут в обратном порядке.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        Stack<String> digits;

        while(true) {
            System.out.println("Введите положительное число: ");
            number = scanner.nextInt();
            if (number >= 1) {
                digits = chtoto(String.valueOf(number));
                System.out.println("Число с числами в обратном порядке:");
                printElementsOfStack(digits);
                break;
            }
            else {
                System.out.println("Вы ввели слишком маленькое значение. Попробуйте снова.");
            }
        }
    }

    private static Stack<String> chtoto(String number){
        Stack<String> digits = new Stack<String>();
        for (int i = 0; i < number.length(); i++){
            digits.push(number.substring(i,i+1));
        }
        return digits;
    }

    private static void printElementsOfStack(Stack<String> stack){
        int i = 0;
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
