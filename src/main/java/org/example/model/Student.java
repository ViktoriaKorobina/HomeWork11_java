package org.example.model;

public class Student extends People{
    private Integer studentId;
    private Double averageScore;

    public Student(String name, Integer age, Integer studentId, Double averageScore) {
        super(name, age);
        this.studentId = studentId;
        this.averageScore = averageScore;
    }

    public Student(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", averageScore=" + averageScore +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Double getAverageScore() {
        return averageScore;
    }
}
