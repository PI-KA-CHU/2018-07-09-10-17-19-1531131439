package practice11;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        this.klass.appendMember(this);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String baseIntroduce =  super.introduce() + " I am a Student.";
        if (klass.getLeader() != null && klass.getLeader().getId() == super.getId()) {
            return baseIntroduce + " I am Leader of Class " + this.klass.getNumber() + ".";
        }else{
            return baseIntroduce + " I am at Class " + this.klass.getNumber() + ".";
        }
    }
}
