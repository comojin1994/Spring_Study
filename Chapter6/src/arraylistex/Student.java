package arraylistex;

import java.util.ArrayList;

public class Student {
    private String name;
    ArrayList<Integer> scorelist = new ArrayList<Integer>();
    ArrayList<String> subjectlist = new ArrayList<String>();
    private int total;

    public Student(String name){
        this.name = name;
    }

    public void setScore(String subject, int score){
        subjectlist.add(subject);
        scorelist.add(score);
    }

    public void showScoreInfo(){
        for(int i = 0; i < scorelist.size(); i++){
            System.out.println(this.name + "'s " + subjectlist.get(i) + " score is " + scorelist.get(i));
        }

        System.out.println(this.name + "'s total score is " + getTotal());
    }

    public int getTotal() {
        for (int i = 0; i < scorelist.size(); i++) {
            total += scorelist.get(i);
        }
        return total;
    }

}
