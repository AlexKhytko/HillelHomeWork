package HW8.bird;

import HW8.action.*;

public abstract class Bird implements Fly, Environment, Prey, Predator {
    protected String name;

    protected Bird(String name) {
        this.name = name;}
    public String getName (){
        return this.name;
    }

    @Override
    public void flying() {
        System.out.println("Swoosh! Whoosh!");
    }

    @Override
    public void prey() {
        System.out.println("It is a prey.");
    }
    @Override
    public void predator() {
        System.out.println("It is a predator.");
    }
    @Override
    public void habitat() {
        System.out.println("It flies on air.");
    }
}
