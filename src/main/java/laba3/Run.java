package laba3;

import laba3.model.University;

public class Run {
    public static void main(String[] args) {
        BaseGenerate baseGenerate = new BaseGenerate();
        University ntu = baseGenerate.createUniversity();
    }
}
