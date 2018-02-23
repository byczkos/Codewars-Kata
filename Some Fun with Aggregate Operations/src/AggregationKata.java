import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Some Fun with Aggregate Operations (Part 1)

//Java 8 has introduced a sexy new Stream API which makes it possible to solve some data related problems in just a few lines of code. Let's try it out!
//
//        You have a Student class (see the class declaration below).
//
//        You have an array of students and you want to get some aggregate data.
//
//        THE TASK: get the average grade for every department.
//
//        Implement the method using Java 8 Stream API.
//
//        Have Fun!
//
//        Student class declaration:
//
//public class Student {
//    private String name;
//    private double grade;
//    private String department;
//    private Gender gender;
//
//    public static final double PASSING_GRADE = 70.0;
//
//    public enum Gender {
//        MALE, FEMALE
//    }
//
//    public Student(String name, double grade, String department, Gender gender) {
//        this.name = name;
//        this.grade = grade;
//        this.department = department;
//        this.gender = gender;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getGrade() {
//        return grade;
//    }
//
//    public void setGrade(double grade) {
//        this.grade = grade;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public Gender getGender() {
//        return gender;
//    }
//
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }
//}

public class AggregationKata {

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

        System.out.println(getAverageGradeByDepartment(students1));
    }

    public static Map<String, Double> getAverageGradeByDepartment(Stream<Student> students) {
        Map<String, Double> avareageGrade = new HashMap<>();

        List<Student> studentList = students.collect(Collectors.toList());

        double sumCs = studentList.stream().filter(s -> s.getDepartment() == "CS").collect(Collectors.summingDouble(d -> d.getGrade()));
        long numberOfCsStudent = studentList.stream().filter(s -> s.getDepartment() == "CS").count();
        double avareageCs = sumCs/numberOfCsStudent;
        avareageGrade.put("CS",avareageCs);

        double sumPhilology = studentList.stream().filter(s -> s.getDepartment() == "Philology").collect(Collectors.summingDouble(d -> d.getGrade()));
        long numberOfPhilologyStudent = studentList.stream().filter(s -> s.getDepartment() == "Philology").count();
        double avareagePhilology = sumPhilology/numberOfPhilologyStudent;
        avareageGrade.put("Philology",avareagePhilology);
        return avareageGrade;
    }

}
