package laba4.view;

import laba4.ColorList;
import laba4.model.Boss;
import laba4.model.Student;

import java.util.ArrayList;

public class GroupView {
    public void printGroupDetails (String groupNumber, Boss boss, ArrayList<Student> students){
        System.out.println(ColorList.ANSI_CYAN+"\nGroup: " + groupNumber);
        //for (Student person : students){
        //    System.out.println(person);
        //}
    }
}
