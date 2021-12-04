package day22_CustomClasses_StaticVariables;


import myMethods.myLibraryMethods;

//When a method is declared with static keyword, it is known as static method.
// The most common example of a static method is main( ) method.As discussed above,
// Any static member can be accessed before any objects of its class are created,
// and without reference to any object.
// Methods declared as static have several restrictions:
//
//They can only directly call other static methods.
//They can only directly access static data.
public class c5_StaticMethod {

    int aInstance =10;  //INSTANCE VARIABLE'DA STATIC KEYWORD YOK AMA ASAGINDAKINDE VAR
    static int bStatic=20; //BUNDA KEYWORD ILE BELIRTMEK GEREKIYOR BU STATIC DIYE

    public static void main(String[] args) {//static method

        //System.out.println(aInstance);  //OBJECT YARATMADAN PRINT YAPAMAZSIN
        // you cant call instance varible in static method without creating object from class

        c5_StaticMethod obj1=new c5_StaticMethod();
        System.out.println("obj1.aInstance = " + obj1.aInstance); //10
        System.out.println("bStatic = " + bStatic);

        //instanceMethod(); we cant call instance method without object
        obj1.instanceMethod(); // BU YUZDEN OBJECT YARATTIK KI instanceMethod() CALISSIN
        staticMethod();


        // !!!!!!!!!!!!!! to be able to call different class static method
        //!!!!!!!!!!!!!!!!you can just call with classname

        myLibraryMethods.stars();

        //!!!!!!!!!!!to be able to call  instance method from different class
        //!!!!!!!!!!!!you will need to create an object
    }

    public void instanceMethod(){       //without static keyword your method will be an instance method
                                        //BU YUZDEN OBJECT YARATMANA GEREK KALMIYOR

        System.out.println("This is instance method");
        System.out.println(aInstance);

        //since method is instance we dont need to create aN object inside this method
        //METHOD ZATEN INSTANCE BIR DAHA OBJECT YARATMAYA GEREK YOK OBJECTI TANIMASI ICIN
        // to be able to call instance variable

        System.out.println(bStatic);//static variables know as global variable SO YOU DONT NEED TO CREATE AN OBJECT
                                    //GLOBAL VARIABLES MEANS THAT YOU CAN USE INSTANCE AND STATIC IN THE SAME CLASS WITHOUT OBJECT
        //they can be used in any method  //MESELA SUAN ICINDE BULUNDUGU CLASS INSTANCE METHOD ICINDE
                                          //YANI STATIC HEPSINI9N ICINDE SORUNSUZ CALISIR

    }

    public static void staticMethod(){
        System.out.println("This is static method");
    }

}