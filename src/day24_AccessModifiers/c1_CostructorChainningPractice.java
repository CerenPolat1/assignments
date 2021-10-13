
package day24_AccessModifiers;

public class c1_CostructorChainningPractice {

    //
//    constructor calls:(chainning) by using this() keyword
//            1. only constructor can call other constructor
//            2. constructor cannot be called by its name,  this() is used for calling
//            3. constructor call needs to be at the first step
//            4. One constructor can only call one constructor
//            5. Contructor cannot call itself or contain itself

    //creating constructor
    //what we need?
    //1- access modifier and  2- class name

    public c1_CostructorChainningPractice(){  // parantez ici bos oldugunda default oluyor
        //            2. constructor cannot be called by its name,  this() is used for calling
        // c1_CostructorChainningPractice("hello");  // bu sekilde run etmez, normalde boyle yapiyoduk method'larda ama bu, izin vermez

        this("hello");
        System.out.println("Default Constructor"); //ana olan
    }


    // tekrar public c1_CostructorChainningPractice() yaratamazsin cunku java sadece bir tane default kabul eder, 2.ye izin vermez error verir





    public c1_CostructorChainningPractice(String str){
        this(10,10);
        System.out.println("str = " + str);
        System.out.println("constr with String");
        // 3. constructor call needs to be at the first step
        //this(10,10);

    }

    public c1_CostructorChainningPractice(int num,int num2){
        // 4. One constructor can only call one constructor
        this(true,10.5);
        System.out.println("num = " + num);
        // this();
        System.out.println("int const");
    }

    public c1_CostructorChainningPractice(boolean b ,double d){
        //this("hello");
        ////            5. Contructor cannot call itself or conatin itself
        // this(true,5.5); boyle yaparsan direkt kendini cagirmis olur bu da kabul edilmiyor

        System.out.println("constr with double and boolean ");
    }


// bu Costructor'lari run etmek icin tek yapman gereken object olusturmak o kadar, tekrar mainin icinde println'a gerek yok
//daha once diger constructor'la eslesmis olani tekrardan semeye kalkarsan error verir
// yani her bir constructor sadece bir kere call edilir


    /// ...............constructor nasil calisir???????.............

    /*
    1-oncelikle constructor'in calismasi icin main methodun icinde olmali
    2- daha sonra onlara object olusturmalisin cunku instance variable bunlar
    3-daha sonra hangisini cagirmak istiyorsan objectin icine tikla hangi connstructori gormek istiyorsan var olan degerlere gore gir
    4-sonra run edecek, ama nasil????
    5-alttaki ornegi girdik (10,10) ve nasil oldu da baska bir println run etti????
    6-cunku java objecting icine yazdigimiz degerin oldugu cunstroctora gider :

    public c1_CostructorChainningPractice(int num,int num2){
        // 4. One constructor can only call one constructor
        this(true,10.5);
        System.out.println("num = " + num);
        // this();
        System.out.println("int const");

    7-daha sonra buradan methodun icindeki this'e gider:  this(true,10.5); ,
    8- bu (this(true,10.5)) parameterin oldugu cunstructor'a gider :

    public c1_CostructorChainningPractice(boolean b ,double d){
        //this("hello");
        // this(true,5.5); boyle yaparsan direkt kendini cagirmis olur bu da kabul edilmiyor

        System.out.println("constr with double and boolean ");

     9- nereden anladik bu constructor'a gidecegini : (boolean b ,double d) , buradan
     10- simdi bunu run edecek, bakti ki icinde run edecek baska bir sey yok sonra kendine geri donecek
     11- simdi kendisinde var olani da run edecek yani sonucumuz soyle olacak:
     run:
     constr with double and boolean
     int const

     12- bu kadar

     */

    public static void main(String[] args) {

        c1_CostructorChainningPractice obj1=new c1_CostructorChainningPractice(10,10);  // bunda da yine classi cagirarak yaratiryorsun objecti

        //yukaridakinin icine nasil variable yazdik? yukarida 2 int'li bir class var ya onu alip yazdi bu kadar

        //we created object from class by using int constructor
        c1_CostructorChainningPractice obj2=new c1_CostructorChainningPractice(true,10.5);


    }
}
