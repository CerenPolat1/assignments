
package day28_Abstraction;

interface test1 extends test2{    //bu interface'le baslayanlarin hepsi birer interface, interface'e class denmez
    void method1(); // public abstract //neden cunku interface sadece public kullandigindzn public varsayar
}
interface test2 {
    abstract int method2(); // public abstract
}
interface test3          {
    public abstract void method3(); // public abstract
}

// iki interface class implements olmuyor ama  iki interface class extends oluyor ***********

public class c6_abstractionPractice2 implements test1,test2,test3{  //main class can implement many interfaces
                                                //buraya sadece interface olanlar yazilbilir

    //it will inherite all the methods from test 1 ,test3 ,test 3

    //below method will be inherited from parent classes
    //alttakiler abstract oldugu icin overriding oldu cunku onlarda body yoktu
    //met1 ,met2 ,met3
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 5;
    }

    @Override
    public void method3() {

    }
}

class test4{

}

class test5 extends  test4 { // class only exdends one class

}

//class test6 extends  test5 , test4{  //sadece bir tane class extend yapilir abstracta
//
//}


//differences between abstract class and interface
//A class can inherit from one class only (extends)
// o yuzden, public class c6_abstractionPractice2 /exdend/ test1,test2,test3 bunun icine test5 yazilmaz

//A class can inherit multiple interfaces (implements)



