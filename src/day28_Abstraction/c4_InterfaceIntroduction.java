package day28_Abstraction;

public interface c4_InterfaceIntroduction  {

    //interface class'ini olustururken yan tarafta class yerine interface olani seciyorsun boylelikle onun sign'i cikiyor yanda
// interface'in kullanimi cok yaygin degil ama gene de ogreniyoruz


    //            there is only one access modifier allowed in interface ==> public

    // you can implement inheritance in the interfaces by using implements keyword (instead of extend)
    // you can implement multiple interfaces

    //what is differences between abstract class and interface *******interview question
    //A class can inherit from one class only (extends)
    //A class can inherit multiple interfaces (implements)

    //what we can have in interface?
    //variable: static & final by default
    //bir sey soylemezsen default olarak static ve final'i alir

    //!!!!!!!methods: abstract methods, static methods, default method
    //sadece instance kabul etmez hem method hem varible'da

//    what we cannot have in interface?
    //interface'de kullanilmayanlar!!!!!!!!!!!!!!!!

//    constructor
//    instance variable
//    instance methods
//    blocks

    // if you dont have constructor, can we create object from interfaces???
    //NOOO, object only can create from class..

    //void method1(){} we cant have instance method in interface

    //class 5'de neden sadece bunlardan 3,4,5 aldi cunku onlar abstrsact ve body'si yok

    default  void method1(){}  //method olarak default instance kullandik, bu olur
    static void method2(){}

    public abstract void method3();  // public abstract, //bu zaten abstract oldugundan extradan belirtmeye gerek kalmadi
    // o yuzden p8blic abstract silik yaziyor

    // abstract method doesnt have a body, bu yuzden bunlarin absratct oldugunu anladik
    abstract void method4(); // public abstract
    void method5();// public abstract  //   there is only one access modifier allowed in interface ==> public
    // bu yuzden public sayiyoruz onlari



    /*
    niye interface kullaniriz????

    to achive total abstraction
    java doesnt support mulltiple inheritance of class, but using interface we can achive multiple inheritance
    interface are used to implement abstruction.
    abctruct'i kullanamk icin neden interface'e ihtiyacimiz var????
    cunku abstruct'da final variable yok, kullanmak icin onu kullaniriz gibi

     we can only call interface class from regular and abstract class using implements keyword..
     but we can not  use implements class in 2 interface classes. also we can use extends keyword in 2 interface classes.
     we cant extend from interface to abstract
     //AYRICA, EGER REGULAR OR ABSTRUCT CLASS'DAN INTERFACE CAGIRACAKSAN SADECE IMPLEMENTS KULLANABILIRSIN EXTEND OLMAZ



         */



}