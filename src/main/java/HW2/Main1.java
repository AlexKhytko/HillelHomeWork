import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
         //Розрахувати місячну і річну зарплатню з податками та без
        // Создание объекта Scanner для чтения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);
        // Введите данные с клавиатуры
        System.out.print("Введите кількість робочих годин на тиждень: ");
        double a1 = scanner.nextInt(); // Чтение целочисленного значения
        System.out.print("Введите вартість години: ");
        double a2 = scanner.nextDouble(); // Чтение значения с плавающей точкой
        System.out.print("Введите вісоток податку: ");
        double a3 = scanner.nextDouble(); // Чтение значения с плавающей точкой
        // Печать введенных данных
        System.out.println("Вы ввели кількість робочих годин на тиждень " + a1 + ", вартість години " + a2 + ", вісоток податку" + a3 + "%.");
        // Закрытие сканера после использования
        scanner.close();
        //кількість робочих годин на тиждень
       // double a1 = 40;
        //вартість години
       // double a2  = 16.8;
        //вісоток податку
       // double a3  = 19.5;
        //расчет
        double r1=(((a1*a2)*4)*((100-a3)/100));
        double r2=(a1*a2)*4;
        double r3=(((a1*a2)*4)*((100-a3)/100))*12;
        double r4=((a1*a2)*4)*12;

        // Задаем формат с двумя знаками после запятой

        DecimalFormat формат = new DecimalFormat("#.##");

           // Вивести в консоль за прикладом

        System.out.println(" Зарплатня на місяць без податків: " + формат.format(r1));
        System.out.println(" Зарплатня на місяць з податками: " + формат.format(r2));
        System.out.println(" Зарплатня на рік без податків: " + формат.format(r3));
        System.out.println(" Зарплатня на рік з податками: " + формат.format(r4));

              }
}
