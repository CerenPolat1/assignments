package teamMeeting_Methods;

public class methods {
    public static void main(String[] args) {


        hello();

        ageCategory(10);

        division(10, 5); //you can't run return method without println   // we cant use return method without static specifier

        System.out.println(division(10, 5));   // return method works with println

        System.out.println(concatStrings("hello", " Ceren"));

        byte b1 = 5;

        abc(b1);  //  we specified this is byte , otherwise java assumes int  as a whole number

        minNum2(20, 5);
    }


    //declaration of the method

    // public               static           void               main             (String [] args){
    // Access-modifier       specifier        return-type        methodName       (parameter)
    //statements ,code
    //}

    //Access-Modifier =public, protected ,default ,private
    //specifier   : static ,final ,abstract ,synchronized
    //return type : void , any datatype(int,string,char , int [] .......)
    //some method has parameters some don't have parameter


    //          -------------------------  1- methods Without Parameters  -----------------------


    // Access-modifier    specifier     return-type      methodName
    public static void hello() {       //function of this method is to print greeting

        System.out.println("Greeting");
    }


    //         ----------------         2- methods With Parameters      ---------------------

    //create a method that will check given age and print the category of each age
    //if age is 0-5 baby
    //if age is 5-18 young
    //if age is 18-80 mature
    //if age is bigger then 80 print  old


    //Access-modifier    //specifier      return-type      methodName              (paramater)22
    public static void ageCategory(int age) {


        String result = "";
        if (age >= 0 && age < 5) {
            result = age + " is a baby";
        } else if (age >= 5 && age < 18) {
            result = age + " is young ";
        } else if (age >= 18 && age < 80) {
            result = age + " is mature";
        } else if (age >= 80) {
            result = age + " is old";
        } else {
            result = age + " is not excist!!!!";
        }
        System.out.println(result);
    }


    //                       ---------------  3- Return Method     --------------------

//void method accepts every data types
//but return method doesn't accept, you need to start and end the same data type
//in this method we need to use return !!!! WHY? bec.we put data type instead of void.
    // !!!!! return type'in (long) return ile ayni olmali paraeter farkli da olur eger icinde farkli islemler yaptiysan

    //create a division function

    public static long division(long number, long number2) {


        return number / number2;

    }

    public static int abc (byte a){

        return a;
    }


    public static String concatStrings(String name1, String name2) {

        name1 = "Deniz";    //why we got "deniz" instead of above? return method accepts here if you assign the value inside return method
        return name1.concat(name2);


    }

    // !!!!! return type'in (String) return ile ayni olmali parameters (int i1,int i2 farkli da olur eger icinde farkli islemler yaptiysan

    public static String minNum2(int i1, int i2) {
        //return type is string i cant return other than string
        String result = "";
        if (i1 < i2) {
            result = i1 + " is minumum number ";
        } else {
            result = i2 + " is minumum number ";
        }

        return result;//return has to return method return type


        //                    ----------------    4- Method Overloading    ---------------------


        //method overloading is creating everything like a regular main method !!!!(ex : same // Access-modifier, specifier, return-type, methodName)!!!!
        // to create overloading method, you need to remove main, put any method name
        //only parameter types will be different !!!!!parameters need to be different!!!!!!!


    }
}



