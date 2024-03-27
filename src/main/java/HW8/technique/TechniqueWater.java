package HW8.technique;

import HW8.action.*;

public abstract class TechniqueWater implements Swim, Engine, Environment, Manual, Predator, Prey {

    protected String name;

    protected TechniqueWater(String name) {
        this.name = name;}
    public String getName (){
        return this.name;
    }

       public void swimming(){
        System.out.println("When it works, we can hear such a sound: splash-splosh...");
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
        System.out.println("It can swimming in the water. ");
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
