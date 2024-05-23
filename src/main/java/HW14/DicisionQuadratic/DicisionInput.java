package HW14.DicisionQuadratic;

import java.util.Scanner;

public class DicisionInput extends Complex{

    public DicisionInput(double real, double imag) {
        super(real, imag);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a, b, c for equation (ax^2 + bx + c = 0):");


        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        System.out.print("c: ");
        int c = scanner.nextInt();

           DicisionQuadratic testRoot = new DicisionQuadratic(a, b, c);
            double[] roots = testRoot.getRoots();

           if (roots.length == 2) {
        System.out.println("The equation " + a + "x^2 + " + b + "x + " + c +" = 0  has two roots: X1" + roots[0] + ", X2 = " + roots[1]);
    } else if (roots.length == 1){
        System.out.println("The equation " + a + "x^2 + " + b + "x + " + c +" = 0  has two roots: X" + roots[0]);
    }
       else {
               System.out.println("The equation " + a + "x^2 + " + b + "x + " + c +" = 0   has a two complex roots ");
           }
        scanner.close();
}

}

