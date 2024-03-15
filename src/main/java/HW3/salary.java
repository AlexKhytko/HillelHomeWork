package HW3;

public class salary {
    public static void main(String[] args) {

        int priceHour = Integer.parseInt(args[0]);
        int tax = Integer.parseInt(args[1]);

        String[] monthName = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        double[] salariesWithoutTax = new double[12];
        double[] salariesWithTax = new double[12];
        double totalSalaryWithoutTax = 0;
        double totalSalaryWithTax = 0;

        for (int i = 0; i < monthDay.length; i++) {
            if (monthDay[i] == 28) {
                double salaryWithTax = 20 * 8 * priceHour;
                double salaryWithoutTax = salaryWithTax * (100 - tax) / 100;
                salariesWithoutTax[i] = salaryWithoutTax;
                salariesWithTax[i] = salaryWithTax;
                totalSalaryWithoutTax += salaryWithoutTax;
                totalSalaryWithTax += salaryWithTax;
                System.out.println(monthName[i] + "    " + salaryWithoutTax + "  " + salaryWithTax);
            }
            if (monthDay[i] == 31) {
                double salaryWithTax = 23 * 8 * priceHour;
                double salaryWithoutTax = salaryWithTax * (100 - tax) / 100;
                salariesWithoutTax[i] = salaryWithoutTax;
                salariesWithTax[i] = salaryWithTax;
                totalSalaryWithoutTax += salaryWithoutTax;
                totalSalaryWithTax += salaryWithTax;
                System.out.println(monthName[i] + "    " + salaryWithoutTax + "  " + salaryWithTax);
            } else if (monthDay[i] == 30){
                double salaryWithTax = 22 * 8 * priceHour;
                double salaryWithoutTax = salaryWithTax * (100 - tax) / 100;
                salariesWithoutTax[i] = salaryWithoutTax;
                salariesWithTax[i] = salaryWithTax;
                totalSalaryWithoutTax += salaryWithoutTax;
                totalSalaryWithTax += salaryWithTax;
                System.out.println(monthName[i] + "    " + salaryWithoutTax + "  " + salaryWithTax);
            }

        }
            System.out.println("TOTAL  " + totalSalaryWithoutTax + "  " + totalSalaryWithTax);

    }
}
