/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myproject;

/**
 * Doctor class represents a doctor with a specialty.
 * @author Mahmoud Hussein
 */
public class Doctor extends person {
     private int id;
     private String specialty;
    Doctor(String name,int age,int phon,int id,String specialty) {
        super(name,age,phon);
        this.id = id;
        this.specialty = specialty;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Doctor{"+ "name=" + name + ", age=" + age + ", phon=" + phon + ", id=" + id + ", specialty=" + specialty + '}';
    }
   
   
}
