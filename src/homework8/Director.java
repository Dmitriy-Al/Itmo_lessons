package homework8;

public class Director extends StaffFunctional {

    public Director(String name, int age) {
        super(name, age);
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name.length() < 2){
            throw new IllegalArgumentException(error);
        } else {
            this.name = name;
        }
    }

    private void setAge(int age) {
        if (age < 33){
            throw new IllegalArgumentException(error);
        } else {
            this.age = age;
        }
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
