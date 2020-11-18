package laba3.model;

import java.util.ArrayList;

public class University extends UniversityBase {

    public ArrayList<Faculty> faculties;
    public String location;
    public Boss bossUniversity;

    public Boss getBossUniversity() {
        return bossUniversity;
    }

    public void setBossUniversity(Boss bossUniversity) {
        this.bossUniversity = bossUniversity;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(ArrayList<Faculty> faculties) {
        this.faculties = faculties;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
