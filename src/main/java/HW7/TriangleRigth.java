package HW7;

public class TriangleRigth extends Triangle{
    public String rightAngle;
     public TriangleRigth(int sideATriangle, int sideBTriangle,int sideCTriangle,
        int angleATriangle, int angleBTriangle, int angleCTriangle){
        super(sideATriangle, sideBTriangle, sideCTriangle, angleATriangle, angleBTriangle, angleCTriangle);

    };
    public String getRightAngle() {
        if ((angleA == 90 || angleB == 90 || angleC == 90) && (angleA + angleB + angleC == 180) ) {
            this.rightAngle = "Triangle Rigth";
        } else {
            this.rightAngle = "Error input";
        }
        return rightAngle;
    }
    }
