package day28_Abstraction;

abstract  class  abstractClass1{
    public abstract void abstractMethod1(); //no body,  needs it to be overridden

    public void method2(){
        System.out.println("method 2");
    }

}

public class c3_AbstractionPractice extends abstractClass1{  //abstractClass1'deki abstract'i override yapmazsan error verecek
    //extands  will do inheritence logic
    //which means it will extend
    //abstrmethod1 and method2

    @Override
    public void abstractMethod1(){
        System.out.println( " abstract method in abstract practice class");
    }
}

abstract class abstractClass2 extends  abstractClass1 {
    //acbrtacta, farkli methodlar da  kullanailirsin
    //abstrac classes can have regular method and abstract method
    //exteded abstract method and method2

    //public abstract void abstractMethod1();
    //public void method2(){body}

    abstract void abstractMethod3();
}

class class3 extends abstractClass2{
    //normal methodlarda abstract kullanilmaz, sadece abstractta absract kullanilir

    //you cant have abstract methods in regular class
    //that is why extended abstract are need be overriding

    //below methods will be inherited
    //abstractMethod3();  // needs to be overriden
    //abstractMethod1();  // needs to be overriden
    //method2(){body}  // no need to override because it has body (its not abstract method )

    @Override
    public void abstractMethod1(){ //overriding yaparak abstracti kullaniyorsun boylece body olusturmuyorsun parentdakini cekiyorsun zaten

    }
    @Override   //
    public void abstractMethod3(){

    }


///// normal class'larda abstract kullanilmaz, kullanmak  icin orverriding yapmak gerekir


}