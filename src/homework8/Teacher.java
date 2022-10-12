package homework8;

public class Teacher extends StaffFunctional {

    private String lesson;
    private int teacherSkill;

    public Teacher(String name, int age, String lesson, int teacherSkill) {
        super(name, age);
        setName(name);
        setAge(age);
        setLesson(lesson);
        setTeacherSkill(teacherSkill);
    }

    private void setName(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException(error);
        } else {
            this.name = name;
        }
    }

    private void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException(error);
        } else {
            this.age = age;
        }
    }

    private void setLesson(String lesson) {
        if (lesson.length() < 3) {
            throw new IllegalArgumentException(error);
        } else {
            this.lesson = lesson;
        }
    }

    private void setTeacherSkill(int teacherSkill) {
        if (teacherSkill < 1) {
            throw new IllegalArgumentException(error);
        } else {
            this.teacherSkill = teacherSkill;
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
