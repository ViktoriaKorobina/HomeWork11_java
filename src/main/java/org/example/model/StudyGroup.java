package org.example.model;

import java.util.List;

public class StudyGroup {
    private List<Student> listOfGroup;
    private Teacher teacher;

    public StudyGroup(List<Student> listOfGroup, Teacher teacher) {
        this.listOfGroup = listOfGroup;
        this.teacher = teacher;
    }

    public StudyGroup() {
        teacher = new Teacher();

    }

    public List<Student> getListOfGroup() {
        return listOfGroup;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
