package HW8;

public class BirdWithoutWings implements Walk, Swim, Fly{
    protected String name;

    BirdWithoutWings(String name) {
        this.name = name;}
    public String getName (){
        return this.name;
    }


    @Override
    public void walk() {
        System.out.println("tiptoe-tiptoe....");
    }
    @Override
    public void swimming() {
        System.out.println("plop - plop ....");
    }
}



}
