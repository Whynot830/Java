package pr9.students;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int res = o1.getName().compareTo(o2.getName());
        if (res == 0) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
        return res;
    }
}
