package laba3.view;

import laba3.ColorList;
import laba3.model.Sex;

public class BossView {
    public void printBossDetails (String name, String surname, String fathersName, Sex sex, String areaControl){
        System.out.println(ColorList.ANSI_CYAN+"\nName: " +name + " | Surname: " +surname + " | FathersName: " +fathersName + " | Sex: " + sex + "| Area control: " + areaControl);
    }
}
