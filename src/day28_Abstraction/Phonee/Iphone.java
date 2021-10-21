package day28_Abstraction.Phonee;

public class Iphone extends Phone {


    //    --create a static block to assign brand at beginning for iphone and samsung
//--create a constructor to assign model , prize and size for iphone and samsung
//--override abstract methods from parent Phone class


    //daha extend yaparken class error verir, ampulu tikladinda implement method de o zaman overringleri hazirlar ve boylelikle sorun kalkar..
    @Override
    void calling() {
        System.out.println(brand+ " provides calling.");

    }

    @Override
    void texting() {
        System.out.println(brand+ " provides texting.");

    }

    static{

        brand="Iphone";
        System.out.println("The brand is "+ brand);
    }


    public  Iphone (String model, double size, double price){

        this.model=model;
        this.size=size;
        this.price=price;

        System.out.println(model+" provides large screen and it's size: "+ size+ ", and it's price: "+ price);

    }


}

