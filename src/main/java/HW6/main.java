package HW6;
import java.util.Scanner;
public class main {
        public static void main(String[] args) {

//        Product milk = new Product();
//        milk.name = "Milk Svoya Linia";
//        milk.price = "29.00uah";
//        milk.code = "615416";
//        milk.avail = "+";
//milk.getName();
//milk.getPrice();
//milk.getCode();
//milk.getAvail();
//
//        milk.setName("Milk Yasne sonechko");
//        milk.setPrice("28.50uah");
//        milk.setCode("216519");
//        milk.setCode("+");
//
//        milk.setName("Milk Varto");
//        milk.setPrice("29.50uah");
//        milk.setCode("87864");
//        milk.setCode("+");
//
//        Product bread = new Product();
//        bread.name = "Bread Borodinsky";
//        bread.price = "14.00uah";
//        bread.code = "87327";
//        bread.avail = "-";
//        bread.getName();
//        bread.getPrice();
//        bread.getCode();
//        bread.getAvail();
//
//
//        Employee worker = new Employee();
//        worker.setFirstname("Jon");
//        worker.setSurname("Rembo");
//        worker.setPosition("worker");
//        worker.setSalaryHour("19.00uah");
//
//        Employee turner = new Employee();
//        turner.setFirstname("Rocky");
//        turner.setSurname("Balboa");
//        turner.setPosition("turner");
//        turner.setSalaryHour("23.00uah");
//
//        Employee welder = new Employee();
//        welder.setFirstname("Tango");
//        welder.setSurname("Cash");
//        welder.setPosition("welder");
//        welder.setSalaryHour("22.00uah");
//
//Triangle perimeter = new Triangle();
//
//        perimeter.sideA = 23;
//        perimeter.sideB = 44;
//        perimeter.sideC = 48;
//        perimeter.getSideA();
//        perimeter.getSideB();
//        perimeter.getSideC();
//        perimeter.getPer();
//
//Triangle square = new Triangle();
//        square.sideA = perimeter.sideA;
//        square.sideB = perimeter.sideB;
//        square.sideC = perimeter.sideC;
//        square.getSquare();
//          }

                Loan payment = new Loan();
                payment.setClient("Bruce Lee");
                payment.setSumLoan(1600);
                payment.setPer(5.8);
                payment.setMonth(11);
                payment.getPayment();

                Loan newPayment = new Loan();
                newPayment.setClient("Chak Norris");
                newPayment.setSumLoan(2300);
                newPayment.setPer(7.8);
                newPayment.setMonth(13);
                newPayment.getPayment();

                Loan payment1 = new Loan();
                payment1.setClient("Jane Clod Van Damm");
                payment1.setSumLoan(6500);
                payment1.setPer(6.7);
                payment1.setMonth(15);
                payment1.getPayment();
        }
}

