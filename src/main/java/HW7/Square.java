package HW7;

public class Square extends Quadrangle {

    public String square;

    public Square(int sideAQuadr, int sideBQuadr, int sideCQuadr, int sideDQuadr,
                  int angleAQuadr, int angleBQuadr, int angleCQuadr, int angleDQuadr) {
        super(sideAQuadr, sideBQuadr, sideCQuadr, sideDQuadr, angleAQuadr, angleBQuadr, angleCQuadr, angleDQuadr);
    }

    public String getSquare() {
        if ( sideA == sideB && sideC == sideD && sideB == sideD && angleA == 90 && angleC == 90 && angleB == angleD){
            this.square = "This is Square";
        }else {this.square = "Error input";}
        return square;
    }
}
