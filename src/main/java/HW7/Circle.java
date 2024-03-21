package HW7;

public class Circle {
    public int absX;
    public int ordY;
    public int radius;
    public String circle;

    public Circle (int absXCircle, int ordYCircle, int radiusCircle){
        absX = absXCircle;
        ordY = ordYCircle;
        radius = radiusCircle;
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

    public String getCircle(){
        this.circle = "Circle";
        return circle;
    }
}

