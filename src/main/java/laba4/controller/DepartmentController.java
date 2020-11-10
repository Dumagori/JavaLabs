package laba4.controller;

import laba4.model.Department;
import laba4.view.DepartmentView;

public class DepartmentController {
    private Department departmentModel;
    private DepartmentView departmentView;

    public DepartmentController(Department departmentModel, DepartmentView departmentView){
        this.departmentModel = departmentModel;
        this.departmentView = departmentView;
    }

    public Department getDepartmentModel() {
        return departmentModel;
    }

    public void setDepartmentModel(Department departmentModel) {
        this.departmentModel = departmentModel;
    }

    public DepartmentView getDepartmentView() {
        return departmentView;
    }

    public void setDepartmentView(DepartmentView departmentView) {
        this.departmentView = departmentView;
    }

    public void updateDepartmentView(){
        departmentView.printDepartmentDetails(departmentModel.getDepartmentName(), departmentModel.getBoss(), departmentModel.getGroups());
    }
}
