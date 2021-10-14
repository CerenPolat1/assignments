package day25_Inheritance.Assignment2;

import jdk.nashorn.internal.runtime.regexp.joni.constants.internal.StringType;

public class assignment3 {

    /*
task3
 creata a class called device:
                attributes: brand, model, price,  type
                methods: toString

create a class called TV:
                attributes: brand, model, price,Type
                methods: watch, toString
 create ba class called phone:
                attributes: brand, model, price,  type = "Phone"
                methods: call, text,  toString
 */

    String brand;
    String model;
    double price;
    String type;

    public static void main(String[] args) {


        device gadget=new device();
        gadget.set("LG","abc",850.0, "tv");

        System.out.println(gadget);
        System.out.println("...............");

        TV tv= new TV();
        tv.sets("Samsung","kbjgv456",900,"TV");
        tv.watch();
        System.out.println(tv);

        System.out.println(".................");

        phone phn=new phone();
        phn.setof("Apple","Iphone",1350,"cellphone");
        phn.call("Apple", 1.5);
        phn.text();


    }

static class device{
 /*
                creata a class called device:
                attributes: brand, model, price,  type
                methods: toString
  */

    String brand;
    String model;
    double price;
    String type;

    public void set(String brand, String model, double price, String type){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.type=type;

        System.out.println( "Brand: "+brand+ ", model: "+model+ ", price: "+price+ ", type: "+type);

    }

    public String toString(){

        return "Brand: "+brand+ ", model: "+model+ ", price: "+price;

    }
}

static class TV {

    /*
    create a class called TV:
            attributes: brand, model, price,Type
            methods: watch, toString
     */
    String brand;
    String model;
    double price;
    String type;

    public void sets(String brand, String model, double price, String type){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.type=type;

        System.out.println("Brand: " + brand + ", model: " + model + ", price: " + price + ", type: " + type);
    }

    public void watch() {
        System.out.println("People like to watch Tv in the evenings");

    }

    public String toString() {

        return "Brand: " + brand + ", model: " + model + ", price: " + price;


    }
}

static class phone{

        /*
                create ba class called phone:
                attributes: brand, model, price,  type = "Phone"
                methods: call, text,  toString
         */

    String brand;
    String model;
    double price;
    String type;

    public void setof(String brand, String model, double price, String type){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.type=type;
        System.out.println("Brand: " + brand + ", model: " + model + ", price: " + price + ", type: " + type);
    }


    public void call(String type, double price){
        this.type=type;
        this.price=price;

        System.out.println("People use "+type+ " for communication and pay for them at least "+price+ " to call each other.");

    }
     public void text(){

        System.out.println("People also use it sending text");
     }


}


}


//        Brand: LG, model: abc, price: 850.0, type: tv
//        Brand: LG, model: abc, price: 850.0
//        ...............
//        Brand: Samsung, model: kbjgv456, price: 900.0, type: TV
//        People like to watch Tv in the evenings
//        Brand: Samsung, model: kbjgv456, price: 900.0
//        .................
//        Brand: Apple, model: Iphone, price: 1350.0, type: cellphone
//        People use Apple for communication and pay for them at least 1.5 to call each other.
//        People also use it sending text
//
//        Process finished with exit code 0
