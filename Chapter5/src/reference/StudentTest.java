package reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "LEE");

        studentLee.setKoreaSubject("Korean", 100);
        studentLee.setMathSubject("Math", 95);

        Student studentKim = new Student(101, "Kim");

        studentKim.setKoreaSubject("Korean", 80);
        studentKim.setMathSubject("Math", 99);

        studentLee.showStudentScore();
        studentKim.showStudentScore();
    }
}
