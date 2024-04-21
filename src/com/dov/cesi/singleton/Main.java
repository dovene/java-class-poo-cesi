package com.dov.cesi.singleton;

public class Main {
     public static void main(String[] args) {
         BankAccount bankAccountUn = new BankAccount(123, 0.0);
         BankAccount bankAccountDeux = new BankAccount(321, 0.0);
         bankAccountUn.deposit(100.0);
         bankAccountUn.withdraw(80);
         bankAccountDeux.deposit(200.0);
         bankAccountDeux.withdraw(110);
         System.out.println(DailyLogs.getInstance().getLog());
    }
}
