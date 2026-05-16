/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myproject;

/**
 * Base class that represents a person in the hospital system.
 * @author Mahmoud Hussein
 */
public class Person {
    protected String name;
    protected int age;
    protected int phon;
    public person(String name, int age, int phon) {
        this.name = name;
        this.age = age;
        this.phon = phon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhon() {
        return phon;
    }

    public void setPhon(int phon) {
        this.phon = phon;
    }
    @Override
    public String toString() {
        return "person{" + "name=" + name + ", age=" + age + ", phon=" + phon + '}';
    }
    
}
