package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String baseIntro = super.introduce();
        String careerIntro = "I am a Teacher.";
        if (klass == null) {
            return baseIntro + " " +  careerIntro + " I teach No Class.";
        }
        return baseIntro + " " + careerIntro + " I teach Class " + klass.getNumber() + ".";
    }

    public String introduceWith(Student student){
        String baseIntro = super.introduce();
        String careerIntro = "I am a Teacher.";

        if (this.klass == student.getKlass()) {
            return baseIntro + " " + careerIntro + " I teach " + student.getName() +  ".";
        }else {
            return baseIntro + " " + careerIntro + " I don't teach " + student.getName() + ".";
        }
    }
}
