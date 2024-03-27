package HW8.animal;

import HW8.action.*;

public abstract class Animal implements Walk, Run, Environment, Predator, Prey {
    protected String name;

    protected Animal(String name) {
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
    public void habitat() {
        System.out.println("It lives on the ground");
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

