package HW4;

import java.util.Scanner;

public class MainTradeDiscount {
    public static void main(String[] args) {

        int choiceProduct = Integer.parseInt(args[0]);

        double [] discounts =  {0, 5, 10, 12, 12.4, 12.8, 13.2, 13.6, 15};

        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            System.out.print("Введите количество единиц выбранного товара: ");
            System.out.println();

            double myProduct = scanner.nextInt();
            double myPrice = myProduct * choiceProduct;

            System.out.println("Ваша полная сумма за " + myProduct + " шт. товара - " + myPrice + " гривен");
            System.out.println();

            if (myProduct <= 10) {
                double dis0 = myPrice * discounts[0];
                double price0 = myPrice;

                System.out.println("Ваша скидка - " + discounts[0] + "% или " + dis0 + " гривен");
                System.out.println();
                System.out.println("Сумма за весь товар со скидкой " + price0 + " гривен");
            }
            if (myProduct >= 11 && myProduct <= 20) {
                double dis1 = myPrice * (discounts[1] / 100);
                double price1 = (myPrice) - dis1;

                System.out.println("Ваша скидка - " + discounts[1] + "% или " + dis1 + " гривен");
                System.out.println();
                System.out.println("Сумма за весь товар со скидкой " + price1 + " гривен");
            }
            if (myProduct >= 21 && myProduct <= 30) {
                double dis2 = myPrice * (discounts[2] / 100);
                double price2 = (myPrice) - dis2;

                System.out.println("Ваша скидка - " + discounts[2] + "% или " + dis2 + " гривен");
                System.out.println();
                System.out.println("Сумма за весь товар со скидкой " + price2 + " гривен");
            }
            if (myProduct >= 31 && myProduct <= 40) {
                double dis3 = myPrice * (discounts[3] / 100);
                double price3 = (myPrice) - dis3;

                System.out.println("Ваша скидка - " + discounts[3] + "% или " + dis3 + " гривен");
                System.out.println();
                System.out.println("Сумма за весь товар со скидкой " + price3 + " гривен");
            }
            if (myProduct >= 41 && myProduct <= 50) {
                double dis4 = myPrice * (discounts[4] / 100);
                double price4 = (myPrice) - dis4;

                System.out.println("Ваша скидка - " + discounts[4] + "% или " + dis4 + " гривен");
                System.out.println();
                System.out.println("Сумма за весь товар со скидкой " + price4 + " гривен");
            }
            if (myProduct >= 51 && myProduct <= 60) {
                double dis5 = myPrice * (discounts[5] / 100);
                double price5 = (myPrice) - dis5;

                System.out.println("Ваша скидка - " + discounts[5] + "% или " + dis5 + " гривен");
                System.out.println();
                System.out.println("Сумма за весь товар со скидкой " + price5 + " гривен");
            }
            if (myProduct >= 61 && myProduct <= 70) {
                double dis6 = myPrice * (discounts[6] / 100);
                double price6 = (myPrice) - dis6;

                System.out.println("Ваша скидка - " + discounts[6] + "% или " + dis6 + " гривен");
                System.out.println();
                System.out.println("Сумма за весь товар со скидкой " + price6 + " гривен");
            }
            if (myProduct >= 71 && myProduct <= 80) {
                double dis7 = myPrice * (discounts[7] / 100);
                double price7 = (myPrice) - dis7;

                System.out.println("Ваша скидка - " + discounts[7] + "% или " + dis7 + " гривен");
                System.out.println();
                System.out.println("Сумма за весь товар со скидкой " + price7 + " гривен");
            }
            else if(myProduct >= 81) {
                double dis8 = myPrice * (discounts[8] / 100);
                double price8 = (myPrice) - dis8;

                System.out.println("Ваша скидка - " + discounts[8] + "% или " + dis8 + " гривен");
                System.out.println();
                System.out.println("Сумма за весь товар со скидкой " + price8 + " гривен");
            }
            System.out.print("Do you want to continue(y/n)?: ");
            System.out.println();
            String answer = scanner.next();
            repeat = answer.equalsIgnoreCase("y");
        }
    }
}


