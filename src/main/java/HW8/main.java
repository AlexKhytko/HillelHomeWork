package HW8;

import HW8.animal.Animal;
import HW8.bird.Bird;
import HW8.bird.BirdWater;
import HW8.bird.BirdWithoutWings;
import HW8.fish.Fish;
import HW8.technique.Technique;
import HW8.technique.TechniqueAir;
import HW8.technique.TechniqueWater;

public class main {
    public static void main(String[] args) {
Fish pike = new Fish("pike"){};
System.out.println("It is a pike");
pike.swimming();
pike.predator();
pike.habitat();
Fish carp = new Fish("carp") {};
System.out.println("It is a carp");
carp.swimming();
carp.prey();
carp.habitat();
Fish catfish = new Fish("catfish") {};
System.out.println("It is a catfish");
catfish.swimming();
catfish.prey();
catfish.habitat();
Animal dog = new Animal("dog") {};
System.out.println("It is a dog");
dog.walk();
dog.run();
dog.habitat();
dog.predator();

Animal cat = new Animal("cat") {};
System.out.println("It is a cat");
cat.walk();
cat.habitat();
cat.predator();

Animal hamster = new Animal("hamster") {};
System.out.println("It is a hamster");
hamster.run();
hamster.habitat();
hamster.prey();


        BirdWithoutWings penguin = new BirdWithoutWings("penguin"){};
        System.out.println("It is a penguin");
        penguin.walk();
        penguin.swimming();
        penguin.habitat();
        penguin.prey();
        BirdWithoutWings kiwi = new BirdWithoutWings("kiwi"){};
        System.out.println("It is a kiwi");
        kiwi.walk();
        kiwi.prey();
        kiwi.habitat();

        BirdWithoutWings ostrich = new BirdWithoutWings("ostrich") {};
        System.out.println("It is a ostrich");
        ostrich.run();
        ostrich.predator();
        ostrich.habitat();

        BirdWater duck = new BirdWater("duck") {};
        System.out.println("It is a duck");
        duck.swimming();
        duck.flying();
        duck.prey();
        duck.habitat();

        Bird eagle = new Bird("eagle") {};
        System.out.println("It is a eagle");
        eagle.flying();
        eagle.predator();
        eagle.habitat();


        Bird stork = new Bird("stork") {};
        System.out.println("It is a stork");
        stork.flying();
        stork.prey();
        stork.habitat();

        Bird dove = new Bird("dove") {};
        System.out.println("It is a dove");
        dove.flying();
        dove.prey();
        dove.habitat();


        TechniqueAir airplane = new TechniqueAir("airplane") {};
        airplane.flying();
        airplane.engine();
        airplane.habitat();
        airplane.predator();
        airplane.prey();
        System.out.println("It is a airplane");


        TechniqueAir rotorcraft = new TechniqueAir("rotorcraft") {};
        rotorcraft.flying();
        rotorcraft.habitat();
        rotorcraft.engine();
        rotorcraft.predator();
        System.out.println("It is a rotorcraft");

        TechniqueAir balloon = new TechniqueAir("balloon") {};
        balloon.flying();
        balloon.manual();
        balloon.habitat();
        balloon.prey();
        System.out.println("It is a balloon");

        Technique car = new Technique("car") {};
        car.drive();
        car.engine();
        car.habitat();
        car.prey();
        System.out.println("It is a car");

        Technique bus = new Technique("bus") {};
        bus.drive();
        bus.engine();
        bus.habitat();
        bus.prey();
        System.out.println("It is a bus");

        Technique tractor = new Technique("tractor") {};
        tractor.drive();
        tractor.engine();
        tractor.habitat();
        tractor.predator();
        System.out.println("It is a tractor");

        TechniqueWater launch = new TechniqueWater("launch") {};
        launch.swimming();
        launch.engine();
        launch.habitat();
        launch.prey();
        System.out.println("It is a launch");

        TechniqueWater boat = new TechniqueWater("boat") {};
        boat.swimming();
        boat.manual();
        boat.habitat();
        boat.prey();
        System.out.println("It is a boat");

        TechniqueWater barge = new TechniqueWater("barge") {};
        barge.swimming();
        barge.engine();
        barge.habitat();
        barge.predator();
        System.out.println("It is a barge");

    }

}




    //- pike, crucian carp, catfish - water fish
//- cat, dog, hamster  - earth animal
//- penguin, kiwi, ostrich, duck - earth bird
//- eagle, stork, dove - air bird
//- airplane, rotorcraft, balloon - air transport
//- car, bus, tractor - earth transport
//- launch, boat, barge - water transport
//Виділити та реалізувати ієрархію (абстрактні класи та інтерфейси) для наступних об'єктів:
//Примітка: Всі абстракції з класами, інтерфейсами та реалізації з полями, конструкторами та методами визначаєте самостійно


