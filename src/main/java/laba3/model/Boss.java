package laba3.model;

import java.util.Objects;

public class Boss extends Human {
    private String areaControl;

    public String getAreaControl() {
        return areaControl;
    }

    public void setAreaControl(String areaControl) {
        this.areaControl = areaControl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boss boss = (Boss) o;
        return areaControl.equals(boss.areaControl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaControl);
    }
}
