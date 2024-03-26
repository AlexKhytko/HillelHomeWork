package HW2;

public class Main {
    public static void main(String[] args) {
        // Піднесення в степінь.
        double a = 3;
        double c = 2;
        double b = Math.pow(a, c);
        System.out.println(a + " в степени " + c + " равняется " + b);
        //возведение в степень
        int e = 2;
        int f = 3;
        int g = 1;

        for (int i = 0; i < f; i++) {
            g *= e;
        }
        System.out.println(e + " в степени " + f + " равняется " + g);

        }
}
