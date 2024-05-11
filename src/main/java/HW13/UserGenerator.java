package HW13;

import java.util.Random;

public class UserGenerator {
    public static String[] nameMan = {"Bruce",  "Jackie", "Jet", "Chak", "Arnold", "Jason", "Dolf"};
    public static Integer[]  age= {16, 17, 18, 19, 20, 21, 22, 23};
    public static String[] email= {"qwer@gmail.com", "dassy@yahoo.com", "jet@gmail.com", "cherry@rambler.com", null, "loppy@gmail.com", "fighter2017@ukr.net"};
public static String gender = "man";
public static User generateUser () {
    String randomNameMan = nameMan[new Random().nextInt(nameMan.length)];
    Integer randomAge = age[new Random().nextInt(age.length)];
    String randomEmail = email[new Random().nextInt(email.length)];
    return new User(randomNameMan, randomAge, randomEmail, gender);
}
}
