package day23_Constroctors;

public class ConstractorChaining {

    /*
    Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
Constructor chaining can be done in two ways:

1-Within same class: It can be done using ----this()---- keyword for constructors in same class
2-From base class: by using --super()-- keyword to call constructor from the base class.-- we will see this later

Why do we need constructor chaining ?
This process is used when we want to perform multiple tasks in a single constructor
rather than creating a code for each task in a single constructor we create a separate constructor for each task
and make their chain which makes the program more readable.
     */

    // what is OOP concept in java?? search it /////  !!!!!!!!!!!interview question!!!!!!!

    //Constructor chaining can be achieved in any order.


    //to be able to create constructor
    //we need to pass an access modifier and classname

    public ConstractorChaining(){        //this is default constructor,   //defaulta this () konmaz kuraldir.cunstructur chande en az bi tanesi this ()siz kullanilir
        System.out.println("Default const....");
        method1();

    }
    //Within same class: It can be done using this() keyword for constructors in same class


    public ConstractorChaining(int a){
        //this();
        // this(10); you cant call same constructor in same constructor,
        //it will make infinitive loop
        //eger this () in icine int deger yazaydin 10 gibi loop gibi infinitive olurdu surekli onu islerdi bunu istemiyouz
        //cunku this() ConstractorChaining' i calistirir ve sadece onu cagirir, 10 defa onu dondurecek gibi dusun,


        this("hi");                                ////chain method icinde sadece 1 kere this() kullanabiliyorsun,ayrica sadece methodun hemen altinda kullanabiliyorsun
                                                    // ve chainin ana methoduyla baglanti kurmus oluyor
        System.out.println("int constr");
        method2();

        //this(); keyword has to be at the first line of body
    }

    public ConstractorChaining(String str){
        this();
        System.out.println("String const.......");
    }

    public void method1(){
        System.out.println("Method1......");
    }

    public static void method2(){
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        //ConstractorChaining obj1=new ConstractorChaining(10);
        ConstractorChaining obj1=new ConstractorChaining("java");
    }
}


//code sonunda sadece this() olanlar calisti cunku birbirine this () ile baglilar,, mainin icine yazmana gerek yok zaten object yarattigin icin calisacak o

///to be able to call constructor you will need to use this() , this(10) , this("hello) etc
//chainleri birbirine this() ile bagliyorsun

//you can only call one costructor from another one
//methodun icine 1'den fazla this() koyamiyorsun

//this ( ) keyword has to be first line in your constructor
//sadece methodun hemen altina yazabilirsin baska yere yazarsan eror verir

// //this: refers to object instances
//        //this.: instances of the object
//        //this(): used for calling constructors within current class