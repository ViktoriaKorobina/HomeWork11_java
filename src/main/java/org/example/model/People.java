package org.example.model;

public abstract class People {
    protected String name;
    protected Integer age;

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public People() {

    }
}
