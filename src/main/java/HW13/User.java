package HW13;
public class User {
    private String name, email, gender;
   private int age;

    public User(String name, int age, String email, String gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){return name; }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        System.out.print( name + ", "
//                + "  " +  age + "  " + email
//                + "  " + gender
        );
       return "";
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}

