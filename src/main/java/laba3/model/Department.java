package laba3.model;

import java.util.ArrayList;

public class Department extends Faculty {
    private ArrayList<Group> groups;
    private String departmentName;
    private Boss bossDepartment;

    public Boss getBossDepartment() {
        return bossDepartment;
    }

    public void setBossDepartment(Boss bossDepartment) {
        this.bossDepartment = bossDepartment;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
