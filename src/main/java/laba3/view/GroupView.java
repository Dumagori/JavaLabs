package laba3.view;

import laba3.model.Student;
import java.util.ArrayList;

public class GroupView {
    public void printGroupDetails (String groupName, ArrayList<Student> students){
        System.out.println("Group: " + groupName);
        for (Student person : students){
            System.out.println(person);
        }
    }
}
