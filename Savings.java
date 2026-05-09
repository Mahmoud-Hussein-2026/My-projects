/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banksystem;

/**
 *
 * @author Admin
 */
public class Savings extends Account{
    private double intersRate;
    Savings(String typeAccount,String owneName,int numberAccount,double balance,String password,double intersRate){
    super(typeAccount,owneName,numberAccount,balance,password);
            this.intersRate=intersRate;
    }
        void addInstert(double intersRatr){
            double Rate = getBalance()*(intersRate/100);
            deposit(Rate);
        }

}
