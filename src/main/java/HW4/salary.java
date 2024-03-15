package HW4;

public class salary {
    public static void main(String[] args) {

        int month = Integer.parseInt(args[0])-1;
        int priceHour = Integer.parseInt(args[1]);
        int tax = Integer.parseInt(args[2]);

        int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int value = monthDay[month];

        if (value == 28) {
            double salaryWithTax = 20 * 8 * priceHour;
            double salaryWithoutTax = salaryWithTax * (100 - tax )/ 100;
            System.out.println("Ваша зарплата без налога " + salaryWithoutTax + " баксов");
            System.out.println("Ваша зарплата с налогом " + salaryWithTax+ " баксов");
        }
        if (value == 30) {
            double salaryWithTax = 22 * 8 * priceHour;
            double salaryWithoutTax = salaryWithTax * (100 - tax )/ 100;
            System.out.println("Ваша зарплата без налога " + salaryWithoutTax + " баксов");
            System.out.println("Ваша зарплата с налогом " + salaryWithTax+ " баксов");
        }
        else if (value == 31) {
            double salaryWithTax = 23 * 8 * priceHour;
            double salaryWithoutTax = salaryWithTax * (100 - tax )/ 100;
            System.out.println("Ваша зарплата без налога " + salaryWithoutTax + " баксов");
            System.out.println("Ваша зарплата с налогом " + salaryWithTax+ " баксов");
        }

       }
}
