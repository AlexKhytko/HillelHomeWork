package example;

public class Salary {

    public String nameWorker;
    public double workHourWeek;
    public double priceHour;
    public double tax;
    public double Calculation;

     public Salary(){};

    public void setNameWorker(String nameWorker) {
        this.nameWorker = nameWorker;
    }

    public void setWorkHourWeek(double newWorkHourWeek) {
       workHourWeek = newWorkHourWeek;
    }
    public void setPriceHour(double newPriceHour) {
        priceHour = newPriceHour;
    }
    public void setTax(double newTax) {
        tax = newTax;
    }

    public double[] getCalculation() {
        double[] Calculation = new double[4];
        double salaryMonthWithTax = (workHourWeek * priceHour)*4;
        double salaryMonthWithOutTax = salaryMonthWithTax * ((100 - tax)/ 100);
        double salaryYearWithTax = ((workHourWeek * priceHour)*4)*12;
        double salaryYearWithOutTax = salaryYearWithTax * ((100 - tax)/100);
        Calculation[0] = salaryMonthWithTax;
        Calculation[1] = salaryMonthWithOutTax;
        Calculation[2] = salaryYearWithTax;
        Calculation[3] = salaryYearWithOutTax;
        return Calculation;
    }

}
