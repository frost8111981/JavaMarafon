package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random ran = new Random();
        int randomNum = ran.nextInt(4) + 2;

        String evaluate = "";
        switch (randomNum) {
            case 2:
                evaluate = "неудовлетворительно";
                break;

            case 3:
                evaluate = "удовлетворительно";
                break;

            case 4:
                evaluate = "хорошо";
                break;

            case 5:
                evaluate = "отлично";
                break;
        }

        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                " по предмету " + this.subject + " на оценку " + randomNum + " - " + evaluate );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
