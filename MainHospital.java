/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myproject;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MyProject {

    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    Hospital hospital = new Hospital();
     System.out.println("   \"HOSPITAL SYSTEM\"   \n\n");
            boolean f=true;
            while(f){
                 System.out.println(" _ please choice number :\n"+
            " 1 _ add doctor .\n"+
            " 2 _ add patient .\n"+
            " 3 _ show doctors .\n"+
            " 4 _ show patents .\n"+
            " 5 _ Exit .\n"
            );
            int choice=in.nextInt();
            in.nextLine();
            switch(choice){
                case 1:
                    System.out.println("enter doctor name :");
                    String nameDoctor=in.nextLine();
                    System.out.println("enter doctor age :");
                    int ageDoctor =in.nextInt();
                    System.out.println("enter doctor phone number :");
                    int phoneDoctor =in.nextInt();
                    System.out.println("enter doctor ID :");
                    int idDoctor =in.nextInt();
                    in.nextLine();
                    System.out.println("enter doctor Specialty :");
                    String specialtyDoctor =in.nextLine();
                    Doctor d = new Doctor(nameDoctor,ageDoctor,phoneDoctor,idDoctor,specialtyDoctor);
                    hospital.addDoctor(d);
                    break;
                case 2:
                    System.out.println("enter patient name :");
                    String namepatient=in.nextLine();
                    System.out.println("enter patient age :");
                    int agepatient =in.nextInt();
                    System.out.println("enter patient phone number :");
                    int phonepatient =in.nextInt();
                    System.out.println("enter patient ID :");
                    int idpatient =in.nextInt();
                    in.nextLine();
                    System.out.println("enter patient disease :");
                    String disease =in.nextLine();
                    Patient p = new Patient(namepatient,agepatient,phonepatient,idpatient,disease);
                    hospital.addPatient(p);
                    break;
                case 3:
                     hospital.showDoctor();
                    break;
                case 4:
                     hospital.showPatient();
                    break;
                case 5:
                     System.out.println("  Thank you.");
                    f=false;
                    break;
                default :
                     System.out.println(" please choice to number of list.");
                      break;
            }
    }
}
}
