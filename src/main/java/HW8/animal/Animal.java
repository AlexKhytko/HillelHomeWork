package HW8;

public abstract class Animal implements Walk, Run, Environment{
    protected String name;

    Animal(String name) {
        this.name = name;}
    public String getName (){
        return this.name;
    }

    @Override
    public void run() {
        System.out.println("Flip-flop....");
           }

    @Override
    public void walk() {
        System.out.println("Сlickety-clack....");
    }

    @Override
    public void place() {
        System.out.println("on the graund");
    }
}

