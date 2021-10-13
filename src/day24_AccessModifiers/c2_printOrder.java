
package day24_AccessModifiers;

public class c2_printOrder {

    public c2_printOrder(){                            // 4.RUN EDECEK:CONSTRUCTOR
        System.out.println("Default constructor: 4.LINE");
    }

    public static void main(String[] args) {
        System.out.println("Main method started: 2. LINE");  // 2.RUN EDECEK

        //we are creating object TO RUN PRINTORDER
        c2_printOrder obj1=new c2_printOrder();
        //this will trigger instance block and it also calls your constructor
        methodStatic();
        obj1.instanceMethod();


    }
                                             //1. STATIC RUN EDECEK!!!!!!!!
    static {                                 // static blogu main'in icinde atmana gerek yok, static bu sekilde de run eder
        System.out.println("static block RUNS FIRST: 1.LINE");    //zaten statigi run edebilecegin bir ismi de yok, buradan aklinda kalsin
    }

    { //this is instance block
        System.out.println(".....instance block RUNS AFTER MAIN METHOD;3.LINE");  // 3.RUN EDECEK
    }

    public static void methodStatic(){          // 5.RUN EDECEK
        System.out.println("Static MEthod:5.LINE");
    }

    public void instanceMethod(){                 //6. RUN EDECEK

        System.out.println("instance method: 6.LINE");
    }
}
          // .............. WHO RUN FIRST??????? .............

//1.EVERYTIME static block will run firstly and just once
//2.main method will run in order of line that passed

//3-each new object will run instance block and constructor together: c2_printOrder obj1=new c2_printOrder();
//4-ama ilk olarak instance block , daha sonra  constructor execute olur

/*
1.STATIC BLOCK (METHOD DEGIL DIKKAT ET)
2-MAIN METHOD
3-INSTANCE BLOCK
4-CONSTRUCTOR
5- KALAN KISIM DA (STATIC VEYA INSTANCE 'METHOD')FARKETMEKSIZIN MAIN METHOD'DAKI SIRAYA GORE ISLER.
 */