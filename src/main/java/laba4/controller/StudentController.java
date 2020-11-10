package laba4.controller;

import laba4.model.Student;
import laba4.view.StudentView;

public class StudentController {
    private Student studentModel;
    private StudentView studentView;

    public StudentController(Student studentModel, StudentView studentView){
        this.studentModel = studentModel;
        this.studentView = studentView;
    }

    public Student getStudentModel() {
        return studentModel;
    }

    public void setStudentModel(Student studentModel) {
        this.studentModel = studentModel;
    }

    public StudentView getStudentView() {
        return studentView;
    }

    public void setStudentView(StudentView studentView) {
        this.studentView = studentView;
    }

    public void updateStudentView(){
        studentView.printStudentDetails(studentModel.getName(), studentModel.getSurname(), studentModel.getFathersName(), studentModel.getLevel(), studentModel.getSex());
    }
}
