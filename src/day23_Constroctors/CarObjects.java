package day23_Constroctors;

public class CarObjects {

    public static void main(String[] args) {

        //Car obj1=new Car();
        //without having any constructor i can still create an object from class
        //beacuse java will have default one

        Car obj2= new Car("bmw" ,2002,1250.5 ,"yellow"); // you dont need anymore set method, we already created like this
                                                                                //zaten construction'in kolayligi da burada
/*
        constructor overloading is saving us from creating method to set information for variables
        when we load constructor we wanna set those variables in the creation of object
        it only creates constructor when you create a new object
        because you are using class name when you create an object
        it is kinda default option
        think it like numbers when we create numbers java decides int as default
        unless we say its a long number
        same logic applies here
        it is default action but you can modify it or change it
        hoe shoe1=new Shoe();
        in this line new Shoe(); is actually your constructor
        it helps you to create objects as well
        or same thing goes for int [] or ArraysList
        it has to match with your class name so that you can use load it
        if names are different java won't recognize your constructor therefore you wont see it

*/



        System.out.println(obj2);
        System.out.println("obj2.getBrandYear() = " + obj2.getBrandYear());

        Car obj3=new Car("toyota",2020);
        System.out.println("obj3.getBrandYear() = " + obj3.getBrandYear());

        System.out.println("obj3 = " + obj3);
    }
}