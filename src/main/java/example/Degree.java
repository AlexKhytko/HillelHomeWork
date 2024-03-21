package HW2;

public class degree {
    public int base;
    public int index;
    public double exp;

    public degree(){};
    public degree (int baseDegree, int indexDegree, int expDegree){
        base = baseDegree;
        index = indexDegree;
        exp = expDegree;
    }

    public int getBase() {
        return base;
    }
    public int getIndex() {
        return index;
    }

    public double setExp() {
        this.exp = Math.pow(getBase(), getIndex());
        return exp;
    }




}
