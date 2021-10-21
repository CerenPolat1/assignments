
package day28_Abstraction;

public abstract class Shape {

    //specifier is :Abstract  (SOYUTLAMA)

    //abstract classes are meant to be inherited
    //can not be final

    //abstract method : those methods wont have body (method kurdugunda {} bunlarin icinde kurdugun her sey senin body'in olur)
    //those methods are meant to be overrwite--cunku body yok anca overriding ile kullanilir
    //those methods can not be final,static or private.--cunku overriding yapiyorsun, overriding sadece instance ile calisir

    //public void method(){body}
    //public abstract void method();

//abstraction is another oop concept in java
    //main idea of abstraction : abstraction is a process of hiding the implementation details(it means hiding body)
    // from the user,
    // only the functionality will be provided to the user.
    // In other words, the user will have the information on what the object does instead of how it does it.

    //2 ways to achive abstraction
    //1.Abstract Class , abstract methods
    //2.Interface

    //task :
    //create an abstract base class call shape which will has method call area,shapeName
    //create child classes called rectangle , square ... that will overwrite method area,shapeName

    //abstract default methods
    abstract void shapeArea();  //abstract methods can not have a body
    abstract void shapeName();  //this abstract methods are meant to be overwritten in the child classes
}
//abstract'daki olay su: user'a detayli bilgileri vermiyorsun.

//to steps to achive abstraction by using abstract class
//create an abstract class and abstract method (to be able to hide implemantation of methods )
//then extend this class to child classes (this is called inheritence)
//override the abstract methods


//encapsulation:hiding data