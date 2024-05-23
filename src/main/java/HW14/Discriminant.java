package HW14;

public class Discriminant {
    static int a, b, c;
    public Discriminant(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    public double discriminantResult() {
        double D = 0;
        if (a != 0) {
            D = (b * b - 4 * a * c);
            System.out.println("If discriminant " + D);
        } else {
            System.out.println("default");
        }
        return D;
    }
    public static void main(String[] args) {
       int a = -3;
       int b = 2;
       int c = 1;
       Discriminant result = new Discriminant(a, b, c);
       result.discriminantResult();
       // double newResult = result.discriminantResult();
    }
}


