package laba3.view;

import laba3.model.Department;

import java.util.ArrayList;

public class FacultyView {
    public void printFacultyDetails (String facultyname, ArrayList<Department> department){
        System.out.println("Faculty name: " +facultyname);
        for (int i=0; i<department.size()-1; i++){
            System.out.println(department.get(i));
        }
    }
}
