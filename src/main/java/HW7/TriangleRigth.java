package HW7;

public class TriangleRigth extends Triangle{
    public String name;
     public TriangleRigth(int sideATriangle, int sideBTriangle,int sideCTriangle,
        int angleATriangle, int angleBTriangle, int angleCTriangle){
        super(sideATriangle, sideBTriangle, sideCTriangle, angleATriangle, angleBTriangle, angleCTriangle);
        name = super.nameFigure;

    };
    public String getName() {
        if ((angleA == 90 || angleB == 90 || angleC == 90) && (angleA + angleB + angleC == 180) ) {
            nameFigure = "Triangle Rigth";
        } else {
            nameFigure = "Error input";
        }
        return nameFigure;
    }
    }
