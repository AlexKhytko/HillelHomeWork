package HW6;

public class Triangle {
    public int sideA;
    public int sideB;
    public int sideC;
    public int perimeter;

    public double square;

    public Triangle() {
    }

    ;

    public Triangle(int sideAtriangle, int sideBtriangle, int sideCtriangle) {
        sideA = sideAtriangle;
        sideB = sideBtriangle;
        sideC = sideCtriangle;
    }

    public int getSideA() {
        System.out.println("A = " + sideA);
        return sideA;
    }

    public int getSideB() {
        System.out.println("B = " + sideB);
        return sideB;
    }

    public int getSideC() {
        System.out.println("C = " + sideC);
        return sideC;
    }

    public int getPer() {
        perimeter = sideA + sideB + sideC;
        System.out.println("Perimeter = " + perimeter);
        return perimeter;
    }

    public int getSquare() {
        double per = (double) (sideA + sideB + sideC)/2;
        double summ = per * (per - sideA) * (per - sideB) * (per - sideC);
        double square = Math.pow(summ, 0.5);
        System.out.println("Square = " + square);
        return (int) square;
    }
}
