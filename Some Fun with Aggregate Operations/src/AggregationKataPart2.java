import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//THE TASK: get the number of students by department
//
//        Implement the method using Java 8 Stream API.
//
//        Have Fun!

public class AggregationKataPart2 {
    public static Map<String, Long> getNumberOfStudentsByDepartment(Stream<Student> students) {
        return students.
                collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
    }
}
