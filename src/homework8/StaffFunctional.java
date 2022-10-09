package homework8;

public abstract class StaffFunctional {

    private String lesson;
    private String name;
    private int age;
    private int knowledge;
    private int teacherSkill;

    public StaffFunctional(String name, int age) {
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

    private void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    private void setTeacherSkill(int teacherSkill) {
        this.teacherSkill = teacherSkill;
    }

    protected String getLesson() {
        return lesson;
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected int getKnowledge() {
        return knowledge;
    }

    protected int getTeacherSkill() {
        return teacherSkill;
    }

    protected int learn(int i) {
        return i;
    }

    public int teach(int i) {
        return i;
    }

    protected void learningStart() {
    }

    protected void learningFinish() {
    }

}
