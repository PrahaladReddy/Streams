import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class streamOutOfCollection {
    public static void main(String[] args) {
        Student prahalad = new Student(1, "prahalad D", 9876, 32);
        Student surya = new Student(1, "prahalad D", 9876, 32);
        Student rakesh = new Student(1, "prahalad D", 9876, 32);

        List<Student> studentList = Arrays.asList(prahalad, surya, rakesh);
        studentList.stream().forEach(System.out::println);
    }
}
