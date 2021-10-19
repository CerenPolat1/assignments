package day27_Exceptions;




//*** Exemptions and Errors both are subclasses of Throwable class.
// The error indicates a problem that mainly occurs due to the lack of system resources***
// and our application should not catch these types of problems.
// Some of the examples of errors are system crash error and out of memory error.
// Errors mostly occur at runtime that's they belong to an unchecked type.
//
//Exemptions are the problems which can occur at runtime and compile time.
// It mainly occurs in the code written by the developers.
// Exemptions are divided into two categories such as checked Exemptions and unchecked Exemptions.

//exeption is kinda warning that comes from java

/*
Error: is that you dont want to happen because it comes from system errors. that is a problem for your system.
you cant handle error because it occurs from system problems
Exemption is not always like this. it is not an error.
it is just something that java gives you warning and you can handle Exemptions

 */

public class c1_ErrorVsExceptions {

    public static void main(String[] args) {
        method(5);
    }

    public static void method(int number){  // this is kinda infinitive loop, cunku 0 olmadigi surece yazdirmasi gerekecek
                               //ayrica number surekli degicegi icin paramatera geldiginde yine artacak mesela:
                              // asagidaki 6 oldu, parameterda 6 aldi denklem sonunda 7 oldu,
        // parameter tekrar dondu 7 olarak, denklem sonu 8'e dondu, bu yuzden infinitive oluyor

        while (number != 0 ){      //this is unchecked Exemptions
            number = number+1;//6
            method(number);//6  //StackOverflowError
        }
    }



}

class ExemptionsExample{

    public static void main(String[] args) {

        int number1=100;
        int number2 = 0;

        //int result = number1 / number2 ;
        //ArithmeticExemption // you cant divide numbers by zero
    }
}