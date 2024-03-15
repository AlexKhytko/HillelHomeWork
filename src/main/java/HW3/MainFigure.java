package HW3;

import java.util.Scanner;

public class MainFigure {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
        // Введите данные с клавиатуры
        System.out.print("What figure should I draw?: ");
        System.out.println();
        System.out.print("1 - rectangle; 2 - right triangle; 3 - left triangle; 4 - trianle");
        System.out.println();
        int yourNumber = scanner.nextInt();
        if (yourNumber ==1) {
            System.out.print("What wigth?: ");
            System.out.println();
            int width = scanner.nextInt();
            System.out.print("What height?: ");
            System.out.println();
            int height = scanner.nextInt();

        // Цикл для рисования строк прямоугольника
        for (int i = 0; i < height; i++) {
            // Цикл для рисования символов в каждой строке
         for (int j = 0; j < width; j++) {
            System.out.print("*");
          } System.out.println();
        }
        }
           else if (yourNumber ==2) {
                System.out.print("What height?: ");
                System.out.println();
                int heightL = scanner.nextInt();

                // Цикл для рисования строк прямоугольника
                for (int i = 1; i <= heightL; i++) {
                    // Внутренний цикл для рисования символов в каждой строке
                    for (int j = 1; j <= i; j++)  {
                        System.out.print("*");
                    } System.out.println();
                }
           }
        else if (yourNumber ==3) {
            System.out.print("What height?: ");
            System.out.println();
            int heightR = scanner.nextInt();

            // Цикл для рисования строк прямоугольника
            for (int i = 1; i <= heightR; i++) {
                // Внутренний цикл для рисования символов в каждой строке
                for (int j = 1; j <= heightR - i; j++)  {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*"); // Выводим символы "*"
                }
                System.out.println();
            }
        }
        else if (yourNumber ==4) {
            System.out.print("What height?: ");
            System.out.println();
            int heightQ = scanner.nextInt();

            // Цикл для рисования строк прямоугольника
            for (int i = 1; i <= heightQ; i++) {
                for (int j = 1; j <= heightQ - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        System.out.print("Do you want to continue(y/n)?: ");
        System.out.println();
        String answer = scanner.next();
        repeat = answer.equalsIgnoreCase("y");
    }
    }}

