/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banksystem;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class BankSystem {

    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     ArrayList<Account>allAcc=new ArrayList<>();
      while(true){
     System.out.println("please enter :\n"+
             " 1 _ log in :\n"+
             " 2 _ new account :\n"+
             " 3 _ Exit :\n"
     );
     int h =in.nextInt();
     if(h==1){
          System.out.println("please enter number your account :");
        int n =in.nextInt();
         System.out.println("please enter password your account to you want :");
           in.nextLine();
        String p =in.nextLine();
        for(Account acc:allAcc){
            if(acc.getNumber()==n&&acc.getPass().equals(p)){
                System.out.println("please enter :\n"+
        " 1:to change owner name\n"+
        " 2:to see final owner name\n"+
        " 3:to change password your account\n"+
        " 4:to see final password your account\n"+
        " 5:to debosit into your account\n"+
        " 6:to withdraw ammount from your balance\n"+
        " 7:to see the information you account\n");
        int num =in.nextInt();
        int now;
        String text;
        switch(num){
            case 1:
            System.out.println("pleas enter new owner name :");
            text=in.next();
            acc.setName(text);
            break;
            case 2:
            System.out.println(" name owner you account is :"+acc.getName());
            break;
            case 3:
            System.out.println("pleas enter new password :");
            text =in.next();
            acc.setPass(text);
            break;
            case 4:
            System.out.println(" new password your account is :"+acc.getPass());
            break;
             case 5:
            System.out.println("pleas enter ammount you want deposit in your balance :");
            now =in.nextInt();
            acc.deposit(now);
            break;
            case 6:
            System.out.println("pleas enter ammount you want withdraw into your balance :");
            now =in.nextInt();
            acc.withdraw(now);
            break;
            case 7:
            System.out.println(acc.printInfo());
            break;
        
        }
        
            }
            else{
                 System.out.println(" not found your account .");
            }
     }
     }
     else if(h==2){
        System.out.println("please enter tybe your account to you want :");
        String t =in.next();
        System.out.println("please enter name your account to you want:");
         String o =in.next();
        System.out.println("please enter number your account :");
        int n =in.nextInt();
        System.out.println("please enter your balanse in the account :");
        int b =in.nextInt();
        System.out.println("please enter password your account to you want :");
        in.nextLine();
        String p =in.nextLine();
        Account s1;
        if(t.equals("normal")){
             s1 =new Account(t,o,n,b,p);
        allAcc.add(s1);
        System.out.println("congratulation you complete Account .");
        }
        else{
            System.out.println("please enter the intersRate : ");
            double r=in.nextDouble();
            s1 = new Savings(t,o,n,b,p,r);
            ((Savings)s1).addInstert(r);
            allAcc.add(s1);
            System.out.println("congratulation you complete Account .");
        }
        }
   
     else{
         System.out.println("Thank you .");
         return;
             }
     }
      }
}

