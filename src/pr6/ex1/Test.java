package pr6.ex1;

public class Test {
    public static void insertion_sort(Student[] list) {
        for (int i = 1; i < list.length; i++) {
            int j = i;
            while (j > 0 && list[j - 1].compareTo(list[j]) > 0) {
                Student tmp = list[j - 1];
                list[j - 1] = list[j];
                list[j] = tmp;
                j -= 1;
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Jay", 5);
        students[1] = new Student("Micky", 6);
        students[2] = new Student("Marie", 13);
        students[3] = new Student();
        students[4] = new Student("Rob", 11);
        insertion_sort(students);
        for (int i = 0; i < 5; i++)
            System.out.println(students[i]);
    }
}
