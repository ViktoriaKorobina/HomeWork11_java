package org.example.service;

import org.example.model.Student;
import org.example.model.StudyGroup;
import org.example.model.Teacher;

import java.util.List;

public class StudyGroupService {
    private List<Student> listOgGroup;
    public StudyGroup create(List<Student> list, Teacher teacher){
        StudyGroup studyGroup = new StudyGroup(list, teacher);
        return studyGroup;

    }
}
