import java.lang.reflect.Array;
import java.util.ArrayList;

public class GetInfoStud implements Methods {


    @Override
    public String search(ArrayList<Student> students) {
        for (Student s : students) {
            if (s.getFirstName("").startsWith("A") || s.getFirstName("").startsWith("B")) {
                System.out.println(s.getFirstName("") + " " + s.getSecondName());
            }
        }
        return "";
    }

    @Override
    public String ageAndMoney(ArrayList<Student> students) {
        ArrayList<Student> st = new ArrayList<>();
        for (Student s : students) {
            if (s.getGender() == Gender.MALE) {
                st.add(s);
            }
        }
        for (Student s : st) {
            if (s.getAge() >= 15 && s.getMoney() >= 2000) {
                System.out.println(s.getFirstName("") + " " + s.getSecondName() + " age: " + s.getAge() + " money: " + s.getMoney());
            }
        }
        return "";
    }

    @Override
    public int bigMoneyStudents(ArrayList<Student> students) {
        int m = students.get(0).getMoney();
        /*for (int i = 1; i < students.size(); i++) {
            if (m < students.get(i).getMoney()) {
                m = students.get(i).getMoney();
            }
        }*/
        for (Student s : students) {
            if (m < s.getMoney()){
                m = s.getMoney();
            }
        }
        for (Student s : students) {
            if (m == s.getMoney()) {
                System.out.println(s.getFirstName("") + " " + s.getSecondName());
            }
        }
        return m;
    }

    @Override
    public int bigMoneyFemale(ArrayList<Student> students) {
        ArrayList<Student> female = new ArrayList<>();
        for (Student s : students) {
            if (s.getGender() == Gender.FEMALE) {
                female.add(s);
            }
        }
        int count = female.get(0).getMoney();
        /*for (int i = 1; i < female.size(); i++) {
            if (count < female.get(i).getMoney()) {
                count = female.get(i).getMoney();
            }
        }*/
        for (Student s : female) {
            if (count < s.getMoney()) {
                count = s.getMoney();
            }
        }

        for (Student s : female) {
            if (count == s.getMoney()) {
                System.out.println(s.getFirstName("") + " " + s.getSecondName());
            }
        }
        return count;
    }

    @Override
    public String studentsName(ArrayList<Student> students) {
        for (Student s : students) {
            System.out.println(s.getFirstName(""));
        }
        return "";
    }

    @Override
    public int addMoneyStudent(ArrayList<Student> students) {
        for (Student s : students) {
            System.out.println(s.getFirstName("") + " " + s.getSecondName() + " " + (s.getMoney() + 1000));
        }
        return 1000;
    }

    @Override
    public String firstStudent(ArrayList<Student> students) {
        System.out.println(students.get(0));
        return "";
    }

    @Override
    public int howManyStudents(ArrayList<Student> students) {
        return students.size();
    }

    @Override
    public String femaleNames(ArrayList<Student> students) {
        ArrayList<Student> stud = new ArrayList<>();
        for (Student s : students) {
            if (s.getGender() == Gender.FEMALE) {
                stud.add(s);
                System.out.println(s.getFirstName("") + " " + s.getSecondName());
            }
        }
        return "";
    }

    @Override
    public String maleNames(ArrayList<Student> students) {
        ArrayList<Student> male = new ArrayList<>();
        for (Student s: students) {
            if (s.getGender() == Gender.MALE) {
                male.add(s);
                System.out.println(s.getFirstName("") + " " + s.getSecondName());
            }
        }
        return "";
    }
}
