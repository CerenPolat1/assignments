package day28_Abstraction.Phonee;

public class Samsung extends Phone {

    //    --create a static block to assign brand at beginning for iphone and samsung
//--create a constructor to assign model , prize and size for iphone and samsung
//--override abstract methods from parent Phone class

    @Override
    void calling() {
        System.out.println(brand+ " provides calling.");
    }

    @Override
    void texting() {
        System.out.println(brand+ " provides texting.");
    }

    static{
        brand="Samsung";
        System.out.println("The brand is "+ brand);
    }

    public Samsung (String model, double size, double price){

        this.model=model;
        this.size=size;
        this.price=price;

        System.out.println(model+" provides large screen and it's size: "+ size+ ", and it's price: "+ price);
    }

}
