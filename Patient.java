/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template.
 */
package com.mycompany.myproject;

/**
 * Patient class represents a patient with disease information.
 * @author Mahmoud Hussein
 */
public class Patient extends person {
     private int id;
     private String disease;
 Patient(String name,int age,int phon,int id,String disease) {
        super(name, age, phon);
        this.id = id;
        this.disease = disease;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Patient{"+ "name=" + name + ", age=" + age + ", phon=" + phon + "id=" + id + '}';
    }
     
}
    
