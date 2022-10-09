package homework8;

public class Student extends StaffFunctional {

    private String lesson1 = School.LESSON1;
    private String lesson2 = School.LESSON2;
    private String lesson3 = School.LESSON3;
    private String name;
    private int age;
    private int knowledge;

    public Student(String name, int age, int knowledge) {
        super(name, age);
        setName(name);
        setAge(age);
        setKnowledge(knowledge);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    @Override
    protected String getName() {
        return name;
    }

    @Override
    protected int getAge() {
        return age;
    }

    @Override
    protected int getKnowledge() {
        return knowledge;
    }

    @Override
    protected int learn(int i) {
        return knowledge += i;
    }

}
