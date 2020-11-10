package laba4.view;

import laba4.ColorList;
import laba4.model.Sex;

public class StudentView {
    public void printStudentDetails (String name, String surname, String fathersName, int level, Sex sex){
        System.out.println(ColorList.ANSI_CYAN+"\nName: " +name + " | Surname: " +surname + " | FathersName: " +fathersName + " | Level: " + level + " | Sex: " + sex);
    }
}
