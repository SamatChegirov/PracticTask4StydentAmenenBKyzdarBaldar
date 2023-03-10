import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Asan", "Asanov", LocalDate.of(2005, 8, 7), Gender.MALE, 3000);
        Student student2 = new Student("Uson", "Asanov", LocalDate.of(2005, 8, 7), Gender.MALE, 1000);
        Student student3 = new Student("Batma", "Butova", LocalDate.of(2007, 4, 2), Gender.FEMALE, 5000);
        Student student4 = new Student("Zuura", "Butova", LocalDate.of(2007, 4, 2), Gender.FEMALE, 500);
        Student student5 = new Student("Janysh", "Baratov", LocalDate.of(2003, 9, 6), Gender.MALE, 3000);
        Student student6 = new Student("Baiysh", "Baratov", LocalDate.of(2003, 9, 6), Gender.MALE, 4000);
        Student student7 = new Student("Akyl", "Atashev", LocalDate.of(2000, 1, 3), Gender.MALE, 500);


        ArrayList<Student> stud = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5, student6, student7));
        GetInfoStud getInfoStud = new GetInfoStud();
        System.out.println("1 - аты А жана Б менен башталган студенттерди чыгарыныз.");
        System.out.println(getInfoStud.search(stud));

        System.out.println("2 - жашы 15тен чон жана акчасы 2000 ден чон балдарды чыгарыныз.");
        System.out.println(getInfoStud.ageAndMoney(stud));

        System.out.println("3 - эн коп акчасы бар студентти чыгарыныз.");
        System.out.println(getInfoStud.bigMoneyStudents(stud));

        System.out.println("4 - эн акчасы коп кызды чыгарыныз.");
        System.out.println(getInfoStud.bigMoneyFemale(stud));

        System.out.println("5 - баардык студенттердин атын эле консолго чыгарыныз.");
        System.out.println(getInfoStud.studentsName(stud));

        System.out.println("6 - ар бир студеттин акчасына 1000 сомдон кошуп чыгарыныз.");
        System.out.println(getInfoStud.addMoneyStudent(stud));

        System.out.println("7 - биринчи турган студентти чыгарыныз.");
        System.out.println(getInfoStud.firstStudent(stud));

        System.out.println("8 - канча студент бар экен чыгарыныз(санын)");
        System.out.println(getInfoStud.howManyStudents(stud));

        System.out.println("9 - балдарды жана кыздарды болуп группага салгыла.");
        System.out.println("Кыздар: ");
        System.out.println(getInfoStud.femaleNames(stud));
        System.out.println("Балдар: ");
        System.out.println(getInfoStud.maleNames(stud));

    }
}