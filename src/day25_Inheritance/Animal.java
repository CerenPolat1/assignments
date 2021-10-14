
package day25_Inheritance;
/*
Inheritance is an important pillar (sutun) of OOP(Object-Oriented Programming).
It is the mechanism in java by which one class is allowed to inherit the features(fields and methods)
of another class.

Important terminology:

1-Super Class: //parent//base class//superclass
The class whose features are inherited is known as superclass(or a base class or a parent class).

2-Sub Class:
The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class).
The subclass can add its own fields and methods in addition to the superclass fields and methods.

3-Reusability:
 Inheritance supports the concept of “reusability”, i.e. when we want to create a new class
 and there is already a class that includes some of the code that we want, we can derive our new class
 from the existing class. By doing this, we are reusing the fields and methods of the existing class.
How to use inheritance in Java
The keyword used for inheritance is extends.
 */


/*

diyelim senin bir ana konun var mesela animals, ve sub claslarin vaf bird, cat, dog gibi, bunlarin hayvan olarak ortak ozellikleri var
bu ortak ozellikleri her seferinde tek tek yazmak yerine inharitance olusturuyoruz.
 */
//commen features
//age
//name
//weight
//color ,size ,type

//eat
//move
//grow

public class Animal {

    public String name;
    public int age;
    public double weight;
    public String color;

    //alttaki methodlari niye olusturduk. cunku tum hayvanlar icin ortak ozeelik icerir

    public void eat(String food){
        System.out.println(name + " is eating " + food );
    }

    public void move(){
        System.out.println(name + " is moving");
    }

    public void grow(){
        System.out.println(name + " is growing ");
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                "-- age=" + age +
                "-- weight=" + weight +
                "-- color='" + color + '\'' +
                '}';
    }
}