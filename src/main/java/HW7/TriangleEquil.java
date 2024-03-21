package HW7;

public class TriangleEquil extends Triangle{
    public String equilateral;
    public TriangleEquil(int sideATriangle, int sideBTriangle,int sideCTriangle,
                         int angleATriangle, int angleBTriangle, int angleCTriangle){
        super(sideATriangle, sideBTriangle, sideCTriangle, angleATriangle, angleBTriangle, angleCTriangle);
    };
    public String getEquilateral() {
        if ((sideA == sideB && sideA == sideC)
                && (angleA == angleB && angleA == angleC)) {
            this.equilateral = "Triangle Equilateral";
        } else {
            this.equilateral = "Error input";
        }
        return equilateral;
    }
}

