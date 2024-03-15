package HW4;

import java.util.Scanner;

public class MainTrade {
    public static void main(String[] args) {

        int choiceProduct = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество единиц выбранного товара: ");
        System.out.println();
        double productNumber = scanner.nextInt();

        if ((productNumber >= 10) && (productNumber <= 20)) {
            double fistPrice = choiceProduct * productNumber;
            double fistDicount = fistPrice * 0.05;

            System.out.println("Сумма товара " + fistPrice + " гривен");
            System.out.println();
            System.out.println("Ваша скидка - 5% " + fistDicount + " гривен");
        }
        else if ((productNumber >= 21) && (productNumber <= 30)) {
            double secondPrice = choiceProduct * productNumber;
            double secondDicount = secondPrice * 0.05;

            System.out.println("Сумма товара " + secondPrice + " гривен");
            System.out.println();
            System.out.println("Ваша скидка - 10% " + secondDicount + " гривен");

        } else if ((productNumber >= 31)&& (productNumber <= 40)) {
            double thirdPrice = choiceProduct * productNumber;
            double thirdDicount = thirdPrice * 0.12;

            System.out.println("Сумма товара " + thirdPrice + " гривен");
            System.out.println();
            System.out.println("Ваша скидка - 12% " + thirdDicount + " гривен");

        }
        else if ((productNumber >= 41) && (productNumber <= 79)) {
            double forthPrice = choiceProduct * productNumber;
            double forthDicount = forthPrice * 0.124;

            System.out.println("Сумма товара " + forthPrice + " гривен");
            System.out.println();
            System.out.println("Ваша скидка - 12.4% " + forthDicount + " гривен");

        }

        else if (productNumber >= 80) {
            double forthPrice = choiceProduct * productNumber;
            double forthDicount = forthPrice * 0.13;

            System.out.println("Сумма товара " + forthPrice + " гривен");
            System.out.println();
            System.out.println("Ваша скидка - 13% " + forthDicount + " гривен");

        }
    }
}
