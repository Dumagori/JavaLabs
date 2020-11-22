package laba3.model;
import laba3.model.Sex;

import java.util.Objects;

abstract public class Human {
    protected String name;
    protected String surname;
    protected String fathersName;
    protected Sex sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return name.equals(human.name) &&
                surname.equals(human.surname) &&
                fathersName.equals(human.fathersName) &&
                sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, fathersName, sex);
    }
}
