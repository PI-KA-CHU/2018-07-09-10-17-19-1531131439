package practice09;

public class Teacher extends Person{

    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String baseIntro = super.introduce() + " I am a Teacher.";
        if (klass != null) {
            return baseIntro + " I teach Class " + klass.getNumber() + ".";
        }else {
            return baseIntro + " I teach No Class.";
        }
    }

    public String introduceWith(Student student){
        String baseIntro = super.introduce() + " I am a Teacher.";

        if (this.klass == student.getKlass()) {
            return baseIntro + " I teach " + student.getName() +  ".";
        }else {
            return baseIntro + " I don't teach " + student.getName() + ".";
        }
    }
}
