package HW8;

public abstract class Bird implements Fly, Walk, Run, Swim{
    protected String name;

    Bird(String name) {
        this.name = name;}
    public String getName (){
        return this.name;
    }

    @Override
    public void flying() {
        System.out.println("Swoosh! Whoosh!");
    }
    @Override
    public void run() {
        System.out.println("stomp-stomp....");
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
