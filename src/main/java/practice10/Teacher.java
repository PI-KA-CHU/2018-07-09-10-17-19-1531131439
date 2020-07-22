package practice10;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person{
    private List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = new LinkedList<>();
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public List<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        StringBuilder baseIntro = new StringBuilder(super.introduce() + " I am a Teacher.");
        if (!classes.isEmpty()) {
            baseIntro.append(" I teach Class ");
            baseIntro.append(generateClassesString(classes)).append(".");
            return baseIntro.toString();
        }else {
            return baseIntro + " I teach No Class.";
        }
    }

    public String introduceWith(Student student){
        String baseIntro = super.introduce() + " I am a Teacher.";

        if (isTeaching(student)) {
            return baseIntro + " I teach " + student.getName() +  ".";
        }else {
            return baseIntro + " I don't teach " + student.getName() + ".";
        }
    }

    private String generateClassesString(List<Klass> classes){
        StringBuilder classString = new StringBuilder();
        for (int i = 0; i < classes.size(); i++) {
            if (i != 0) {
                classString.append(", ").append(classes.get(i).getNumber());
            }else {
                classString.append(classes.get(i).getNumber());
            }
        }
        return classString.toString();
    }

    public boolean isTeaching(Student student){
        for (Klass klass : classes) {
            if (klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }
}
