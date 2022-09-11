package pr6.ex2;

public class Test {
    public static void quick_sort(Student[] arr, int first, int last, SortingStudentsByGPA comp) {
        if (first < last) {
            int left = first, right = last;
            Student mid = arr[(left + right) / 2], temp;
            while (left <= right) {
                while (comp.compare(arr[left], mid) > 0) left++;
                while (comp.compare(arr[right], mid) < 0) right--;
                if (left <= right) {
                    temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
            if (left < last) quick_sort(arr, left, last, comp);
            if (right > first) quick_sort(arr, first, right, comp);
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("Jay", 5, 5.0);
        students[1] = new Student("Micky", 6, 3.8);
        students[2] = new Student("Marie", 13, 4.7);
        students[3] = new Student();
        students[4] = new Student("Rob", 11, 4.4);
        students[5] = new Student("Ricky", 8, 4.9);
        quick_sort(students, 0, 5, new SortingStudentsByGPA());
        for (int i = 0; i < 6; i++) {
            System.out.println(students[i]);
        }
    }
}
