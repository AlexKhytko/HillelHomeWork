package HW13;

import java.util.Random;

public class UserGeneratorWoman {
    public static String[] nameWoman = {"Brenda",  "Sara", "Uma", "Emily", "Kristin", "Klava", "Lora"};
    public static Integer[]  age= {17, 18, 19, 20, 21, 22, 23, 24, 25};
    public static String[] email= {"arer@gmail.com", "fhkhjk@yahoo.com", "ytmgh@gmail.com", "gkhhk@rambler.com", null, "DSfs@gmail.com", "ddssa2017@ukr.net"};
    public static String gender = "woman";
           public static User generateUserWoman () {
            String randomNameWomen = nameWoman[new Random().nextInt(nameWoman.length)];
            Integer randomAge = age[new Random().nextInt(age.length)];
            String randomEmail = email[new Random().nextInt(email.length)];
            return new User(randomNameWomen, randomAge, randomEmail, gender);
        }
}
