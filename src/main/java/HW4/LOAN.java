package HW3;

import java.util.Scanner;
import java.lang.Math;
public class LOAN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму кредита ");
        double loan = scanner.nextInt();
        System.out.println("Введите месячный процент ");
        double per = scanner.nextInt();
        System.out.println("Выберите свой вариант  ");
        System.out.println();
        System.out.println("1 - Розрахувати кількість щомісячних платежів, які необхідно зробити для повного погашення кредиту");
        System.out.println("2 - Розрахувати суму щомісячного платежу");
        double yourNumber = scanner.nextInt();
        double num =  (1 + (per/100));
        if (yourNumber == 1){
            System.out.println("Введiть суму щомісячного взносу ");
            System.out.println();
            double sum = scanner.nextInt();
             // Число, для которого вычисляем логарифм
            double sumMonth = Math.log(((per/100)/((sum/loan)-(per/100)))+1)/(Math.log(num));

             System.out.println("Кількість щомісячних платежів, які необхідно зробити для повного погашення " + sumMonth);
        }
        else if (yourNumber == 2) {
            System.out.println("Введiть кількість платежів ");
            System.out.println();
            double quan = scanner.nextInt();
            double quanMonth = loan * ((per/100) + (((per/100)/(Math.pow(num, quan)-1))));
            System.out.println("Cума щомісячного платежу " + quanMonth);
        }
        }
}

