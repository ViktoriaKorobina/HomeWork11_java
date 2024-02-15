package org.example.controller;

import org.example.model.People;
import org.example.model.Student;
import org.example.model.StudyGroup;
import org.example.model.Teacher;
import org.example.service.StudyGroupService;
import org.example.view.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private StudyGroup studyGroup;
    private View view;

    public Controller() {
        studyGroup = new StudyGroup();
        view = new View();
    }
    public void start(){
        List<Student> list = new ArrayList<>();
        People teacher = new Teacher("Anna Ivanovna", 30, 26, "math");
        People student1 = new Student("Vasya", 13, 10, 4.5);
        People student2 = new Student("Vanya", 13, 9, 4.0);
        People student3 = new Student("Lena", 13, 8, 5.0);
        list.add((Student) student1);
        list.add((Student) student2);
        list.add((Student) student3);
        StudyGroupService sgs = new StudyGroupService();
        studyGroup = sgs.create(list, (Teacher) teacher);
        view.printOfStudyGroup(studyGroup);






    }
}
