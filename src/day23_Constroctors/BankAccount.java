package day23_Constroctors;

import java.util.ArrayList;

public class BankAccount {

    //Task BankAccount
//create a class called BankAccount
//       variables:  accountNumber, accountHolder, Balance
//       methods: deposit, showBalance, toString

    int accountNumber;
    String accountHolder;
    int balance;


    public void deposit(int accountNumber, String accountHolder){

        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;

        System.out.println("Customer: "+ accountHolder+ " ,"+ " Account Number: "+ accountNumber);
    }


    public void showBalance (int balance){

        this.balance=balance;
        System.out.println(" Total Balance: "+ balance );
    }

    public String toString(){
        return accountHolder+ "-"+accountNumber+ "- $ "+balance;
    }
    public static void main(String[] args) {
        BankAccount account= new BankAccount();

        account.deposit(12345, " Ayse Fatma Hayriye");
        account.showBalance(1000);

        ArrayList<BankAccount> abc= new ArrayList<>();

        abc.add(account);

        System.out.println(account);

        System.out.println("....................");

        SavingAccount saving= new SavingAccount();

        saving.deposit(12345, "Ahmet Mehmet",1500, 1.5);
        saving.showBalance();

        System.out.println(".......................");

        checkingAccount xyz=new checkingAccount();
        xyz.deposit(123456,"Zeynep",1000);
        xyz.showBalance(1000,50);


    }

static class SavingAccount{

 // create sub class of BankAccount and name it SavingAccount
//       variables: accountNumber, accountHolder, balance, interestRate
//       methods: deposit, showBalance

    int accountNumber;
    String accountHolder;
    int balance;
    double interestRate;

    public void deposit (int accountNumber,String accountHolder,int balance, double interestRate){

        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
        this.interestRate=interestRate;

        System.out.println("Customer: "+ accountHolder+ " - "+ accountNumber+" has "+ interestRate+ " interest rate ");

    }

    public void showBalance(){

        System.out.println("Customer can get lower interest rate with ("+ interestRate+ ")");

    }


    public String toString(){
        return accountHolder+ "-" +accountNumber+ "-"+balance;
    }

}

static class checkingAccount{
 // create sub class of BankAccount and name it checkingAccount
//       variables: accountNumber, accountHolder, balance
//       methods: deposit, withDraw, showBalance


    int accountNumber;
    String accountHolder;
    double balance;
    double withdraw;


    public void deposit(int accountNumber, String accountHolder, double balance){

        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;

        System.out.println("Customer "+ accountHolder+ "-"+accountNumber+ " deposit to her account $50. Therefore, totalBalance "+balance);


    }


    public void withDraw (){

        balance-=withdraw;
        System.out.println("Customer withdrawn $50. Customer's current balance: $1000");
    }


    public void showBalance(int balance, int withdraw){

        balance-=withdraw;
        System.out.println(balance);
    }
}


}

//Customer:  Ayse Fatma Hayriye , Account Number: 12345
//        Total Balance: 1000
//        Ayse Fatma Hayriye-12345- $ 1000
//        ....................
//        Customer: Ahmet Mehmet - 12345 has 1.5 interest rate
//        Customer can get lower interest rate with (1.5)
//        .......................
//        Customer Zeynep-123456 deposit to her account $50. Therefore, totalBalance 1000.0
//        950
//
//        Process finished with exit code 0