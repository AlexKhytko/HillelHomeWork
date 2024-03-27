package HW7;

import javax.naming.Name;

public class Circle extends Figure{
    public int absX;
    public int ordY;
    public int radius;

    public Circle (int absXCircle, int ordYCircle, int radiusCircle){
        absX = absXCircle;
        ordY = ordYCircle;
        radius = radiusCircle;
       String name = super.nameFigure;
           }

    public void setAbsX(int absX) {
        this.absX = absX;
    }

    public void setOrdY(int ordY) {
        this.ordY = ordY;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getName(){
        nameFigure = "Circle";
        return nameFigure;
    }
}

