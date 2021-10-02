package day18_MethodOverloading;

public class c1_MethodOverloading {

    public static void main(String[] args) {

        method();
        method(10);//this has an int load
        method(10);
        method(20.0); //java will understand it is double bec. it is decimal number

        byte b1=5;
        method(b1);  // byte // now it is clear bec we specified this is byte
        method(5); //int


        //if you dont specify your variable type java will take it as a default int for whole numbers
        //for decibel numbers will be double

        method("hello");
    }

    public static void method(){//this method doesnt have load it is without parameters
        System.out.println("Method ");
    }

    public static void method(int number){
        System.out.println(number + " int method");
    }

    //method overloading is creating everything same for method !!!!(ex : same // Access-modifer,,specifier,,return-type,,methodName)!!!!
    //only parameters type will be different !!!!!paramater) needs to be diffrerent!!!!!!!


//    public static void method (int number2){} //!!!!!neden error verir cunku 2 tane void method int var,
//    int isimleri farkli bile olsa hangisini almak istedigini anlamaz, o yuzden error verir.




    public  static void method(double number){
        System.out.println(number + " double method");
    }

//    public static void method(int number2){ will give you error because of first int method
//        System.out.println(number2 + " int method");
//    }

    public static void method(byte number){
        System.out.println(number + " byte method");
    }

    public static void method(String text){
        System.out.println(text+ " String method");
    }

}