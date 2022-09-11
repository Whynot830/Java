package pr6.ex2;

public class Student {
    private String name;
    private int id;
    private double gpa;

    public Student() {
        this.name = "Rob";
        this.id = 1;
        this.gpa = 4;
    }

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public double getgpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "This is student " + name + ", his/her id is " +
                id + ", his/her gpa is " + gpa;
    }


}
