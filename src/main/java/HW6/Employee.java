package HW6;

public class Employee {
    public String firstname;
    public String surname;
    public String position;
    public String salaryHour;
public Employee(){};
      public Employee(String firstnameEmployee, String surnameEmployee, String positionEmployee, String salaryHourEmployee) {
        firstname = firstnameEmployee;
        surname = surnameEmployee;
        position = positionEmployee;
        salaryHour = salaryHourEmployee;
        System.out.println(firstnameEmployee + surnameEmployee + positionEmployee + salaryHourEmployee);
    }
    public void setFirstname(String newFirstname) {
        firstname = newFirstname;
        System.out.println(newFirstname);
    }
    public void setSurname(String newSurname) {
        surname = newSurname;
        System.out.println(newSurname);
    }

    public void setPosition(String newPosition) {
          position = newPosition;
          System.out.println(newPosition);
    }
    public void setSalaryHour(String newSalaryHour) {
          salaryHour = newSalaryHour;
          System.out.println(newSalaryHour);
    }
}
