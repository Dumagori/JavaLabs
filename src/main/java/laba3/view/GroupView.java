package laba3.view;

import laba3.ColorList;
import laba3.model.Boss;
import laba3.model.Student;
import java.util.ArrayList;

public class GroupView {
    public void printGroupDetails (String groupNumber, Boss boss, ArrayList<Student> students){
        System.out.println(ColorList.ANSI_CYAN+"\nGroup: " + groupNumber);
        //for (Student person : students){
        //    System.out.println(person);
        //}
    }
}
