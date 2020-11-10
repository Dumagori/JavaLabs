package laba3.model;

import java.util.ArrayList;

public class University {

    public ArrayList<Faculty> faculties;
    public String address;
    public String universityName;
    public String bossUniversity;

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(ArrayList<Faculty> faculties) {
        this.faculties = faculties;
    }

    public String getBossUniversity() {
        return bossUniversity;
    }

    public void setBossUniversity(String bossUniversity) {
        this.bossUniversity = bossUniversity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
