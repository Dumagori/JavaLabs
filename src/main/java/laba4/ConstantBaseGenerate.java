package laba4;

import com.github.javafaker.Faker;

import laba3.ColorList;
import laba3.controller.*;
import laba3.model.*;
import laba3.view.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConstantBaseGenerate {
    public University createUniversity() {

        University universityModel = retriveUniversityFromDatabase();


        UniversityView universityView = new UniversityView();
        UniversityController universityController = new UniversityController(universityModel, universityView);

        universityController.updateUniversityView();

        return universityModel;
    }

    private University retriveUniversityFromDatabase() {
        University university = new University();
        Faker faker = new Faker();

        String name = faker.team().name();
        university.setUniversityName(name);

        Boss universityBoss = retriveBossFromDatabase(name);
        BossView bossView = new BossView();
        BossController bossController = new BossController(universityBoss, bossView);
        bossController.updateBossView();
        university.setBossUniversity(universityBoss);

        university.setLocation(faker.address().city());

        ArrayList<Faculty> faculties = (ArrayList<Faculty>) createFaculty();
        university.setFaculties(faculties);

        return university;
    }

    private List<Faculty> createFaculty() {
        ArrayList<Faculty> faculties = new ArrayList<Faculty>();
            Faculty facultyModel = retriveFacultyFromDatabase();
            faculties.add(facultyModel);

            FacultyView facultyView = new FacultyView();
            FacultyController facultyController = new FacultyController(facultyModel, facultyView);

            facultyController.updateFacultyView();

        return faculties;
    }

    private Faculty retriveFacultyFromDatabase() {
        Faculty faculty = new Faculty();
        Faker faker = new Faker();

        String name = faker.team().name();
        faculty.setFacultyName(name);

        Boss facultyBoss = retriveBossFromDatabase(name);
        BossView bossView = new BossView();
        BossController bossController = new BossController(facultyBoss, bossView);
        bossController.updateBossView();
        faculty.setBossFaculty(facultyBoss);

        ArrayList<Department> departments = (ArrayList<Department>) createDepartment();
        faculty.setDepartments(departments);

        return faculty;
    }

    private List<Department> createDepartment() {
        ArrayList<Department> departments = new ArrayList<Department>();

        Department departmentModel = retriveDepartmentFromDatabase();
        departments.add(departmentModel);

        DepartmentView departmentView = new DepartmentView();
        DepartmentController departmentController = new DepartmentController(departmentModel, departmentView);

        departmentController.updateDepartmentView();

        return departments;
    }

    private Department retriveDepartmentFromDatabase() {
        Department department = new Department();
        Faker faker = new Faker();

        String name = faker.team().name();
        department.setDepartmentName(name);

        Boss departmentBoss = retriveBossFromDatabase(name);
        BossView bossView = new BossView();
        BossController bossController = new BossController(departmentBoss, bossView);
        bossController.updateBossView();
        department.setBossDepartment(departmentBoss);

        ArrayList<Group> groups = (ArrayList<Group>) createGroup();
        department.setGroups(groups);

        return department;
    }

    private List<Group> createGroup() {
        ArrayList<Group> groups = new ArrayList<Group>();

        Group groupModel = retriveGroupFromDatabase();
        groups.add(groupModel);

        GroupView groupView = new GroupView();
        GroupController groupController = new GroupController(groupModel, groupView);

        groupController.updateGroupeView();

        return groups;
    }

    private Group retriveGroupFromDatabase() {
        Group group = new Group();
        Faker faker = new Faker();

        String number = faker.team().name();
        group.setGroupNumber(number);

        Boss groupBoss = retriveBossFromDatabase(number);
        BossView bossView = new BossView();
        BossController bossController = new BossController(groupBoss, bossView);
        bossController.updateBossView();
        group.setBossGroupe(groupBoss);

        ArrayList<Student> students = (ArrayList<Student>) createStudent();
        group.setStudents(students);

        return group;
    }

    private List<Student> createStudent() {
        ArrayList<Student> students = new ArrayList<Student>();

        Student studentModel = retriveStudentFromDatabase();
        students.add(studentModel);

        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(studentModel, studentView);

        studentController.updateStudentView();

        return students;
    }

    private Student retriveStudentFromDatabase() {
        Faker faker = new Faker();
        Random random = new Random();
        ArrayList<Sex> sex = new ArrayList();
        sex.add(Sex.FEMALE);
        sex.add(Sex.MALE);

        Student student = new Student();
        student.setName(faker.name().firstName());
        student.setSurname(faker.name().lastName());
        student.setFathersName(faker.name().username());
        student.setLevel(random.nextInt(6));
        student.setSex(sex.get(random.nextInt(2)));

        return student;
    }

    private Boss retriveBossFromDatabase(String nameAria){
        Faker faker = new Faker();
        Random random = new Random();
        ArrayList<Sex> sex = new ArrayList();
        sex.add(Sex.FEMALE);
        sex.add(Sex.MALE);

        Boss boss = new Boss();
        boss.setName(faker.name().firstName());
        boss.setSurname(faker.name().lastName());
        boss.setFathersName(faker.name().username());
        boss.setSex(sex.get(random.nextInt(2)));
        boss.setAreaControl(nameAria);

        return boss;
    }
}
