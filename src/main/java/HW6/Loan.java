package HW6;
import java.lang.Math;
public class Loan {
    private String client;
        public double sumLoan;
    public int month;
    public double per;
  //  public double payment;
       public Loan () {};
       public void setSumLoan (double newSumLoan){
            sumLoan = newSumLoan;
        }
    public void setClient(String newClient) {
        client = newClient;
    }
    public void setPer(double newPer) {
        per = newPer;
    }
    public void setMonth(int newMonth) {
        month = newMonth;
    }

    public double getPayment() {
        double num =  (1 + (per/100));
        double quan = month;
        double payment = sumLoan * ((per/100) + (((per/100)/(Math.pow(num, quan)-1))));

        System.out.println("Dear client  " + client);
        System.out.println("Sum of Your loan is  " + sumLoan + " usd");
        System.out.println("Perсent on month  " + per + " %");
        System.out.println("Term loan  " + month + " month");
        System.out.println("Monthly payment " + payment + " usd");
return payment;
    }
}
