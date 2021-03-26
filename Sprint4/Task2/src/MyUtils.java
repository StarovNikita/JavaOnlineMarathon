import java.util.*;

public class MyUtils {
    public static class Student {
        private int id;
        private String name;
        // Constructor, metthods, Code

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return id == student.id &&
                    name.equals(student.name);
        }


        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

    }
    public Set<Student> commonStudents(List<Student> list1, List<Student> list2) {
        // Code
        Set<Student> Common = new HashSet<Student>();
        Common.addAll(list1);
        Common.retainAll(list2);
        return Common;
    }
}
