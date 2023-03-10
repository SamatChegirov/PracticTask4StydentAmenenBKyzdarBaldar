import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Locale;

public class Student {
    private String firstName;
    private byte age;
    private Gender gender;
    private int money;
    private String secondName;

    public Student(String firstName, String secondName, LocalDate age, Gender gender, int money) {
        this.firstName = firstName;
        this.age =(byte) Period.between(age, LocalDate.now()).getYears();
        this.gender = gender;
        this.money = money;
        this.secondName = secondName;
    }

    public String getFirstName(String a) {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Student: " + "firstName: " + firstName + ", age: " + age + ", gender: " + gender + ", money: " + money + ", secondName: " + secondName;
    }
}
