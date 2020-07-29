package arraylistex;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private int studentID;
    ArrayList<Subject> scoreList = new ArrayList<Subject>();

    public Student(String name, int ID) {
        this.studentName = name;
        this.studentID = ID;
    }

    public void setScore(String subject, int score) {
        Subject input = new Subject();
        input.setScore(score);
        input.setSubject(subject);
        scoreList.add(input);
    }

    public void showScoreInfo() {
        int total = 0;

        System.out.println(this.studentName);
        for (Subject info : scoreList) {
            System.out.println(info.getSubject() + " " + info.getScore());
            total += info.getScore();
        }
        System.out.println("Total : " + total);

    }
}
