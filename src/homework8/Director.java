package homework8;

public class Director extends StaffFunctional {

    private String name;
    private int age;

    public Director(String name, int age) {
        super(name, age);
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
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
    protected void learningStart() {
        System.out.println(this.getName() + ": Students, it's time to study!");
    }

    @Override
    protected void learningFinish() {
        System.out.println(this.getName() + ": Students, lessons was finished, lets go to dormitories!\n");
    }

}
