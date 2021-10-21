package day28_Abstraction.Phone;

public abstract class Phone {

    /*
            1. create an abstract class called Phone
            attributes: brand, model, price, size
    abstract methods: calling(), texting()
    instance method: toString()

    create sub classes called iphone and samsung
--create a static block to assign brand at beginning for iphone and samsung
--create a constructor to assign model , prize and size for iphone and samsung
--override abstract methods from parent Phone class

    create a phoneobject class
    to create 5 iphone object and 5 samsung object
    use all the methods for all objects


    plus you can create extra special methods for iphone and samsung classes
 */

    //attributes:

    String brand;
    String model;
    int price;
    int size;

    //abstract methods

    abstract void calling();
    abstract void texting();

    public String toString(){
        return "brand: "+brand+ ", model: " +model+ ", price: "+price;
    }

}
