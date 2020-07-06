package arraylistex2;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student("Lee", 1000);
        Student studentKim = new Student("Kim", 1001);
        Student studentCho = new Student("Cho", 1002);

        studentLee.setBookList("taebaek1", 1);
        studentLee.setBookList("taebaek2", 2);

        studentKim.setBookList("tozi1", 3);
        studentKim.setBookList("tozi2", 4);
        studentKim.setBookList("tozi3", 5);

        studentCho.setBookList("HarryPotter1", 6);
        studentCho.setBookList("HarryPotter2", 7);
        studentCho.setBookList("HarryPotter3", 8);
        studentCho.setBookList("HarryPotter4", 9);
        studentCho.setBookList("HarryPotter5", 10);
        studentCho.setBookList("HarryPotter6", 11);

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();
        studentCho.showStudentInfo();
    }
}
