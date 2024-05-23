package HW14.DicisionQuadratic;
public class DicisionQuadratic {
    private int a, b, c;
    private double D;

    public DicisionQuadratic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {return a;}

    public int getB() {return b;}

    public int getC() {return c;}

    public double[] getRoots() {
        double[] roots = new double[2];
        D = (b * b - 4 * a * c);
        if (D < 0) {
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-D) / (2 * a);
            Complex root1 = new Complex(realPart, imagPart);
            Complex root2 = new Complex(realPart, -imagPart);
            root1.toString();
            root2.toString();

        } else if (D > 0) {
            roots[0] = ((-b) + Math.pow(D, 0.5)) / (2 * a);
            roots[1] = ((-b) - Math.pow(D, 0.5)) / (2 * a);

        } else if (D == 0) {
            roots[0] = (-b) / 2 * a;
            roots[1] = roots[0];
                    }
        return roots;
    }
}





