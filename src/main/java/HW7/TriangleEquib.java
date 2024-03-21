package HW7;

public class TriangleEquib extends Triangle{
    public String equiberdrate;
    public TriangleEquib(int sideATriangle, int sideBTriangle,int sideCTriangle,
                         int angleATriangle, int angleBTriangle, int angleCTriangle){
        super(sideATriangle, sideBTriangle, sideCTriangle, angleATriangle, angleBTriangle, angleCTriangle);
    };
    public String getEquiberdrate() {
        if ((sideA == sideB || sideA == sideC || sideB == sideC)
                && (angleA == angleB || angleA == angleC ||  angleB == angleC)) {
            this.equiberdrate = "Triangle Equiberdrate";
        } else {
            this.equiberdrate = "Error input";
        }
        return equiberdrate;
    }
}
