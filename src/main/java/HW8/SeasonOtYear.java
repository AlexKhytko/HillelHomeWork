package HW8;

public enum SeasonOtYear {
    WINTER, SPRING, SUMMER,AUTUMN;
    public String name;

    SeasonOtYear(){};



    public String getName() {
        System.out.println("This season is a  " + name());
        return name;
    }
}
