package day26_owerwriting;

//verbal olarak soru gelir interviewde

class test3 {
    int number = 25;

    public test3(int i ){
        System.out.println("i " + i  );
        System.out.println("this.number = " + this.number);
    }
}


public class c3_ConstructorSuper extends test3{  //parent class

    //eger bunu extends yapmasaydik soyle run edecekti:"default c3, sonra da this.number=50, niye?
    // cunku //bu, class test3 instance BLOCK olmadigindan siraya gore once constructor'in run etmesi gerek

    //below methods will be inherited :
    // test3,
    // number comes from parent

    int number=50; // number here for child

    public c3_ConstructorSuper(){  //default constructor
        //yukariyi exdend yaptiktan sonra bu, error verir ve chainin gerigi this-super yazmani ister, istedigin noyu yazabilirsin asagi
        super(100);
        // cunku sen belirtmedikce super'i default sayar, o yuzden super yazdiginda error vermez
        System.out.println("default c3");
        System.out.println("this.number = " + this.number);//50, this, ayni class'dakini alir o yuzden 50'yi aldi.
        System.out.println("super.number = " + super.number); //25 // bu superi boyle kullandik cunku parent icindeki numarayi almak istiyoruz
         //neden sadece "super.number = " + super.number okudu cunku iclerinden biri run edecek sen de hangisi oldugunu seciyorsun
        ///this(), keyword is used for calling in same class, bu yuzden number olarak 50iyı aldı
        //super keyword help us to call from parent bu yuzden 25'i aldı
    }

    //kisaca ayni class icinden chain icin this(), parent classtan cagiracaksan super()

    public static void main(String[] args) {
        c3_ConstructorSuper obj=new c3_ConstructorSuper();
    }
}
// first, create object one of child class
// since you created from child class, parent and constructor will get executed as well