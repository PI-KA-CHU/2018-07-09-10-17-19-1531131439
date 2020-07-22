package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass implements Subject{
    private int number;
    private Student leader;
    private List<Student> students;
    private List<Teacher> teachersObservers;

    public Klass(int number) {
        this.number = number;
        this.students = new ArrayList<>();
        teachersObservers = new ArrayList<>();
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
            notifyObserversWhenStuBeLeader(student);
        }
    }

    public String getDisplayName(){
        return "Class " + this.number;
    }

    public void appendMember(Student student){
        if (!students.contains(student)) {
            students.add(student);
            student.setKlass(this);
            // 有学生加入班级，通知该教室的老师（观察者）
            notifyObserversWhenStuInClass(student);
        }
    }

    public boolean isIn(Student student){
        return students.contains(student);
    }


    @Override
    public void registerObserver(Teacher teacher) {
        teachersObservers.add(teacher);
    }

    @Override
    public void removeObserver(Teacher teacher) {
        teachersObservers.remove(teacher);
    }

    @Override
    public void notifyObserversWhenStuInClass(Student student) {
        for(Teacher teacher :  teachersObservers){
            teacher.printMessageAboutStudentJoinClass(student);
        }
    }

    @Override
    public void notifyObserversWhenStuBeLeader(Student student) {
        for(Teacher teacher :  teachersObservers){
            teacher.printMessageAboutStudentBeLeader(student);
        }
    }
}