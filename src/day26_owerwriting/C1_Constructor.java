
package day26_owerwriting;


class test {     //extended'in ardindan bu class parent hale geldi, ve ilk bu run edecek daha sonra digerleri

    //access modifier + classname
    public test(){
        System.out.println("Test");
    }

}

public class C1_Constructor extends test{  // contsructor chain olusturuldu, o yuzden ic ice bir suru var
    //since we extend test class
    //everything inside test will be inherited
    //inherite test constructor  == public test ()

    public C1_Constructor(){
        System.out.println("C1 constructor");
    }

    public C1_Constructor(String str){
        this();
        System.out.println("c1 string constr");
    }

    public static void main(String[] args) {
        //test obj1=new test();  //gidip test yazisini alir, daha sonra ici bos olan constructordan "c1 constructor'i ceker
        // daha sonra "c1 string constr" yazar niye, cunku bu bi oncekiyle chain

        // !!!!constructor method will get executed, if we create object
       // eger object yaratmazsan run etmeyecek

        C1_Constructor obj2=new C1_Constructor(); //sen bunun icine "Hello" yazarsan String str'i alir cunku o da String
        //since c1_constr takes test class as a parent, o yuzden ilk test run etti.
        //constructor of test also will be inherited

        //new C1_Constructor(), bu haliyle defatult constructori alir cunku ici bos
    }

}