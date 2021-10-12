package day23_Constroctors;

import java.util.ArrayList;

public class phone {


    //        create a class called phone:
//                attributes: brand, model, price, country
//                methods: call, text,  toString


    String brand;
    String model;
    String country;
    double price;

    public void call(String brand, String model,String country ){
        this.brand=brand;
        this.model=model;
        this.country=country;

        System.out.println("Young people likes call each other using "+ brand+ " / "+ model+ " in " + country);
    }

    public void text (double price){

        this.price=price;

        System.out.println(" Young people like preferring to use text instead of call. It is cheaper: only $ "+ price + " per each text");
    }

    public String toString(){
        return brand+ "-"+model+ "-"+country;
    }

    public static void main(String[] args) {

        phone using= new phone ();

        using.call("Apple","Iphone","Canada");
        using.text(1.00);

        ArrayList<phone> gadget= new ArrayList<>();
        gadget.add(using);
        System.out.println(gadget);
    }

//    Young people likes call each other using Apple / Iphone in Canada
//    Young people like preferring to use text instead of call. It is cheaper: only $ 1.0 per each text
//    [Apple-Iphone-Canada]
//
//    Process finished with exit code 0

}
