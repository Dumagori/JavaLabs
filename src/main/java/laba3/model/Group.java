package laba3.model;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Group group = (Group) o;
        return students.equals(group.students) &&
                groupNumber.equals(group.groupNumber) &&
                bossGroupe.equals(group.bossGroupe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), students, groupNumber, bossGroupe);
    }
}
