package HW14;

import org.junit.Test;

public class ResultQuadratic{
        @Test
        public void dicisionResultTwoRootsTest () {
            int a = -3;
            int b = 2;
            int c = 1;

            Discriminant result = new Discriminant(a, b, c);
            double newResult = result.discriminantResult();

             if (newResult  > 0) {
                double X1 = ((-b) + Math.pow(newResult, 0.5)) / (2 * a);
                double X2 = ((-b) - Math.pow(newResult, 0.5)) / (2 * a);
                System.out.println("The equation " + a + "x^2 + " + b + "x + " + c +"=0  has two roots:");
                System.out.println("X1 = " + X1);
                System.out.println("X2 = " + X2);
            } else {
                System.out.println("default");
            }
        }
        @Test
        public void dicisionNoResultTest() {
        int a = 3;
        int b = 2;
        int c = 1;
    Discriminant result = new Discriminant(a, b, c);
    //result.discriminantResult();
    double newResult = result.discriminantResult();
        if (newResult < 0) {
            System.out.println("The equation " + a + "x^2 + " + b + "x + " + c +"=0   hasn't a deсision");
        } else {
            System.out.println("default");
        }
    }
    @Test
    public void dicisionResultOneRootTest() {
        int a = 1;
        int b = 2;
        int c = 1;

        Discriminant result = new Discriminant(a, b, c);
        double newResult = result.discriminantResult();

        if (newResult == 0) {
            double X = (-b) / 2 * a;
            System.out.println("The equation " + a + "x^2 + " + b + "x + " + c + "=0   has a one root");
            System.out.println("X = " + X);
           }
        else {
            System.out.println("default");
        }
    }
}



