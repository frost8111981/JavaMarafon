package day9.Task1;

import java.sql.SQLOutput;

public class Student extends Human {
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + super.getName());
    }

    public String getGroupName() {
        return groupName;
    }
}
