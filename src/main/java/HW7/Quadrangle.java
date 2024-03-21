package HW7;

public class Quadrangle {

    public int sideA;

    public int sideB;
    public int sideC;
    public int sideD;
    public int angleA;
    public int angleB;
    public int angleC;
    public int angleD;
    public String quadrangle;

    public Quadrangle(int sideAQuadr, int sideBQuadr, int sideCQuadr, int sideDQuadr,
                      int angleAQuadr, int angleBQuadr, int angleCQuadr, int angleDQuadr) {
        sideA = sideAQuadr;
        sideB = sideBQuadr;
        sideC = sideCQuadr;
        sideD = sideDQuadr;
        angleA = angleAQuadr;
        angleB = angleBQuadr;
        angleC = angleCQuadr;
        angleD = angleDQuadr;
                  }

    public String getQuadrangle() {
        if (angleA + angleB + angleD + angleC == 360){
        this.quadrangle = "This is Quadrangle";}
        else { this.quadrangle = "Error input";}
        return quadrangle;
    }
}
