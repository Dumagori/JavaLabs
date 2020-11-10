package laba3.view;

import laba3.ColorList;
import laba3.model.Group;
import laba3.model.Boss;

import java.util.ArrayList;

public class DepartmentView {
    public void printDepartmentDetails (String departmentName, Boss boss, ArrayList<Group> groups){
        System.out.println(ColorList.ANSI_CYAN+"\nDepartment: " +departmentName);
        //for (int i=0; i<groups.size()-1; i++){
        //    System.out.println(groups.get(i));
        //}
    }
}
