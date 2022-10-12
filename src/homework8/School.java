package homework8;

public class School {

    public final static String LESSON1 = "Defence against the dark arts";
    public final static String LESSON2 = "Potions";
    public final static String LESSON3 = "Transfiguration";
    public final static String SCHOOL = "Hogwarts School of Witchcraft and Wizardry";
    private Director director;
    private Teacher[] teacher = new Teacher[3];
    private Student[] student = new Student[3];

    public School(int days, Director director, Teacher[] teacher, Student[] student) {

        setDirector(director);

        System.arraycopy(student, 0, this.student, 0, student.length);

        System.arraycopy(teacher, 0, this.teacher, 0, teacher.length);

        beginDayAtSchool(days);
    }

    private void setDirector(Director director) {
        this.director = director;
    }

    protected void beginDayAtSchool(int days) {
        for (int i = 1; i <= days; i++) {
            System.out.println("*** Day " + i + " at " + SCHOOL + " ***");
            director.learningStart();

            for (Teacher t : teacher) {
                for (Student s : student) {
                    if (t.getLesson().equals(s.lesson1) || t.getLesson().equals(s.lesson2) || t.getLesson().equals(s.lesson3)) {
                        s.learn(t.teach(t.getTeacherSkill()));
                        System.out.println("Teacher " + t.getName() + " teaches student " + s.getName() + " " + t.getLesson());
                    } else {
                        System.out.println("No lesson");
                    }
                }
            }

            for (Student s : student) {
                System.out.println(s.getName() + " knowledge " + s.getKnowledge());
            }

            director.learningFinish();
        }
    }

}
