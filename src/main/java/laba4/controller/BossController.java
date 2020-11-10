package laba4.controller;

import laba4.model.Boss;
import laba4.view.BossView;

public class BossController {
    private Boss bossModel;
    private BossView bossView;

    public BossController(Boss bossModel, BossView bossView){
        this.bossModel = bossModel;
        this.bossView = bossView;
    }

    public Boss getBossModel() {
        return bossModel;
    }

    public void setBossModel(Boss bossModel) {
        this.bossModel = bossModel;
    }

    public BossView getBossView() {
        return bossView;
    }

    public void setBossView(BossView bossView) {
        this.bossView = bossView;
    }

    public void updateBossView (){
        bossView.printBossDetails(bossModel.getName(),bossModel.getSurname(),bossModel.getFathersName(),bossModel.getSex(),bossModel.getAreaControl());
    }
}
