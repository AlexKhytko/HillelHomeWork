package HW7;

public class Parallelogram extends Quadrangle {

    public String parallelogram;
    public Parallelogram(int sideAQuadr, int sideBQuadr, int sideCQuadr, int sideDQuadr,
                         int angleAQuadr, int angleBQuadr, int angleCQuadr, int angleDQuadr) {
        super(sideAQuadr, sideBQuadr, sideCQuadr, sideDQuadr, angleAQuadr, angleBQuadr, angleCQuadr, angleDQuadr);
    }
    public String getParallelogram() {
        if (sideA == sideC && sideB == sideD && angleA == angleC && angleB == angleD) {
            this.parallelogram = "This is Parallelogram";
        } else {this.parallelogram = "Error input";}
        return parallelogram;
    }
}