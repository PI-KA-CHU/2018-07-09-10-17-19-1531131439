package practice06;

public class Teacher extends Person{
    private int klass = -1;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String baseIntro = super.introduce();
        String careerIntro = "I am a Teacher.";
        if (klass == -1) {
            return baseIntro + " " +  careerIntro + " I teach No Class.";
        }
        return baseIntro + " " + careerIntro + " I teach Class " + klass + ".";
    }
}
