/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banksystem;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Mahmoud Hussein
 */
public class BankSystem {

    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
     ArrayList<Account>allAcc=new ArrayList<>();
          int n=232;
      while(true){
     System.out.println("please enter :\n"+
             " 1 _ log in :\n"+
             " 2 _ new account :\n"+
             " 3 _ Exit :\n"
     );
     int h =in.nextInt();
     if(h==1){
          System.out.println("please enter number your account :");
        int nu =in.nextInt();
         System.out.println("please enter password your account to you want :");
        in.nextLine();
        String p =in.nextLine();
         boolean foundAcc=false;
        for(Account acc:allAcc){
            // Search for the account in the list using account number and password (Linear Search).
            if(acc.getNumber()==nu&&acc.getPass().equals(p)){
                  boolean bool=true;
                 while(bool){
                System.out.println("please enter :\n\n"+
        " 1: change name\n\n"+
        " 2: view name\n\n"+
        " 3: change password\n\n"+
        " 4:to debosit \n\n"+
        " 5:to withdraw \n\n"+
                     " 6:to transfer \n\n"+
        " 7: information account\n\n"+
                     " 8: exit to main screen.\n\n");
        int num =in.nextInt();
        int now;
        String text;
        switch(num){
            case 1:
            System.out.println("pleas enter new owner name :");
            in.nextLine();
            text=in.nextLine();
            acc.setName(text);
            break;
            case 2:
            System.out.println(" name owner you account is :"+acc.getName());
            break;
            case 3:
            System.out.println("pleas enter old password :");
            String ol =in.next();
            if(acc.getPass().equals(ol)){
                boolean v=true;
                while(v){
            System.out.println("pleas enter new password :");
            text =in.next();
                    if(acc.getPass().equals(text)||text.trim().length()<6){
                        // Data Validation: Prevents empty passwords or those containing only spaces.
                        System.out.println("password must be bigger than 6 leters and not equal old pass word ");
                    }
                    else{
            System.out.println("pleas confirm password :");
            String txt =in.next();
            if(text.equals(txt)){
            acc.setPass(text);
            }
                else System.out.println(" Try again .");
                    v=false;
                    }
                }
                }
            else{
                System.out.println("try again, incorrect password .");
            }
            break;
             case 4:
            System.out.println("pleas enter ammount you want deposit in your balance :");
            now =in.nextInt();
            acc.deposit(now);
            break;
            case 5:
            System.out.println("pleas enter ammount you want withdraw into your balance :");
            now =in.nextInt();
            acc.withdraw(now);
            break;
             case 6:
            // Transfer logic: ensures target exists and is not the sender's own account.
            System.out.println("pleas enter number the target :");
            int numberTarget=in.nextInt();
            if(numberTarget!=acc.getNumber()){
            boolean found =false;
             for(Account target:allAcc){
            if(target.getNumber()==numberTarget){
                System.out.println("do you want transfer to "+target.getName()+"\n"+
                " 1 _ Yes \n"+
                " 2 _ No \n");
                int confirm=in.nextInt();
                if (confirm==1){
                    System.out.println("pleas enter ammount you want transfer to "+target.getName()+"\n");
            int amount =in.nextInt();
            if(acc.withdraw(amount)){
                    target.deposit(amount);
            }
                }
                else{
                    System.out.println("try again");
                }
                found=true;
                     break;
            }
             }
            if(!found){
                     System.out.println("number the target is not found ");
                 }
            break;
            }
            else{
                System.out.println("cannot be transfer to yourself ");
                break;
            }
            case 7:
            System.out.println(acc.printInfo());
            break;
            case 8:
            bool=false;
            break;
            default :
            System.out.println("choose from the list numbers ");
            break;
        }
                 }
                foundAcc=true;
                break;
            }
        }
            
            if(!foundAcc){
                 System.out.println(" not found your account .");
            }
     }
     else if(h==2){
         // Account Factory: Handles creation of either Normal or Savings accounts based on user input.
         String t="normal";
        System.out.println(" tybe your account to you want please enter either 1 or 2:\n"+
         "  1 _ normal"+
         "  2 _ Savings");
          int typ=in.nextInt();
          if(typ==1){
        t="normal";
          }
              else if(typ==2){
                  t="Savings";
              }
              else{
                  System.out.println("pleas enter either 1 or 2 :");
              }
          String o =null;
          boolean k=true;
          while(k){
        System.out.println("please enter name your account to you want:");
          in.nextLine();
          String i=in.nextLine();
          if(i.trim().length()<6){
              System.out.println("name must be bigger than 6 letters ");
          }
          else{
              o=i;
              k=false;
          }
          }
        System.out.println("number your account is :"+n+"\n");
          boolean g=true;
          int b=0;
          while(g){
        System.out.println("please enter your balanse in the account :");
          int w=in.nextInt();
          if(w>=0){
        b = w;
              g=false;
          }
          else{
              System.out.println("balance must be bigger or equal zero ");
          }
          }
        System.out.println("please enter password your account to you want :");
        in.nextLine();
        String p =in.nextLine();
        Account s1;
        if(t.equals("normal")){
             s1 =new Account(t,o,n,b,p);
        allAcc.add(s1);
        System.out.println("congratulation you complete Account .");
            n++;
        }
        else{
            System.out.println("please enter the intersRate : ");
            double r=in.nextDouble();
            s1 = new Savings(t,o,n,b,p,r);
            ((Savings)s1).addInterest();
            allAcc.add(s1);
            System.out.println("congratulation you complete Account .");
            n++;
        }
        }
   
     else{
         System.out.println("Thank you .");
         return;
             }
     }
      }
}
