package HW8;

public class main {
    public static void main(String[] args) {
Fish pike = new Fish("pike"){};
pike.swimming();
System.out.println("It is a pike");

        Fish carp = new Fish("carp") {};
        carp.swimming();
        System.out.println("It is a carp");

        Fish catfish = new Fish("catfish") {};
        catfish.swimming();
        System.out.println("It is a catfish");

        Animal dog = new Animal("dog") {};
            dog.walk();
            dog.run();
            dog.place();
            System.out.println("It is a dog");
            Animal cat = new Animal("cat") {};
            cat.walk();
            cat.place();
            System.out.println("It is a cat");
            Animal hamster = new Animal("hamster") {};
              hamster.run();
        hamster.place();
            System.out.println("It is a hamster");

            Bird penguin = new Bird("penguin"){};
            penguin.walk();
        System.out.println("It is a penguin");


        Bird kiwi = new Bird("kiwi"){};
        kiwi.walk();
        System.out.println("It is a kiwi");

        Bird ostrich = new Bird("ostrich") {};
        ostrich.run();
        System.out.println("It is a ostrich");

        Bird duck = new Bird("duck") {};
        duck.swimming();
        System.out.println("It is a duck");
        Bird eagle = new Bird("eagle") {};
        eagle.flying();
        System.out.println("It is a eagle");
        Bird stork = new Bird("stork") {};
        stork.flying();
        System.out.println("It is a stork");
        Bird dove = new Bird("dove") {};
        dove.flying();
        System.out.println("It is a dove");


        TechniqueAir airplane = new TechniqueAir("airplane") {};
        airplane.flying();
        System.out.println("It is a airplane");
        TechniqueAir rotorcraft = new TechniqueAir("rotorcraft") {};
       rotorcraft.flying();
        System.out.println("It is a rotorcraft");

        TechniqueAir balloon = new TechniqueAir("balloon") {};
        balloon.flying();
        System.out.println("It is a balloon");

        Technique car = new Technique("car") {};
        car.drive();
        System.out.println("It is a car");

        Technique bus = new Technique("bus") {};
        bus.drive();
        System.out.println("It is a bus");

        Technique tractor = new Technique("tractor") {};
        tractor.drive();
        System.out.println("It is a tractor");

        TechniqueWater launch = new TechniqueWater("launch") {};
        launch.swimming();
        System.out.println("It is a launch");

        TechniqueWater boat = new TechniqueWater("boat") {};
        boat.swimming();
        System.out.println("It is a boat");

        TechniqueWater barge = new TechniqueWater("barge") {};
        barge.swimming();
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


