package day22_CustomClasses_StaticVariables;
//Static variables
//
// When a variable is declared as static, then a single copy of variable is created
// and shared among all objects at class level. Static variables are, essentially, global variables.
// All instances of the class share the same static variable.
//
//We can create static variables at class-level only.
//static: class member, can be called through the class
//there is only one copy of static shared by all objects
//
//            prefers to be called through class name
//
//            static ONLY accepts static
//
//
//    static members:
//            1. static variable (global variables)
//            2. static methods
//            3. static initializer block
//            4. static nested class
//

//static variable: declared outside any block with static keyword.
////there is only one copy of static shared by all objects


import myMethods.myLibraryMethods;

//Instance: every single object of the class has its own copy
//instance her zaman class'in disinda olur.
//local variable: variables that are declared in a block
//local de classin icindeki variable'lara denir

//instance variables: declared outside the blocks
//
//
public class c4_staticVaribles {


    int instanceVariable=25; // instance
    int number2=10; //instance

    static int staticVariable=100;//static variable   //static variable: declared outside any block with static keyword.

    public static void main(String[] args) { //static method

       //!!!!!! to be able to use instance variables inside in static method,, we will need to create an object for it

        c4_staticVaribles object1=new c4_staticVaribles();  //OBJECT YARATIYORUZ INSTANCEI KULLANMAK ICINll
        System.out.println(object1.instanceVariable);//25
        System.out.println("////");
        System.out.println(staticVariable); // for static variables since they will have one copy for all objetcs
        //you dont need to create an object to print them
        //staticVariable'da obr=ject yaratmaya gerek yok sadece instance icin yaratiyoruz

        c4_staticVaribles object2=new c4_staticVaribles();
        c4_staticVaribles object3=new c4_staticVaribles();  //reassign

        object2.instanceVariable=250;  //reassign
        object3.instanceVariable=500; //reassign


        //instance variable'da instanceVariable'a atama yaptiginda her birini bireysel alir,
        // her atama yaptiginda eskisini oldugu gibi korur, yenisinine yeni atama yapar
        // ama staticVariable'a atama yapinca hepsini son verdigin deger olarak degistirir


       //instance varible will copy each variable


        object1.staticVariable=55;  //staticVariable'a assign yaptik ve asagidakilerin hepsini 55 aldi bu adim atama yapilana kadar vedam etti
        object2.staticVariable=155;
        object3.staticVariable=555; //suan tum staticVariable'lar 555 oldu hepsini bir kabul eti ve hepsini 555 olarak okudu.

        System.out.println("object1.instanceVariable = " + object1.instanceVariable);
        System.out.println("object2 = " + object2.instanceVariable);
        System.out.println("object23 = " + object3.instanceVariable);

        myLibraryMethods.stars();

        //all  objects will have one copy for static variables
        //all objects will return same result if variable is static

        System.out.println(object1.staticVariable);
        System.out.println(object2.staticVariable);
        System.out.println(object3.staticVariable);


        int number5=222;//local variable

    }


    {        //opening and closing tag oldugunda block olusturabiliyorsun
        //block
    }

//local variable : declared inside of block


                        //DIFFERENCES AND SAME THING IN BOTH  //INTERVIEW QUESTIONS



    //instance variable :declared outside of the blocks
    //instance variable can have multiple copy from object  //her assign yaptiginda degerleri ayri ayri alir
    //they need to be called through object   //OBJECT YARATMAN GEREKIR YOKSA CALISMAZ

    //static variables :declared outside of any block with static keyword
    //static variable can only have one copy from object     ////her assign yaptiginda degerleri ayri ayri almaz, hepsini bir kabul eder
    //they can also be called with classname itself  //OBJECTE GEREK YOK blogun icinde DIREKT CAliSIR




    // instance ve static variable ortak ozeeligi her ikisi de block disinda yani class disinda yazilir
}
//instance variable :declared outside of the blocks
//instance variable can have multiple copy from object  //her assign yaptiginda degerleri ayri ayri alir
//they need to be called through object   //OBJECT YARATMAN GEREKIR YOKSA CALISMAZ

//static variables :declared outside of any block with static keyword
//static variable can only have one copy from object     ////her assign yaptiginda degerleri ayri ayri almaz, hepsini bir kabul eder
//they can also be called with classname itself  //OBJECTE GEREK YOK blogun icinde DIREKT CAliSIR




// instance ve static variable ortak ozeeligi her ikisi de block disinda yani class disinda yazilir
