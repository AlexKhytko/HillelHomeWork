package HW8.bird;

import HW8.action.*;

public class BirdWater implements Fly, Swim, Environment, Prey {
    protected String name;

    protected BirdWater(String name) {
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
    @Override
    public void prey() {
        System.out.println("It is a prey.");
    }

    @Override
    public void habitat() {
        System.out.println("It flies on air and can swims.");
    }
}


