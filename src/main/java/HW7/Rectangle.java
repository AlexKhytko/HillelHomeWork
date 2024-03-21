package HW7;

public class Rectangle extends Quadrangle {

    public String rectangle;

    public Rectangle(int sideAQuadr, int sideBQuadr, int sideCQuadr, int sideDQuadr,
                  int angleAQuadr, int angleBQuadr, int angleCQuadr, int angleDQuadr) {
        super(sideAQuadr, sideBQuadr, sideCQuadr, sideDQuadr, angleAQuadr, angleBQuadr, angleCQuadr, angleDQuadr);
    }

    public String getRectangle() {
        if ( sideA == sideC && sideB == sideD && angleA == 90 && angleC == 90 && angleB == angleD){
            this.rectangle = "This is Rectangle";
        }else {this.rectangle = "Error input";}
        return rectangle;
    }
}