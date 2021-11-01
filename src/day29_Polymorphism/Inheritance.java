package day29_Polymorphism;

public class Inheritance {

    // //oop questions

    //
    //    //1.explain what is it .. one of the OOP concept that helps you to create connection between parent and child class
    //and inherit all the methods adn variables parent to child

    //    //2.explain how you achive   -- with extends keyword, child class use extends keyword to get all thing from parent

    //    //3.where you are using in your project -- in selenium we will have base classes that extends subclasses..
    //you are using base class to have some common methods

    //why oop?????????????

    //Reusability
    //flexible
    //easy to update  --- easy to maintain our code, chance something from parent.. it is easy to do it.
    //memory -- it will reduce memory
    //easy to read and remember functions that you created


    public double number;
    protected int number2;
    byte number3;

}

class inherTest extends Inheritance{
    //it will inherited all the methods from parent
    public static void main(String[] args) {
        inherTest obj =new inherTest();
        obj.number=100;
        obj.number2=200;
        obj.number3=50;

        System.out.println("obj.number2 = " + obj.number2);
    }
}