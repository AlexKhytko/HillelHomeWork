package HW14;

import org.junit.Test;

public class QuadraticEquation {
    public static void main(String[] args) {
        double a, b, c;
        a=1;
        b=-2;
        c=1;

        double D = b * b - 4 * a * c;
        System.out.println("D = " + D);

if(D < 0){
    System.out.println("No deсision ");
}
else if(D > 0){
    double X1 = ((-b) + Math.pow(D, 0.5))/(2 * a);
    double X2 = ((-b) - Math.pow(D, 0.5))/(2 * a);

    System.out.println("X1 = " + X1);
    System.out.println("X2 = " + X2);
    }
else if(D == 0) {
    double X = (-b)/2*a;
    System.out.println("X = " + X);
    }
}
}
