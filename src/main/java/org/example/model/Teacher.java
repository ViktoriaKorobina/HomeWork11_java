package org.example.model;

public class Teacher extends People{
    private Integer teacherId;
    private String studySubject;

    public Teacher(String name, Integer age, Integer teacherId, String studySubject) {
        super(name, age);
        this.teacherId = teacherId;
        this.studySubject = studySubject;
    }

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher() {
        super();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", studySubject='" + studySubject + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public String getStudySubject() {
        return studySubject;
    }
}
