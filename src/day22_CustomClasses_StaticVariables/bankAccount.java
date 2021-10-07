package day22_CustomClasses_StaticVariables;

public class bankAccount {

//    practice task:
//    create a custom class for bank account
//    attrubutes: accountHolder(String), accountNumber(long), balance(double)
//    actions: totalBalance(), withDraw( amount ), deposit( amount )
//    toString()

      /*
    create a class called bankAccountObject to call BankAccount methods,variables.
    Ex : if i deposit 50 dollars my balance should increase 50 dollars
   : if i withdraw 100 dollars my balance should decrease for 100 dollars
   : to check the balance use totalBalance method
  */


String accountholder;
long accountNumber;
double balance;
double amount;


public void customer(String accountholder, long accountNumber){

    this.accountholder=accountholder;
    this.accountNumber=accountNumber;

    System.out.println("Customer: "+ accountholder+ " , accountNumber: "+accountNumber);
}

public void totalBalance (double balance){    // if there is no static method, you dont need to create object for instance

    this.balance=balance;
    System.out.println(accountholder+ "'s total balance: " + balance );

}

 public void  withDrawal (double amount){

    this.amount=amount;

    balance-=amount;

     System.out.println("New balance after withdraw:"+balance);
 }

public void deposit (double amount){

    this.amount=amount;
    balance+=amount;

    System.out.println("after deposit , current balance:"+ balance);
}

    public String tostring(){

    return accountholder + " - " + balance + " - " + amount;
    }

    public static void main(String[] args) {
        bankAccount info=new bankAccount();

        info.customer("Ceren Polat", 12345678);
        info.totalBalance(1500);

        info.withDrawal(100);
        System.out.println("current balance:" + info.balance);

        info.deposit(50);
        System.out.println(info.balance);


    }

}

//        Customer: Ceren Polat , accountNumber: 12345678
//        Ceren Polat's total balance: 1500.0
//        New balance after withdraw:1400.0
//        current balance:1400.0
//        after deposit , current balance:1450.0
//        1450.0
//
//        Process finished with exit code 0