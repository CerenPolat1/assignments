package day05_ifContinue;

public class c5_ternary {
    //this is just another way of using if else block

    //create a java program that prints max number from 2 number

    public static void main(String[] args) {

        int number1=10;
        int number2=20;

        int max=0 ; // this is to store max number
        String message = ""; // this will be message that we will print at the end

        System.out.println(max);
        System.out.println(message);

        if (number1 > number2){ //10 >20 false
            max = number1; //it is not going to check here
        }else {//this will be true
            max =number2; // max == 20;
        }
        //System.out.println("Maximum number is "+max);
        message = "Maximum number is " + max ;
        //text + number == text(20)
        System.out.println(message);


        /// ternary (another way of if else block)
        int number3=35;
        int number4=45;

        int max2;

        max2 = (number3 > number4) ? number3 : number4 ;
        //if : ?
        // else ->  :
        System.out.println(max2);


        String  result = "false";

        result = (false) ? "Java" : "Python" ;  //neden false aldik, cunku condition yarattik false ise result java al diyor ama belirtilmediginden true kabul ediyor.

        System.out.println(result);

        if (false){
            result="java";
        }else {
            result="python";
        }
        System.out.println(result);



    }
}
