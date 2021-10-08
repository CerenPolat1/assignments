package day21_CustomClasses;

public class car {
    //*task2
// create a class called Car
//Attributes:
//   brand, model
//Actions:
//   printBrand(), -- to print car brand
//   drive() , -- to print person drive car brand
//   stop() -- to print person stopped the car brand
//   //setCarinfo() to set car brand and model
//   //toString to print car brand and model with -


    String brand;
    int model;

    public void printBrand(){
        System.out.println(brand);
    }

    public void drive(){
        System.out.println("Person is driving " + brand + " brand");
    }

    public void stopped(){
        System.out.println("Person is stopped " + brand + " brand");
    }


   public void setCarInfo(){
    System.out.println("The person has a/an  " + brand + " brand " + model + " model car");
}

    public String toString () {

        return  brand + "/" + model;
    }

    public static void main(String[] args) {
        car car1= new car();

        car1.brand="RAM";
        car1.model=2021;


        car1.drive();
        car1.stopped();
        car1.setCarInfo();
    }
}

//
//    Person is driving RAM brand
//        Person is stopped RAM brand
//        The person has a/an  RAM brand 2021 model car
//
//        Process finished with exit code 0