package pr9.students;

public class Student {
    private String name;
    private String surname;

    public Student() {
        this.name = "Rob";
        this.surname = "Green";
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", surname='" + surname + '}';
    }

    public boolean equals(Student other) {
        return this.name.equals(other.name) && this.surname.equals(other.surname);
    }
}
