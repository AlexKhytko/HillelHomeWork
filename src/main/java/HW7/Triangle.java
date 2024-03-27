package HW7;

public class Triangle extends Figure{
    public int sideA;
    public int sideB;
    public int sideC;
    public int angleA;
    public int angleB;
    public int angleC;
  //  public String triangle;

        public Triangle(int sideATriangle, int sideBTriangle,int sideCTriangle,
                    int angleATriangle, int angleBTriangle, int angleCTriangle){
        sideA = sideATriangle;
        sideB = sideBTriangle;
        sideC = sideCTriangle;
        angleA = angleATriangle;
        angleB = angleBTriangle;
        angleC = angleCTriangle;
        String name = super.nameFigure;

    };
    public int getSideA() {return sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public int getSideC() {
        return sideC;
    }

    public int getAngleA() {
        return angleA;
    }

    public int getAngleB() {
        return angleB;
    }

    public int getAngleC() {
        return angleC;
    }

    public String getName() {
        if(sideA + sideB > sideC
                && sideA + sideC > sideB
                && sideB + sideC > sideA
                && angleA + angleB + angleC == 180){
        nameFigure = "Triangle Versatile";}
        else {nameFigure = "ERROR input";
        }
        return nameFigure;
    }

    }

