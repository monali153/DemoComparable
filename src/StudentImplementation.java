import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentImplementation {

    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(new Student("vaibhav",12,"vaibhav","diwan"),
                new Student("Ramesh", 4, "Ramesh", "Sharma"),
                new Student("Suresh", 18, "Suresh", "Sharma"),
                new Student("Rohit", 14,"Rohit","Sharma"),
                new Student("Virat", 51, "Virat", "Kohli"));

        for (Student student: studentList) {
            System.out.println(student);
        }

        Collections.sort(studentList);
        System.out.println("-----------------------------------------------------");

        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("\nSorting using NameComparator\n\n");
        Collections.sort(studentList, new NameComparator());
        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("\nSorting using RollNoComparator\n\n");
        Collections.sort(studentList,new RollNoComparator());
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
