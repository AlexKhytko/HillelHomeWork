package HW14.DicisionQuadratic;

public class Complex {
    private final double real;
    private final double imag;
   public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

@Override
public String toString() {
    if (imag == 0) return real + "";
    if (real == 0) return imag + "i";
    if (imag < 0) return real + " - " + (-imag) + "i";
    return real + " + " + imag + "i";
}


}

