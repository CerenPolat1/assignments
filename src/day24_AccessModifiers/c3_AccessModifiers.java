package day24_AccessModifiers;

public class c3_AccessModifiers {

    //			Access modifiers sunlar oluyor: 1- public, 2-protected, 3-default, 4-private
    // access modifiers explain your access level to the variable ,method or class

    //Private: The access level of a private modifier is only within the class.  //SADECE ICINDE BUKUNDUGU CLASS'I KAPSAR
    //private her seyi private yapar sadece class icindedir
    // It cannot be accessed from outside the class.

    //Default: The access level of a default modifier is only within the package. //SADECE PACKAGE'I KAPSAR
    // It cannot be accessed from outside the package.
    // If you do not specify any access level, it will be the default.
    // ayni package, different class

    //Protected: The access level of a protected modifier is within the package     ////SADECE PACKAGE'I KAPSAR
    // and outside the package through child class.
    // If you do not make the child class, it cannot be accessed from outside the package.
    //ayni package different class ama cagirabilmek icin child claslar olmali--protected=child class


    //Public: The access level of a public modifier is everywhere.
    //public olmasi demek  her yerden erisimin olmasi demek
    // It can be accessed from within the class, outside the class, within the package and outside the package.

    //variables

    public int publicVariable=10; // public instance variable  //STATIC OR INSTANCE  DONT SPECIFY YOUR ACCESS LEVEL O YUZDEN INSTANCE VEYA STATIC KULLANABILIRSIN
                                                                //BURADA ONEMLI OLAN ACCESS MODIFIER YANI PUBLIC MI PRIVATE MI FALAN

    private int priavteVariable=25;
    int defaultVrble=35;  //EGER HERHANGI BIR SEY BELIRTMEDIYSEN ONU DEFAULT OLARAK ALIR INT'IN ONUNDE ACCESS MODIFIER YOK
    protected  int protectedVariable=5;

    public static void main(String[] args) {

        //to be able to call instance variable create an object
        c3_AccessModifiers obj1=new c3_AccessModifiers();
        //object create with java defAult constructor


        //we are in the same class that we created objects
        System.out.println("obj1.publicVariable = " + obj1.publicVariable);
        System.out.println("obj1.defaultVrble = " + obj1.defaultVrble);
        System.out.println("obj1.protectedVariable = " + obj1.protectedVariable);
        System.out.println("obj1.priavteVariable = " + obj1.priavteVariable); //nasil yazabildik cunku hala ayni class'dayiz baska classdan cagiramazsin
    }

}