package HW8.bird;

import HW8.action.*;

public class BirdWithoutWings implements Walk, Environment, Predator, Prey, Swim, Run {
    protected String name;

    protected BirdWithoutWings(String name) {
        this.name = name;}
    public String getName (){
        return this.name;
    }


    @Override
    public void walk() {
        System.out.println("tiptoe-tiptoe....");
    }
    @Override
    public void prey() {
        System.out.println("It is a prey.");
    }
    @Override
    public void predator() {
        System.out.println("It isn't a predator, but it can beat legs.");
    }
    @Override
    public void habitat() {
        System.out.println("It walks on the ground.");
    }

    @Override
    public void swimming() {
        System.out.println("It can swim.");
            }

    @Override
    public void run() {
        System.out.println("It can run quickly.");
    }
}




