package example;

public class SalaryYear{
public double workHourWeek;
public double salaryYearWithTax;
public double tax;
    public double[] CalculationSalaryYear;

    public SalaryYear(){};

    public void setWorkHourWeek(double workHourWeek) {
        this.workHourWeek = workHourWeek;
    }
    public void setSalaryYearWithTax(double salaryYearWithTax) {
        this.salaryYearWithTax = salaryYearWithTax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    public double[] getCalculationSalaryYear() {
        double[] CalculationSalaryYear = new double[2];
        double priceHourYearWithTax = salaryYearWithTax / 12 / 4 / workHourWeek;
        double priceHourYearWithoutTax = priceHourYearWithTax * ((100 - tax)/ 100);
        CalculationSalaryYear[0] = priceHourYearWithTax;
        CalculationSalaryYear[1] = priceHourYearWithoutTax;
               return CalculationSalaryYear;
    }


    //Розрахувати місячну і річну зарплатню з податками та без
    //кількість робочих годин на тиждень
    // double b1 = 40;
    //річна зарплатня з податками
    //  double b2  = 120000;
    //вісоток податку
    //   double b3  = 25;
    //расчет


}
