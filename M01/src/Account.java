

import java.util.Date;

public class Account {
    // private int named id for account (default 0)
    // private double named balance for account (default 0)
    // private double named annualInterestRate for current interest (default 0)
    // private Date named dateCreated for creation
     private int id;
     private double balance;
     private double annualInterestRate;
     private Date dateCreated;
    // no-arg constructor for default account
     Account(){
         id = 0;
         balance = 0;
         annualInterestRate = 0;
         dateCreated = new Date();
     }
    // constructor w/ specified id and initial balance
     Account(int newId, double newBalance){
         id = newId;
         balance = newBalance;
         dateCreated = new Date();
     }
    // accessor and mutator for: id, balance, annualInterestRate
     void setId(int newId){
         id = newId;
     }
     int getId(){
         return id;
     }
     void setBalance(double newBalance){
         balance = newBalance;
     }
     double getBalance(){
         return balance;
     }
     void setAnnualInterestRate(double newAnnualInterestRate){
         annualInterestRate = newAnnualInterestRate;
     }
     double getAnnualInterestRate(){
         return annualInterestRate;
     }
    // accessor for dateCreated
     Date getDateCreated(){
         return dateCreated;
     }
    // method getMonthlyInterestRate returns monthly rate
     double getMonthlyInterestRate(){
         return ((annualInterestRate/100)/12);
     }
    // method getMonthlyInterest returns monthly interest
     double getMonthlyInterest(){
         return balance * getMonthlyInterestRate();
     }
    // method withdraw removes from balance
     void withdraw(double withdrawalAmount) {
         balance = balance - withdrawalAmount;
     }
    // method deposit deposits amount to balance
     void deposit(double depositAmount){
         balance = balance + depositAmount;
     }
    // test program id = 1122, balance = 20000, annualInterestRate = 4.5
    // withdraw 2500, depost 3000, print balance/monthly interest/date
    public static void main(String[] args){
         Account testAccount = new Account(1122,20000);
         testAccount.setAnnualInterestRate(4.5);
         testAccount.withdraw(2500);
         testAccount.deposit(3000);
         System.out.println("Balance: "+testAccount.balance);
         System.out.println("Monthly Interest: "+testAccount.getMonthlyInterest());
         System.out.println("Date Created: "+testAccount.dateCreated);
    }




}
