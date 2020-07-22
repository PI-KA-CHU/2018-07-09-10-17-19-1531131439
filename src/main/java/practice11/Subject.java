package practice11;

public interface Subject {
    void registerObserver(Teacher person);
    void removeObserver(Teacher teacher);
    void notifyObserversWhenStuInClass(Student student);
    void notifyObserversWhenStuBeLeader(Student student);

}
