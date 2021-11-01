package day29_Polymorphism.abstractionPracticee;
////
////create subclasses called iphone and samsung
////--create a static block to assign brand at beginning for iphone and samsung
////--create a constructor to assign model , prize and size for iphone and samsung
////--override abstract methods from parent Phone class

public class Iphone extends Phone  implements appleStore{

    //after we extending phone
    //brand,model,price    inherited
    //texting,calling       inherited   --- abstract methods  (you need override )
    //tostring            inherited

    //after we implement the applestore
    //storename
    //download
    //downloadApp method -- abstract (you need owerride )
    static {
        brand = " -----Apple--- ";
    }

    public Iphone(String model , double price){
        this.model=model;
        this.price=price;
    }

    @Override
    public void texting(long number){
        System.out.println(brand + "  " + model + " is texting " + number);
    }

    @Override
    public void calling(long number){
        System.out.println(brand + "  " + model + " is calling " + number);
    }

    @Override
    public void downloadApp(){
        System.out.println(brand + " " + model + " is downloading from "+ storeName);
    }

    public  void immessage(long number ){  //this is special for iphone
        System.out.println(brand + " " + model + " is imessing to  "+ number);

    }
}
