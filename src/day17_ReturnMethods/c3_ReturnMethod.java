package day17_ReturnMethods;

public class c3_ReturnMethod {

    public static void main(String[] args) {

        //void accepts every data types
        //but return method doesn't accept, you need to start and end the same data type


        minNum(10, 5); //this one is void method, you can not store string
        String result = minNum2(10, 5); //return type oldugu String icin store yapabildi
        System.out.println(result);
        System.out.println(minNum2(10,5));

        System.out.println(minNum2(7, 19)); //void methodu boyle de run edebilirsin

        //found the minumum and add minumum number is the small number
        //String min1=minNum(7,8); //void doesnt return any data type so you cant store in variable
        String min2 = minNum2(7, 8); // you can store data type here
        System.out.println(min2 + "*** Minumum number is the small number");

        System.out.println(division(20, 2));
        int resultOfDivison = division(20, 5); // 4
        System.out.println(resultOfDivison * 10); //40
        System.out.println(division(30,5));
    }

    //declaration of the method
    // public               static           void               main        (String [] args){
    // Access-modifier       specifier        return-type        methodName  (parameter)
    //statements ,code
    //}

    //Access-Modifier =public, protected ,default ,private
    //specifier  : static ,final ,abstract ,synchronized
    //    //return type : void , any datatype(int,string,char , int [] .......)r
    //some method has parameters some don't have parameter

    //create a method that will print minumum number from 2 number

    ////return method kullaniyorsan, return methodun icinde print yapamiyorsun, void main icinde yapioyorsun

    public static void minNum(int i1, int i2) { // int'lere sadece variable yani isim verip birakiyorsun asil islem assagida
        String result = "";
        if (i1 < i2) {
            result = i1 + " is minumum number ";
        } else {
            result = i2 + " is minumum number ";
        }
        System.out.println(result);
    }

    //void means any data type and it doesn't need return keyword

    public static String minNum2(int i1, int i2) {
        //return type is string, i have to return to string, bec. return method requires, doesnt accept other one
        //bec. i used string for return type, the end of i have to use again string
        String result = "";
        if (i1 < i2) {
            result = i1 + " is minumum number ";
        } else {
            result = i2 + " is minumum number ";
        }

        return result;//return method has to return method and return type both has to be same thing
        //neden  s.println kullanmadik statementi konsolda gormek icin? cunku return type string o yuzden

    }

    //create a division function
    public static int division(int number, int number2) {
        System.out.println("Hello This is Division Method!!!!");
        System.out.println("Division of " + number + " , " + number2);
        return number / number2; //direkt islemi gerceklestirir.
    }


    //addition methods
    public static void addition(int number1, int number2) {

        System.out.println(number1 + number2);
    }

    public static int addition2(int number1, int number2) {

        return number1 + number2;
    }

    public static byte addition3(byte number1, byte number2) {
        return (byte) (number1 + number2);///addition of number 1 and number2 might be bigger than byte thats why we need casting
        //(number1 + number2) toplami bytein degerini astigindan cast etmek gerekir yani byte olrk isaret etmek grkr

        //public static int addition3(byte number1, byte number2) de yapabilirsin yani return int icerisi byte, cunku int>byte coverladigi icin
    }
}





