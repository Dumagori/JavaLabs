package laba4.view;

import laba4.ColorList;
import laba4.model.Boss;
import laba4.model.Group;

import java.util.ArrayList;

public class DepartmentView {
    public void printDepartmentDetails (String departmentName, Boss boss, ArrayList<Group> groups){
        System.out.println(ColorList.ANSI_CYAN+"\nDepartment: " +departmentName);
        //for (int i=0; i<groups.size()-1; i++){
        //    System.out.println(groups.get(i));
        //}
    }
}
