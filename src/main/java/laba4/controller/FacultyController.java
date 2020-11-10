package laba4.controller;

import laba4.model.Faculty;
import laba4.view.FacultyView;

public class FacultyController {

    private Faculty facultyModel;
    private FacultyView facultyView;

    public FacultyController(Faculty facultyModel, FacultyView facultyView) {
        this.facultyModel = facultyModel;
        this.facultyView = facultyView;
    }

    public Faculty getFacultyModel() {
        return facultyModel;
    }

    public void setFacultyModel(Faculty facultyModel) {
        this.facultyModel = facultyModel;
    }

    public FacultyView getFacultyView() {
        return facultyView;
    }

    public void setFacultyView(FacultyView facultyView) {
        this.facultyView = facultyView;
    }

    public void updateFacultyView(){
        facultyView.printFacultyDetails(facultyModel.getFacultyName(), facultyModel.getBoss(), facultyModel.getDepartments());
    }
}
