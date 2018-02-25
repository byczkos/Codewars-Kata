import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//THE TASK: get the the number of students by gender for each department.
//        (i.e. "CS" department has 2 males, 3 females, "Economics" department has 4 males, 5 females, etc.)

public class AggregationKataPart4 {

    public static Map<String, Map<Student.Gender, Long>> getTheNumberOfStudentsByGenderForEachDepartment(Stream<Student> students) {
        return students.
                collect(Collectors.
                        groupingBy(Student::getDepartment, Collectors.
                                groupingBy(Student::getGender, Collectors.counting())));
    }

}