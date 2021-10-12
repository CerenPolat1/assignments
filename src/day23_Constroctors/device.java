package day23_Constroctors;

import java.util.ArrayList;

public class device {

    //  Task Device:
//        create a class called device:
//                attributes: brand, model, price, country
//                methods: toString
//


    String brand;
    String model;
    String country;
    double price;


    public void info(String brand, String model, String country, double price) {


        this.brand = brand;
        this.model = model;
        this.country = country;
        this.price = price;

        System.out.println(brand + " - " + model + " devices come from " + country + " $ " + price);
    }


      public String toString() {
        return brand + " / " + model + " / " + price;
    }


    public static void main(String[] args) {

        device gadget = new device();
        gadget.info("samsung","abc", "turkey", 1500);


        ArrayList<device> list =new ArrayList<>();

        list.add(gadget);
        System.out.println(list);  //  return brand + " / " + model + " / " + price;
   }
}
//
//   Samsung - fridge devices come from South Korea $ 1500.0
//           [Samsung / fridge / 1500.0]
//
//           Process finished with exit code 0