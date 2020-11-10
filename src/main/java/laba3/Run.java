package laba3;

import laba3.controller.*;
import laba3.model.*;
import laba3.view.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    public Run() {

        University universityModel = retriveUniversityFromDatabase();

        //UniversityView universityView = new UniversityView();
        //UniversityController universityController = new UniversityController(universityModel, universityView);

        //universityController.updateUniversityView();
    }

    private static University retriveUniversityFromDatabase() {
        Scanner scanner = new Scanner(System.in);

        University university = new University();

        System.out.print("Enter University name: ");
        university.setUniversityName(scanner.next());
        System.out.print("Enter adress of University: ");
        university.setAddress(scanner.next());
        System.out.print("Enter Boss name: ");
        university.setBossUniversity(scanner.next());

        ArrayList<Faculty> faculties = (ArrayList<Faculty>) createFaculty(scanner);
        university.setFaculties(faculties);

        return university;
    }

    private static List<Faculty> createFaculty(Scanner scanner) {
        ArrayList<Faculty> faculties = new ArrayList<Faculty>();

        System.out.print("Enter count of Faculties: ");
        int facultiesCount = scanner.nextInt();

        for (int i=0; i<facultiesCount; i++){
            Faculty facultyModel = retriveFacultyFromDatabase();
            faculties.add(facultyModel);

            //FacultyView facultyView = new FacultyView();
            //FacultyController facultyController = new FacultyController(facultyModel, facultyView);

            //facultyController.updateFacultyView();
        }

        return faculties;
    }

    private static Faculty retriveFacultyFromDatabase() {
        Scanner scanner = new Scanner(System.in);
        Faculty faculty = new Faculty();
        System.out.print("Enter faculty name: ");
        faculty.setFacultyName(scanner.next());

        ArrayList<Department> departments = (ArrayList<Department>) createDepartment(scanner);
        faculty.setDepartments(departments);

        return faculty;
    }

    private static List<Department> createDepartment(Scanner scanner) {
        ArrayList<Department> departments = new ArrayList<Department>();

        System.out.print("Enter count of Departments: ");
        int departmentsCount = scanner.nextInt();

        for (int i=0; i<departmentsCount; i++){
            Department departmentModel = retriveDepartmentFromDatabase();
            departments.add(departmentModel);

            //DepartmentView departmentView = new DepartmentView();
            //DepartmentController departmentController = new DepartmentController(departmentModel, departmentView);

            //departmentController.updateDepartmentView();
        }

        return departments;
    }

    private static Department retriveDepartmentFromDatabase() {
        Scanner scanner = new Scanner(System.in);
        Department department = new Department();
        System.out.print("Enter department name: ");
        department.setDepartmentName(scanner.next());

        ArrayList<Group> groups = (ArrayList<Group>) createGroup(scanner);
        department.setGroups(groups);

        return department;
    }

    private static List<Group> createGroup(Scanner scanner) {
        ArrayList<Group> groups = new ArrayList<Group>();

        System.out.print("Enter count of Groups: ");
        int groupsCount = scanner.nextInt();

        for (int i=0; i<groupsCount; i++){
            Group groupModel = retriveGroupFromDatabase();
            groups.add(groupModel);

            //GroupView groupView = new GroupView();
            //GroupController groupController = new GroupController(groupModel, groupView);

            //groupController.updateGroupeView();
        }

        return groups;
    }

    private static Group retriveGroupFromDatabase() {
        Scanner scanner = new Scanner(System.in);
        Group group = new Group();
        System.out.print("Enter group number: ");
        group.setGroupName(scanner.next());

        ArrayList<Student> students = (ArrayList<Student>) createStudent(scanner);
        group.setStudents(students);

        return group;
    }

    private static List<Student> createStudent(Scanner scanner) {
        ArrayList<Student> students = new ArrayList<Student>();

        System.out.print("Enter count of Students: ");
        int studentsCount = scanner.nextInt();

        for (int i =0; i<studentsCount; i++){
            Student studentModel = retriveStudentFromDatabase();
            students.add(studentModel);

            //StudentView studentView = new StudentView();
            //StudentController studentController = new StudentController(studentModel, studentView);

            //studentController.updateStudentView();
        }

        return students;
    }

    private static Student retriveStudentFromDatabase() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter student name: ");
        student.setName(scanner.next());
        System.out.print("Emter student surname: ");
        student.setSurname(scanner.next());
        System.out.print("Enter student father name: ");
        student.setFathersName(scanner.next());
        System.out.print("Enter student level: ");
        student.setLevel(scanner.nextInt());
        System.out.print("Enter student sex: ");
        student.setSex(Sex.valueOf(scanner.next()));

        return student;
    }
}
