package HW8.technique;

import HW8.action.*;

public abstract class Technique implements Drive, Engine, Environment, Manual, Predator, Prey {
    protected String name;

    protected Technique(String name) {
        this.name = name;}
    public String getName (){
        return this.name;
    }

    public void drive(){
        System.out.println("It has a sound: boom-boom...");
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
        System.out.println("It drive on the ground.");
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

