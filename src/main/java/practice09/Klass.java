package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> students;

    public Klass(int number) {
        this.number = number;
        this.students = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student){
        if (!students.contains(student)){
            System.out.print("It is not one of us.\n");
        }else {
            this.leader = student;
        }
    }

    public String getDisplayName(){
        return "Class " + this.number;
    }

    public void appendMember(Student student){
        if (!students.contains(student)) {
            students.add(student);
        }
    }

}
