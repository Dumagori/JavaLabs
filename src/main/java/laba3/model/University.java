package laba3.model;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return faculties.equals(that.faculties) &&
                location.equals(that.location) &&
                bossUniversity.equals(that.bossUniversity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faculties, location, bossUniversity);
    }
}
