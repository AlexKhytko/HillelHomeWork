package HW8;

public enum SeasonOtYear {
    WINTER, SPRING, SUMMER,AUTUMN;
    ;

    SeasonOtYear() {String name = name();};



    public String getName() {
        System.out.println("This season is a  " + name());
        return "   ";
    }
}
