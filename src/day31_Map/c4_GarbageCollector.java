
package day31_Map;

public class c4_GarbageCollector {

    //garbage collector,heap memeoryide yer alan pool'da kullanilmayanlari, referans gosterilmeyenleri, cagirilmayanlari siler neden, daha temiz bir hafiza icin
    public static void main(String[] args) throws Throwable {

        String str =new String("Hello"); // this one will be collected from memory by java garbage collector
        str = new String("World");
        //after i removed reference from hello by reassing str to "World"
        //java garbage collacter will remove hello from the memory

        // String str2=new String("Hello");// bu kullanilmadiginda silinecek, ne zaman silinir sure olarak bilmiyoruz ama
        //referans gosterilmediginde mesela bir object;de falan siliniyor

        Integer number=new Integer(123); // will be collected by java garbage collacter
        number = new Integer(10); //bu kalir

        c4_GarbageCollector garbage1=new c4_GarbageCollector(); //object de kullanilmasa bu da silinecek

        new c4_GarbageCollector(); // this will be collected by java garbage collacter
        //java garbage collacter will make java memory more  reausable


        Byte b1=new Byte((byte) 101);// this will be collacted
        b1=null; //bunlar neden silinmiyor cunku bunlar cagrildi ve kullanildi

        c4_GarbageCollector obj2=new c4_GarbageCollector();
        // obj2.finalize();

        //finalize method is called by garbage collacter to sent our object to garbage

 // ********finalize method, collector'u beklemeden garbage gonderir der.

    }
}
//The final keyword can be used with class method and variable. A final class cannot be instantiated,
// a final method cannot be overridden and a final variable cannot be reassigned.
//
//The finally keyword is used to create a block of code that follows a try block.
// A finally block of code always executes, whether or not an exception has occurred.
// Using a finally block allows you to run any cleanup-type statements that you just wish to execute,
// despite what happens within the protected code.
//
//The finalize() method is used just before object is destroyed and can be called just
// prior to object creation.