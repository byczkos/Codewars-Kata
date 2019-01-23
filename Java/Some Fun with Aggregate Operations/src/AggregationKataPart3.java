import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;



//THE TASK: get the names of the students by department.
//
//        Implement the method using Java 8 Stream API.
//
//        Have Fun!

public class AggregationKataPart3 {

    public static Map<String, List<String>> getStudentNamesByDepartment(Stream<Student> students) {
        return students
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.mapping(Student::getName, Collectors.toList())));
    }

}