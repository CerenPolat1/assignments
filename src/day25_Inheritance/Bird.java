package day25_Inheritance;

public class Bird extends Animal{  // sadece extends +class yaparak  inheritence kullanmis oluyorux

    ///since we use extends keyword to get a parent class for bird class (child class)
    //you will have all variables ,method extended to your bird class

    //below all variables and methods will be inherited from Animal class
    //name
    //age
    //weight
    //color

    //eat()
    //move()
    //grow()
    //toString



    ///fly ........this function iss unique for only birds
    //it is not common for animals so  i will create a method in here for that

    public void fly(){
        System.out.println(name + " is fliying " + color + weight+age);  //extend yaptigimizdan dolayi bu variable'lari burada kullanbildik
    }
}