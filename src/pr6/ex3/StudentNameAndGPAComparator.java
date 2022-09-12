package pr6.ex3;

import pr6.ex2.Student;

import java.util.Comparator;

public class StudentNameAndGPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        int res;
        if (st1.getgpa() > st2.getgpa()) res = 1;
        else if (st1.getgpa() < st2.getgpa()) res = -1;
        else res = 0;
        if (res == 0) res = st2.getName().compareTo(st1.getName());
        return res;
    }
}
