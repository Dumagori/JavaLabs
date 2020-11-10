package laba3.view;

import laba3.model.Sex;
public class StudentView {
    public void printStudentDetails (String name, String surname, String fathersName, int level, Sex sex){
        System.out.println("Name: " +name);
        System.out.println("Surname: " +surname);
        System.out.println("FathersName: " +fathersName);
        System.out.println("Level: " + level);
        System.out.println("Sex: " + sex);
    }
}
