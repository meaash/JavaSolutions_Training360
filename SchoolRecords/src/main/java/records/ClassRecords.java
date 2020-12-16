package records;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students;

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
        this.students = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student){
            if(!students
                .stream()
                .anyMatch(s -> s.getName().contains(student.getName()))){
                students.add(student);
                return true;
            }
            return false;
    } // felvesz egy diákot az osztályba

    public boolean removeStudent(Student student){
        if(students
                .stream()
                .anyMatch(s -> s.getName().contains(student.getName()))){
            students.remove(student);
            return true;
        }
        return false;
    } //kivesz egy diákot az osztályból

    public double calculateClassAverage(){
       if (students != null && !students.isEmpty()){
        double avgSum = 0.0;
        for (Student student: students) {
            if (student.calculateAverage() != 0.0) {
                avgSum += student.calculateAverage();
            }
            else{
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
        }
        return  avgSum / students.size();
       }
       else{
              throw new ArithmeticException("No student in the class, average calculation aborted!");
    }

    } //osztályátlagot számol, minden diákot figyelembe véve
    public double calculateClassAverageBySubject(Subject subject){
        if (students != null && !students.isEmpty()){
        double avgSum = 0.0;
        int count = 0;
        for (Student student: students) {
            if(student.calculateSubjectAverage(subject) != 0.0) {
                avgSum += student.calculateSubjectAverage(subject);
                count++;
            }
        }
        return  avgSum /count ;
        }
        else{
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
    }   //tantárgy szerinti osztályátlagot számol,
        // kihagyja azon diákokat, akiknek az adott tantárgyból nincs jegye.


    public Student findStudentByName(String name){
        if(isEmpty(name)){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if(students != null &&students.size()>0){
         /*   for (Student s : students) {
                if (s.getName().equals(name)){
                    return s;}
            }
            throw new IllegalArgumentException("Student name must not be empty!");*/
        return  students
                .stream()
                .filter(s ->s.getName().equals(name)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Student by this name cannot be found! "+name));
        }
            throw new IllegalStateException("No students to search!");

    } // név szerint megkeres egy diákot az osztályban
    public Student repetition(){
       // Random rnd = new Random();
        if (students != null && !students.isEmpty()){
        return students.get(rnd.nextInt(students.size()));
        }
        throw new IllegalStateException("No students to select for repetition!");

    } //felelethez a listából random módon kiválaszt egy diákot
    public List<StudyResultByName> listStudyResults(){
        List<StudyResultByName> result = new ArrayList<>();
        for (Student student: students) {
            result.add(new StudyResultByName(student.getName(), student.calculateAverage()));
        }
        return result;
    }  //a diákok nevét és tanulmányi átlagát egy-egy új objektumba viszi,
    // és azok listáját adja vissza

    public String listStudentNames(){
        List<String> names =
                        students.stream()
                        .map(s->s.getName()).collect(Collectors.toList());
       return String.join(", ", names);
    } //kilistázza a diákok neveit, vesszővel elválasztva

    private boolean isEmpty(String str){
        return (str == null || str.isEmpty());
    }
}
