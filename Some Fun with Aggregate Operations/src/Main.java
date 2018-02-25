import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[]) {
        Student galina = new Student("Galina", 95, "Philology", Student.Gender.FEMALE);
        Student anton = new Student("Anton", 90, "CS", Student.Gender.MALE);
        Student jack = new Student("Jack", 82, "Philology", Student.Gender.MALE);
        Student mike = new Student("Mike", 60, "Philology", Student.Gender.MALE);
        Student jane = new Student("Jane", 65, "CS", Student.Gender.FEMALE);

        List<Student> students = new ArrayList<>();
        students.add(galina);
        students.add(anton);
        students.add(jack);
        students.add(mike);
        students.add(jane);

        Stream<Student> students1 = students.stream();


        // You must run only one sout, the rest must be in comment

        System.out.println(AggregationKataPart1.getAverageGradeByDepartment(students1));
        //System.out.println(AggregationKataPart2.getNumberOfStudentsByDepartment(students1));
        //System.out.println(AggregationKataPart3.getStudentNamesByDepartment(students1));
        //System.out.println(AggregationKataPart4.getTheNumberOfStudentsByGenderForEachDepartment(students1));
    }
}
