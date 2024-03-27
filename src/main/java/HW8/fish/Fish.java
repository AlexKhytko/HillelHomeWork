package HW8.fish;

import HW8.action.Environment;
import HW8.action.Predator;
import HW8.action.Prey;
import HW8.action.Swim;

public abstract class Fish implements Swim, Environment, Predator, Prey {
    public String name;

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void swimming() {
System.out.println("Buoys....Splash!");
    }

    @Override
    public void habitat() {
        System.out.println("It lives under water.");
    }
    @Override
    public void prey() {
        System.out.println("It is a prey.");
               }

    @Override
    public void predator() {
        System.out.println("It is a predator.");
    }
}




