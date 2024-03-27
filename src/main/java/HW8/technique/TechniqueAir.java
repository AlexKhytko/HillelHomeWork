package HW8.technique;

import HW8.action.*;

public abstract class TechniqueAir implements Fly,  Engine, Environment, Manual, Predator, Prey {
    protected String name;

    protected TechniqueAir(String name) {
        this.name = name;}
    public String getName (){
        return this.name;
    }

     @Override
    public void flying() {
        System.out.println("It has such sound: pow - pow ...");
    }

    @Override
    public void engine() {
        System.out.println("It has a engine.");
    }

    @Override
    public void manual() {
        System.out.println("It moves with power of the nature.");
    }

    @Override
    public void habitat() {
        System.out.println("It can fly on the air. ");
    }

    @Override
    public void predator() {
        System.out.println("Truck transport");
    }

    @Override
    public void prey() {
        System.out.println("Passenger transport");
    }
}
