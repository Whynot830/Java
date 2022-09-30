package pr9.db;


import pr9.students.Student;

import java.util.ArrayList;

public class db {
    private static ArrayList<Student> students = new ArrayList<>();

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public db() {
        students.add(new Student("Robert","Brown"));
        students.add(new Student("Chester","Bryan"));
        students.add(new Student("Eddie","Jones"));
        students.add(new Student("John","Stephens"));
        students.add(new Student("Edward","Ortiz"));
        students.add(new Student("Rene","Stone"));
        students.add(new Student("Mary","Curtis"));
        students.add(new Student("Stella","Green"));
        students.add(new Student("Helen","Smith"));
    }
}
