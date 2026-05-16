/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myproject;
import java.util.ArrayList;
/**
 * Hospital class manages doctors and patients
 * @author Mahmoud Hussein
 */
public class Hospital {
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Patient> patients = new ArrayList<>();
    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
        System.out.println("Done added doctor "+doctor.getName()+" successfully .\n");
    }
     public void addPatient(Patient patient){
        patients.add(patient);
        System.out.println("Done added patient "+patient.getName()+" successfully .\n");
    }
     public void showDoctor(){
         System.out.println("   Doctors List   :");
         if(doctors.isEmpty()){
               System.out.println(" No Doctors found .");
         }
         else{
             for(Doctor d:doctors){
                 System.out.println(d);
             }
         }
     }
      public void showPatient(){
         System.out.println("   Patien List   :");
         if(patients.isEmpty()){
               System.out.println(" No Patien found .");
         }
         else{
             for(Patient p:patients){
                 System.out.println(p);
             }
         }
     }
      
      
      
}
