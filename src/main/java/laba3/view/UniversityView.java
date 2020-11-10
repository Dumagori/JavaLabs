package laba3.view;

import laba3.ColorList;
import laba3.model.Faculty;

import java.util.ArrayList;

public class UniversityView {
    public void printUniversityDetails (String universityName, String location, ArrayList<Faculty> faculties){
        System.out.println(ColorList.ANSI_CYAN+"\nUniversity: " + universityName + " | Location: " + location);
        //for (int i=0; i<faculties.size()-1; i++){
        //    System.out.println(faculties.get(i));
        //}
    }
}
