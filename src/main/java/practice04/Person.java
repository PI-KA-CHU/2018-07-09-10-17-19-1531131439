package practice04;

public class Person {
    private String name;
    private int age;
    private String basicIntro;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        basicIntro = "My name is " + this.name + ". I am " + this.age + " years old.";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return basicIntro;
    }
}
