package day28_Abstraction;

public interface c7_InterfacePractice {
    //what we can have in interface?
    //variable: static & final by default
    //methods: abstract methods, static methods, default method

//    what we cannot have in interface?
//    constructor
//    instance variable
//    instance methods
//    blocks

//    public c7_InterfacePractice(){  //  constructor kullanilmaz
//
//    }

    ///{ }

//    public void method1(){  //body yarattigin anda instance methoda donusur o yuzden error verir
//        instance method
//    }

    //    //variable: static & final by default

    int number=100; //final static // final oldugunu nereden anladik cunku sayi atadik sayi atamasaydik bilecekdik ki o instance
    final static int number2=35; // final static

    public static void main(String[] args) {
        System.out.println(number);

//        number = 25 ;  final variables can not be reassigned
        System.out.println(number2);
//        number2=0;  final variables can not be reassigned


    }
//c7_InterfacePractice obj= new c7_InterfacePractice() {
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//}
//    //neden object yaratildiginda error verir cunku interfacede instance veya constructor kullanilmaz.


}