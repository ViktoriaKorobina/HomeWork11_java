package org.example.view;

import org.example.model.StudyGroup;

public class View {
    public void printOfStudyGroup(StudyGroup studyGroup){
        System.out.println(studyGroup.getTeacher().getTeacherId() + " ID учителя");
        for (int i = 0; i < studyGroup.getListOfGroup().size(); i++) {
            System.out.println(studyGroup.getListOfGroup().get(i).getStudentId() + " ID ученика");
        }
    }
}
