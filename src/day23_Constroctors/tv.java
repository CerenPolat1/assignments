package day23_Constroctors;

import java.util.ArrayList;

public class tv {


 //              create a class called TV:
//                attributes: brand, model, price, country
//                methods: watch, toString
//

    String brand;
    String model;
    String country;
    double price;

    public void watch( String brand, String model, String country, double price) {

        this.brand=brand;
        this.model=model;
        this.country= country;
        this.price=price;

        System.out.println("People generally watch tv in the evening");
        System.out.println("Especially, "+ brand+ " - "+ model+ " is more preferred that comes from "+ country+ " $ "+ price);
    }

     public String toString(){

        return brand+ " - "+ model+ " - "+price;
     }


    public static void main(String[] args) {

        tv main= new tv();

        main.watch("LG","AWZ","South Korea", 1300);


        ArrayList<tv> list= new ArrayList<>();
        list.add(main);
        System.out.println(list);
    }


}


//    People generally watch tv in the evening
//        Especially, LG - AWZ is more preferred that comes from South Korea $ 1300.0
//        [LG - AWZ - 1300.0]
//
//        Process finished with exit code 0