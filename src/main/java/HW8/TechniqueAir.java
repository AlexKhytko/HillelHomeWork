package HW8;

public abstract class TechniqueAir implements Fly{
    protected String name;

    TechniqueAir(String name) {
        this.name = name;}
    public String getName (){
        return this.name;
    }

     @Override
    public void flying() {
        System.out.println("pow - pow ...");
    }

}
