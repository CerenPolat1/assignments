package day28_Abstraction.Phonee;

public class PhoneeObject {

    public static void main(String[] args) {

       Iphone ob=new Iphone("11pro",1.2,1500);
       ob.calling();
       ob.texting();
       ob.toString();

        Iphone obj1=new Iphone("1 Pro",2,1200.0);
        Iphone obj2=new Iphone("2 Pro",2.2,1300);
        Iphone obj3=new Iphone("3 Pro",3.3,1400);
        Iphone obj4=new Iphone("4 Pro",4.4,1500);
        Iphone obj5=new Iphone("5 Pro",5.5,1600);

        System.out.println("+++++++++++++++++++++++++++++++");

        Samsung bj=new Samsung("AB2",1.3, 1300);
        bj.calling();
        bj.texting();
        bj.toString();


        Samsung bj1= new Samsung("1a",1.8,1500);
        Samsung bj2= new Samsung("2a",2.8,1600);
        Samsung bj3= new Samsung("3a",3.8,1700);
        Samsung bj4= new Samsung("4a",4.8,1800);
        Samsung bj5= new Samsung("5a",5.8,1900);

        //ayrica bunlari su sekilde de yazabilirsin: 5 tane object yaratmak yerine, altarnatif
        System.out.println(bj1.price);
        System.out.println(bj1.size);



    }
}
//
//        The brand is Iphone
//        11pro provides large screen and it's size: 1.2, and it's price: 1500.0
//        Iphone provides calling.
//        Iphone provides texting.
//        1 Pro provides large screen and it's size: 2.0, and it's price: 1200.0
//        2 Pro provides large screen and it's size: 2.2, and it's price: 1300.0
//        3 Pro provides large screen and it's size: 3.3, and it's price: 1400.0
//        4 Pro provides large screen and it's size: 4.4, and it's price: 1500.0
//        5 Pro provides large screen and it's size: 5.5, and it's price: 1600.0
//        +++++++++++++++++++++++++++++++
//        The brand is Samsung
//        AB2 provides large screen and it's size: 1.3, and it's price: 1300.0
//        Samsung provides calling.
//        Samsung provides texting.
//        1a provides large screen and it's size: 1.8, and it's price: 1500.0
//        2a provides large screen and it's size: 2.8, and it's price: 1600.0
//        3a provides large screen and it's size: 3.8, and it's price: 1700.0
//        4a provides large screen and it's size: 4.8, and it's price: 1800.0
//        5a provides large screen and it's size: 5.8, and it's price: 1900.0
//
//        Process finished with exit code 0


