/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banksystem;

/**
 *
 * @author Mahmoud Hussein
 */
public class Account {
   // Base class for all bank accounts, handling core attributes like balance and owner info.
    private String typeAccount;
    private String ownerName;
    private int numberAccount;
    private double balance;
    private String password;
    public Account(String typeAccount,String owneName,int numberAccount,double balance,String password){
        this.typeAccount=typeAccount;
        this.ownerName=owneName;
        this.numberAccount=numberAccount;
        this.balance=balance;
        this.password=password;
    }
    void setName(String ownerName){
        this.ownerName=ownerName;
        System.out.println("done changed the owner name successfully .");
}
    String getName(){return ownerName;}
    void setPass(String password){
        this.password=password;
        System.out.println("done changed your password account successfully .");
}
    String getPass(){return password;}
    double getBalance(){
        return balance;
    }
    int getNumber(){
        return numberAccount;
    }
    void deposit(double ammount){
        // Adds a positive amount to the account balance.
        if(ammount>0){
            balance+=ammount;
            System.out.println("Deposit done successfuly .");
        }
        else {
            System.out.println("the ammount must be a positive .");
        }
    }
        boolean withdraw(double ammount){
            // Validates if the withdrawal amount is positive and within the available balance
        if(ammount<balance&&ammount>0){
            balance-=ammount;
            System.out.println("withdraw done successfuly .");
            return true;
        }
            else{
                System.out.println("must ammount be smaller or equal than you balance .");
                return false;
            }
        }
    String printInfo(){
        // Returns a formatted string with all account details.
        return "your type account is : "+typeAccount+"\nyour name is : "+ownerName+"\n your number account is : "+numberAccount+"\n your balance is : "+balance+"\n\n\n";   
    }
}
