package day23_Constroctors;

public class Car {


    //if you dont have constructor,  java will have one already  -
    //to give ability to create an object from class

    String brand;
    int year;
    double price;
    String color;

    //to be able to set we were creating a set method
    public Car(String brand , int year){
        this.brand=brand;
        this.year=year;
    }

    public Car(String brand , int year , double price ,String color){      //contructor method
        this.brand=brand;
        this.year=year;
        this.price=price;
        this.color=color;
    }
    //get car brand and year
    public String getBrandYear(){
        return brand+" - " + year;
    }

    @Override  //bu nasil overriding oldu cunku parent;daki tum codelari cek etti ve objecti aldi
    public  String toString(){
        return brand + " / " + year + " / "+ price + " / "+ color;
    }

}