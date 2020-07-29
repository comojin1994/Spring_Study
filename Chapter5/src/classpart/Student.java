package classpart;

public class Student {

    private int studentID; // 클래스 내부에서만 사용 할 수 있음, 초기화는 가능
    public String studentName;
    public String address;

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        address = "주소 없음";
    }

    // 오버로딩
    public Student(String name) {
        studentName = name;
    }

//    디폴트
//    public Studnet() {}

    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }

    public String getStudentName() {
        return studentName;
    }
// 이렇게도 가능하지만 개념의 혼동을 방지하고자 안씀 파이썬 if __name__ == '__main__':으로 생각
//    public static void main(String[] args) {
//        Student studentTest = new Student();
//        studentTest.studentName = "Tom";
//        studentTest.address = "LA";
//        studentTest.showStudentInfo();
//    }

}
