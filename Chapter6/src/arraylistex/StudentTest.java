package arraylistex;

public class StudentTest {
    public static void main(String[] args) {
        Student studentKim = new Student("Lee", 1000);
        Student studentLee = new Student("Kim", 1001);

        studentKim.setScore("Korean", 100);
        studentKim.setScore("Math", 90);
        studentKim.showScoreInfo();

        System.out.println("=======================");

        studentLee.setScore("Korean", 100);
        studentLee.setScore("Math", 90);
        studentLee.setScore("Engish", 80);
        studentLee.showScoreInfo();
    }
}
