package HW8;

public abstract class Technique implements Drive{
    protected String name;

    Technique(String name) {
        this.name = name;}
    public String getName (){
        return this.name;
    }

    public void drive(){
        System.out.println("boom-boom...");
    }

    }

