package day24_AccessModifiers;

public class EncapsulationIntro {
 /*
     OOP PRINCIPLES : object oriented programing language

   //we have 4 different OOP consept
•Encapsulation :(Data Hiding) •Encapsulation diger bir degisle data hiding'tir  = private
•Inheritance   :
•Abstraction   :
•Polymorhism   :
OOP  will combine group of realated variables and functıonus to unit (unit means = object).
     */

    /*

    //   .... what does encapsulation mean???  what is the encapsulation?? .... inerview questions

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.
Therefore, it is also known as data hiding.

IN MY WORD, ENCAPSULATION means THE VARIABLES OF THE CLASS WILL BE HIDDEN FROM THE OTHER CLASS AND
 THEY CAN BE ACCESS ONLY THROUGH THE METHODS OF THEIR CURRENT CLASS

   -------- To achieve encapsulation in Java −------

1.Declare the variables of a class as private.
2.Provide public setter and getter methods to modify and view the variables values from outside of class.
     */

    //1.to hide data
    private String name;
    private long idNum;
    private int age;
    //nobody will have direct access to above variables

    //as long as all variables are private they will make them not accessable from outside
    //you will need to assign or modify them
    //there should a way to do this


    //2.Provide public setter and getter methods to modify and view the variables values.
    //this is encapsulation
//yani private olani public hale getirebilme ve kullanbilme yolu: set and get

    public void setName(String name){
        this.name=name;   //private'daki name'i cekti // EncapObject'de bunu kullanabildi nasil? object yaratti setName'i kullandi ve yazdi
    }
    public String getName(){   //parantez icine eger string name olusturmazsak, bir daha this. yapmaya gerek kalmaz eslestirilecek bir sey olmaz cunku
        return name;
    }

    public void setIdNum(long idNum){
        this.idNum=idNum;
    }
    public void setAge(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public long getIdNum(){
        return idNum;
    }
}