package HW7;

public class Trapeze extends Quadrangle{

    public String trapeze;

    public Trapeze(int sideAQuadr, int sideBQuadr, int sideCQuadr, int sideDQuadr,
                         int angleAQuadr, int angleBQuadr, int angleCQuadr, int angleDQuadr) {
        super(sideAQuadr, sideBQuadr, sideCQuadr, sideDQuadr, angleAQuadr, angleBQuadr, angleCQuadr, angleDQuadr);
    }

    public String getTrapeze() {
        if (sideA == sideC && sideB != sideD && angleA == angleD && angleB == angleC) {
            this.trapeze = "This is Trapeze";
        } else {this.trapeze = "Error input";}
        return trapeze;
    }
}
