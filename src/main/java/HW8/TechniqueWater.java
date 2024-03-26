package HW8;

public abstract class TechniqueWater implements Swim{

    protected String name;

    TechniqueWater(String name) {
        this.name = name;}
    public String getName (){
        return this.name;
    }

       public void swimming(){
        System.out.println("splash-splosh...");
    }

}
