package pr6.ex1;

public class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student() {
        this.name = "Rob";
        this.id = 1;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "This is student " + name + ", his/her id is " + id;
    }


}
