/**
 * Created by Andy on 3/3/2015.
 */
public class Test {
    static void printRecords(Student[] students) {
        for (Student s : students) {
            s.printRecord();
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new GradStudent();
        students[1] = new GradStudent();
        students[2] = new UnderGradStudent();
        printRecords(students);
    }

}
