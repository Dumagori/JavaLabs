package laba4.view;

import laba4.ColorList;
import laba4.model.Boss;
import laba4.model.Department;

import java.util.ArrayList;

public class FacultyView {
    public void printFacultyDetails (String facultyname, Boss boss, ArrayList<Department> department){
        System.out.println(ColorList.ANSI_CYAN+"\nFaculty name: " +facultyname);
        //for (int i=0; i<department.size()-1; i++){
        //    System.out.println(department.get(i));
        //}
    }
}