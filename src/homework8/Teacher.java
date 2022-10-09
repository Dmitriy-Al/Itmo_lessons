package homework8;

public class Teacher extends StaffFunctional {

    private String lesson;
    private String name;
    private int age;
    private int teacherSkill;

    public Teacher(String name, int age, String lesson, int teacherSkill) {
        super(name, age);
        setName(name);
        setAge(age);
        setLesson(lesson);
        setTeacherSkill(teacherSkill);
    }


    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setLesson(String lesson) {
        this.lesson = lesson;
    }

    private void setTeacherSkill(int teacherSkill) {
        this.teacherSkill = teacherSkill;
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
    protected String getLesson() {
        return lesson;
    }

    @Override
    protected int getTeacherSkill() {
        return teacherSkill;
    }

    @Override
    public int teach(int i) {
        return i;
    }

}
