package HW8;

public class BirdWater implements Fly, Swim {
    protected String name;

    BirdWater(String name) {
        this.name = name;}
    public String getName (){
        return this.name;
    }

    @Override
    public void flying() {
        System.out.println("Swoosh! Whoosh!");
    }

       @Override
    public void swimming() {
        System.out.println("plop - plop ....");
    }
}

}
