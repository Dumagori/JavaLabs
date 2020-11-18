package laba3.model;

import java.util.ArrayList;

public class Group extends Department{
    private ArrayList<Student> students;
    private String groupNumber;
    private Boss bossGroupe;

    public Boss getBossGroupe() {
        return bossGroupe;
    }

    public void setBossGroupe(Boss bossGroupe) {
        this.bossGroupe = bossGroupe;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupName) {
        this.groupNumber = groupName;
    }
}
