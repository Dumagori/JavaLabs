package laba3;

import laba3.controller.*;
import laba3.model.*;
import laba3.view.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseGenerate {
    public BaseGenerate() {

        University universityModel = retriveUniversityFromDatabase();


        UniversityView universityView = new UniversityView();
        UniversityController universityController = new UniversityController(universityModel, universityView);

        universityController.updateUniversityView();
    }

    private static University retriveUniversityFromDatabase() {
        String name;

        Scanner scanner = new Scanner(System.in);
        University university = new University();

        System.out.print(ColorList.ANSI_RESET+"Enter University name: ");
        name = scanner.next();
        university.setUniversityName(name);

        Boss universityBoss = retriveBossFromDatabase(name);
        BossView bossView = new BossView();
        BossController bossController = new BossController(universityBoss, bossView);
        bossController.updateBossView();

        System.out.print(ColorList.ANSI_RESET+"Enter location of University: ");
        university.setLocation(scanner.next());



        ArrayList<Faculty> faculties = (ArrayList<Faculty>) createFaculty(scanner);
        university.setFaculties(faculties);

        return university;
    }

    private static List<Faculty> createFaculty(Scanner scanner) {
        ArrayList<Faculty> faculties = new ArrayList<Faculty>();
        boolean listCreateFlag = true;

        while (listCreateFlag){
            Faculty facultyModel = retriveFacultyFromDatabase();
            faculties.add(facultyModel);

            FacultyView facultyView = new FacultyView();
            FacultyController facultyController = new FacultyController(facultyModel, facultyView);

            facultyController.updateFacultyView();

            System.out.println(ColorList.ANSI_GREEN+"\nNow u have " + faculties.size() + " faculties in this University");
            System.out.print(ColorList.ANSI_GREEN+"Do u wanna add more faculty? [yes/no]: ");
            listCreateFlag = "yes".equals(scanner.next());
        }

        return faculties;
    }

    private static Faculty retriveFacultyFromDatabase() {
        String name;

        Scanner scanner = new Scanner(System.in);
        Faculty faculty = new Faculty();

        System.out.print(ColorList.ANSI_RESET+"Enter faculty name: ");
        name = scanner.next();
        faculty.setFacultyName(name);

        Boss facultyBoss = retriveBossFromDatabase(name);
        BossView bossView = new BossView();
        BossController bossController = new BossController(facultyBoss, bossView);
        bossController.updateBossView();

        ArrayList<Department> departments = (ArrayList<Department>) createDepartment(scanner);
        faculty.setDepartments(departments);

        return faculty;
    }

    private static List<Department> createDepartment(Scanner scanner) {
        ArrayList<Department> departments = new ArrayList<Department>();
        boolean listCreateFlag = true;

        while (listCreateFlag){
            Department departmentModel = retriveDepartmentFromDatabase();
            departments.add(departmentModel);

            DepartmentView departmentView = new DepartmentView();
            DepartmentController departmentController = new DepartmentController(departmentModel, departmentView);

            departmentController.updateDepartmentView();

            System.out.println(ColorList.ANSI_GREEN+"\nNow u have " + departments.size() + " departments in this faculty");
            System.out.print(ColorList.ANSI_BLUE+"Do u vanna add more department? [yes/no]: ");
            listCreateFlag = "yes".equals(scanner.next());
        }

        return departments;
    }

    private static Department retriveDepartmentFromDatabase() {
        String name;

        Scanner scanner = new Scanner(System.in);
        Department department = new Department();

        System.out.print(ColorList.ANSI_RESET+"Enter department name: ");
        name = scanner.next();
        department.setDepartmentName(name);

        Boss departmentBoss = retriveBossFromDatabase(name);
        BossView bossView = new BossView();
        BossController bossController = new BossController(departmentBoss, bossView);
        bossController.updateBossView();

        ArrayList<Group> groups = (ArrayList<Group>) createGroup(scanner);
        department.setGroups(groups);

        return department;
    }

    private static List<Group> createGroup(Scanner scanner) {
        ArrayList<Group> groups = new ArrayList<Group>();
        boolean listCreateFlag = true;

        while (listCreateFlag){
            Group groupModel = retriveGroupFromDatabase();
            groups.add(groupModel);

            GroupView groupView = new GroupView();
            GroupController groupController = new GroupController(groupModel, groupView);

            groupController.updateGroupeView();

            System.out.println(ColorList.ANSI_GREEN+"\nNow u have " + groups.size() + " groups in this department");
            System.out.print(ColorList.ANSI_BLUE+"Do u wanna add more group? [yes/no]: ");
            listCreateFlag = "yes".equals(scanner.next());
        }

        return groups;
    }

    private static Group retriveGroupFromDatabase() {
        String number;

        Scanner scanner = new Scanner(System.in);
        Group group = new Group();

        System.out.print(ColorList.ANSI_RESET+"Enter group number: ");
        number = scanner.next();
        group.setGroupNumber(number);

        Boss groupBoss = retriveBossFromDatabase(number);
        BossView bossView = new BossView();
        BossController bossController = new BossController(groupBoss, bossView);
        bossController.updateBossView();

        ArrayList<Student> students = (ArrayList<Student>) createStudent(scanner);
        group.setStudents(students);

        return group;
    }

    private static List<Student> createStudent(Scanner scanner) {
        ArrayList<Student> students = new ArrayList<Student>();
        boolean listCreateFlag = true;

        while (listCreateFlag){
            Student studentModel = retriveStudentFromDatabase();
            students.add(studentModel);

            StudentView studentView = new StudentView();
            StudentController studentController = new StudentController(studentModel, studentView);

            studentController.updateStudentView();
            System.out.println(ColorList.ANSI_GREEN+"\nNow u have " + students.size() + " students in this group");
            System.out.print(ColorList.ANSI_BLUE+"Do u wanna add more student? [yes/no]: ");
            listCreateFlag = "yes".equals(scanner.next());
    }

        return students;
    }

    private static Student retriveStudentFromDatabase() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print(ColorList.ANSI_RESET+"Enter student name: ");
        student.setName(scanner.next());
        System.out.print(ColorList.ANSI_RESET+"Emter student surname: ");
        student.setSurname(scanner.next());
        System.out.print(ColorList.ANSI_RESET+"Enter student father name: ");
        student.setFathersName(scanner.next());
        System.out.print(ColorList.ANSI_RESET+"Enter student level: ");
        student.setLevel(scanner.nextInt());
        System.out.print(ColorList.ANSI_RESET+"Enter student sex: ");
        student.setSex(SexController.sexChoose(scanner.next()));

        return student;
    }

    private static Boss retriveBossFromDatabase(String nameAria){
        Scanner scanner = new Scanner(System.in);

        Boss boss = new Boss();
        System.out.println(ColorList.ANSI_GREEN+"\nCreate boss for " + nameAria);
        System.out.print(ColorList.ANSI_RESET+"Enter boss name: ");
        boss.setName(scanner.next());
        System.out.print(ColorList.ANSI_RESET+"Enter boss surname: ");
        boss.setSurname(scanner.next());
        System.out.print(ColorList.ANSI_RESET+"Enter father name: ");
        boss.setFathersName(scanner.next());
        System.out.print(ColorList.ANSI_RESET+"Enter boss sex: ");
        boss.setSex(SexController.sexChoose(scanner.next()));
        boss.setAreaControl(nameAria);

        return boss;
    }
}
