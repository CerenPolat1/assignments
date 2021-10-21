package myMethods;

import day25_Inheritance.ProtectedExample;

public class ProtectedTest extends ProtectedExample {  //ProtectedExample:child class

    // protected int protecNumber;
    //    public int publicNumber;
    //    private int priaveNumber;
    //    int defaultVrble;

    public static void main(String[] args) {
        ProtectedExample obj1 = new ProtectedExample();
        obj1.publicNumber = 10;//everywhere
        // obj1.priaveNumber=20;//extended olup olmasi fark etmez, private ayni isler just works only same class
        obj1.protecNumber = 20;//it uses in same package or if it is extended or if variable is static variable

        //obj1.defaultVrble=40;//only same package



        //yani protected i da extended yaparak kullanabiliyoruz
    }
}