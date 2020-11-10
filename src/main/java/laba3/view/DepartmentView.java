package laba3.view;

import laba3.model.Group;

import java.util.ArrayList;

public class DepartmentView {
    public void printDepartmentDetails (String departmentName, ArrayList<Group> groups){
        System.out.println("Department: " +departmentName);
        for (int i=0; i<groups.size()-1; i++){
            System.out.println(groups.get(i));
        }
    }
}
