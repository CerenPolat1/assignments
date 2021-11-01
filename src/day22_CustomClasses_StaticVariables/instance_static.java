package day22_CustomClasses_StaticVariables;

public class instance_static {


    static String brand;
    String cellphone;
    String model;


    public void  instance( String cellphonee, String brand){  //instance method,

        cellphone=cellphonee;
        this.brand=brand;

        System.out.println("this brand is "+ brand+" and cellphone is "+cellphone +" is generally preferred by young people");
                                   // static                              //instance:it gives error if we dont specify inside parameter
    }

    public void  abcde(){  //we dont need to use paramater bec. our variable(brand) is static, if we put varible inse paranthesis, it will be reassign

        //this.brand=brand; //we already assigned brand, so we dont need to put here brand variable
        System.out.println(brand + " and "+ cellphone+" is most popular one");
    }


    public static void main(String[] args) {

        instance_static obj= new instance_static(); //we created object to call instance methods inside static main method

       obj.instance( "Iphone","Apple"); //multiple copies


        instance_static objj= new instance_static();
        objj.abcde(); //we didnt assign anything for this  bec. we have static variable inside that method:Applee
        //why we get Apple(brand) but didnt get Iphone(cellphone)
        //because   static-one copy             instance-multiple copies. That's why we must assign cellphone again





//         STATIC -method

//      1-  a method is declared with static keyword, it is known as static method.

//        exp: public static void main(String[] args)  public static void abc ()

//      2- if classes have both static methods, classes do not need to use objects.

//      3- static variables know as global variable SO YOU DONT NEED TO CREATE AN OBJECT

//      4- static variable can only have one copy from object


//        INSTANCE method
/*

     1-since method is instance, we dont need to create an object inside this method.

      exp: public void abcd(){}, public String toString(){} ....

     2- if one of them is static and other one is instance, we need to create an object to run our code.

       exp: let say, we have an Instance method and a static method :top of the page

     3- There is no keyword for instance

     4- instance variable can only have multiple copies from object
 */



















    }

}
