

package day25_Inheritance;

public class c1_BankAccountCapital {


    //create custom class called BankAccount for CapitalOne bank accounts:
    //			public variables:  bankName, firstName, lastName
    //	 		private variables: accountHolder, accountNumber, balance
    //	 		encapsulate all the private data
    //	 		create a constructor that can initialize firstName and fullName
    //
    //	 		action:
    //	 				depositing
    //	 				withdrawing
    //	 				availablebalance
    //	 				toString: returns the full name and balance

    //			public variables:  bankName, firstName, lastName
    public static String bankName="CapitalOne"; //static public
    public String firstName; // instance public
    public String lastName; // instance public


    //	 		private variables: accountHolder, accountNumber, balance
    private String accountHolder;
    private long accountNumber;
    private double balance;


    //	 		create a constructor that can initialize firstName and fullName
    //constructor = access modifier + class name

    public c1_BankAccountCapital(String firstName ,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        //full name = first + last name
        this.accountHolder=firstName + " " + lastName;
    }

    //encapsulate all the private data              // .....bu isleme gerek kalmadi cunku contsructor'da zaten belirttik accountHolder'i
//    public void setAccountHolder(String firstName , String lastName){
//        //since we set account holder name in the constructor no need create setter for accountholder
//        this.accountHolder=firstName + " " + lastName;
//    }
    public String getAccountHolder(){
        return accountHolder;
    }

    // private long accountNumber; encapsulate
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    //private double balance; encapsulate
    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance(){    //normalde asagidaki islemde bunu kullanabilridik ama bu cok readable degil,
                                   // cunku println yok. o yuzden asagiya avaliableBalaance' i olusturduk. kodu kolay okumak icin
        return balance;
    }

    //action:
    //    //	 				depositing
    //    //	 				withdrawing
    //    //	 				availablebalance
    //    //	 				toString: returns the full name and balance

    //if i do deposit my balnce should be increased
    //balance is 100 and if i deposit 50 new balnce will be 150

    public void deposit(double money){     //balance + money olmali, // cunku deposit yaptiginda para yukseleceginden bunu yazdik

        System.out.println("before deposit getBalance() = " + getBalance());
        System.out.println("Depositing "+ money);
        //balance += money   //bunu bu sekilde de yapabilirsin ama  biz balance'i get'e koymustuk ordakini cagiriyoruzzaten setbalanca'da ayarlamistik direkt onu kullandik
        
        setBalance(balance+money);

    }

    //withdraw ve deposit methodlarini sectimgimizde bunlarin icindeki setBalance'lar  harekete gececek.
    public void withdraw(double money){

        System.out.println("before withdraw getBalance() = " + getBalance());
        System.out.println("Withdraw "+ money);
        //balance -=  money
        setBalance(balance-money);
    }

    public void avaliableBalance(){     //kodu kolay okumak icin olusturduk cunku println var yoksa direkt getBalance'i kullanabilirdik
        System.out.println("Available balance is : " + getBalance() );
    }

    //toString: returns the full name and balance
    //toString method helps us to understand what object means for this class

    public String toString(){   // fullname                              //balance
        return "Full name is " + getAccountHolder() + "--- Balance is : " +getBalance();
                                                            //buraya availableBalance da kullanabilirdik ama onda println var
        //                                                  biz de yukari zaten Balance is : " yazdik o yuzden direkt getBalance(); cagirdik
    }

///.................IMPORTANT INFO...............  SHORTCUT GIBI.....
    /*
    METHODLARDAKI SARI YANAN HIGHLIGHT NE ANLAMA GELIYOR? BUNLAR BI YERLERDEN CAGIRILMIS VE KULLANILMIS DEMEK
    AMA BAZEN JAVA HATA YAPIP KULLANMADIGINI KULLANMIS GIBI GOSTEREBILIR MESELA SARI YANAR
    AMA SEN COMMAND'A BASILI TUTUP (VEYA CTRL'YE) METHOD'UN USTUNE GELDIGINDE SANA BILGI VERIR
    HATTA HALA COMMAND'DAYKEN CLICK YAPTIGINDA SANA O METHOFU NERELERDE KULLANDIGINI GOSTERERIR

     */

}