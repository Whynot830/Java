package pr6.ex3;

import pr6.ex2.Student;

public class Test {
    public static void sortArr(Student[] arr, int len) {
        if (len >= 2) {
            int mid = len / 2;
            Student[] arrL = new Student[mid], arrR = new Student[len - mid];
            System.arraycopy(arr, 0, arrL, 0, mid);
            for (int i = mid; i < len; i++)
                arrR[i - mid] = arr[i];
            sortArr(arrL, mid);
            sortArr(arrR, len - mid);
            mergeArr(arr, arrL, arrR, mid, len - mid, new StudentNameAndGPAComparator());
        }
    }

    public static void mergeArr(Student[] finArr, Student[] arr1,
                                Student[] arr2, int len1, int len2, StudentNameAndGPAComparator comp) {
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            if (comp.compare(arr1[i], arr2[j]) > 0) finArr[k++] = arr1[i++];
            else finArr[k++] = arr2[j++];
        }
        while (i < len1)
            finArr[k++] = arr1[i++];
        while (j < len2)
            finArr[k++] = arr2[j++];
    }

    public static void main(String[] args) {
        Student[] students1 = new Student[6];
        students1[0] = new Student("Jay", 5, 5.0);
        students1[1] = new Student("Micky", 6, 3.8);
        students1[2] = new Student("Marie", 13, 4.7);
        students1[3] = new Student();
        students1[4] = new Student("Rob", 11, 4.4);
        students1[5] = new Student("Ricky", 8, 4.9);
        Student[] students2 = new Student[6];
        students2[0] = new Student("Skye", 12,5.0);
        students2[1] = new Student("Kyle",17,4.4);
        students2[2] = new Student("Larry", 17,4.8);
        students2[3] = new Student("Joe",113,3.9);
        students2[4] = new Student("Valkyrie",18,4.5);
        students2[5] = new Student("Wendy", 27,3.4);
        for (Student p : students1)
            System.out.println(p);
        System.out.println();
        for (Student p : students2)
            System.out.println(p);
        Student[] sorted_students = new Student[12];
        sortArr(students1,6);
        sortArr(students2,6);
        mergeArr(sorted_students,students1,students2,6,6,new StudentNameAndGPAComparator());
        System.out.println();
        for (Student p : sorted_students)
            System.out.println(p);
    }
}
