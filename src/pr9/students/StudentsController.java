package pr9.students;

import pr9.db.db;
import pr9.errors.*;

import java.util.regex.Pattern;

public class StudentsController {
    public static class SearchRes extends ResultError {
        public Student student;

        public SearchRes(Student student, StudentNotFound error) {
            super(error);
            this.student = student;
        }

        @Override
        public String toString() {
            return "SearchRes{" +
                    "student=" + student +
                    ", error=" + error +
                    '}';
        }
    }

    public static SearchRes search(Student student) {
        for (Student st : db.getStudents()) {
            if (st.equals(student)) {
                return new SearchRes(st, null);
            }
        }
        return new SearchRes(null, new StudentNotFound("Student not found"));
    }

    public static class InnRes extends ResultError {
        private boolean result;

        public InnRes(boolean result, WrongInn error) {
            super(error);
            this.result = result;
        }

        @Override
        public String toString() {
            return "InnRes{" +
                    "result=" + result +
                    ", error=" + error +
                    '}';
        }
    }

    public static InnRes check(String Inn) {
        if (Pattern.matches("\\d{12}", Inn))
            return new InnRes(true, null);
        return new InnRes(false, new WrongInn("Incorrect INN"));
    }

}
