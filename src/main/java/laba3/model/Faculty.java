package laba3.model;

import java.util.ArrayList;

public class Faculty extends UniversityBase {
    public ArrayList<Department> departments;
    private String facultyName;
    private Boss bossFaculty;

    public Boss getBossFaculty() {
        return bossFaculty;
    }

    public void setBossFaculty(Boss bossFaculty) {
        this.bossFaculty = bossFaculty;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
}
