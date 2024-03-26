package example;

public class Degree {
    public int base;
    public int index;
    public double exp;

    public Degree(){};
    public void setBase(int newBase) {
        base = newBase;
    }
    public void setIndex(int newIndex) {
        index = newIndex;
    }
    public Double getExp() {
         exp = Math.pow(base, index);
         return exp;
    }
    public Double getExpMult(){
        int firstFactor = 1;
        for (int i = 0; i < index; i++) {
            firstFactor *= base;
        }
          return exp;
    }

}
