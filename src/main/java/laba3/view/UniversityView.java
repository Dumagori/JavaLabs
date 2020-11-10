package laba3.view;

import laba3.model.Faculty;

import java.util.ArrayList;

public class UniversityView {
    public void printUniversityDetails (String universityName, String adress, String nameBoss, ArrayList<Faculty> faculties){
        System.out.println("University: " + universityName);
        System.out.println("Adress: " + adress);
        System.out.println("Boss name: " + nameBoss);
        for (int i=0; i<faculties.size()-1; i++){
            System.out.println(faculties.get(i));
        }
    }
}
