package HW7;

public class Rhomb extends Quadrangle {

    public String rhomb;

    public Rhomb(int sideAQuadr, int sideBQuadr, int sideCQuadr, int sideDQuadr,
                  int angleAQuadr, int angleBQuadr, int angleCQuadr, int angleDQuadr) {
        super(sideAQuadr, sideBQuadr, sideCQuadr, sideDQuadr, angleAQuadr, angleBQuadr, angleCQuadr, angleDQuadr);
    }

    public String getRhomb() {
        if ( sideA == sideB && sideC == sideD && sideB == sideD && angleA == angleC  && angleB == angleD){
            this.rhomb = "This is Rhomb";
        } else {this.rhomb = "Error input";}
        return rhomb;
    }
}