package day17_ReturnMethods;

import java.util.Scanner;

public class c4_ReturnMethodsCountinue {

    public static void main(String[] args) {
        String firstName="Hello";
        String lastName="World";

        System.out.println(firstName.concat(lastName));

        System.out.println(concatStrings("Mehmet","Cakar"));

        Scanner input=new Scanner(System.in);
        String firstName2=input.next();
        String lastName2=input.next();

        System.out.println(concatStrings(firstName2,lastName2));

        boolean result = equalNames("hello" , "World"); // neden bunu yarattik cunku return methodumuz boolean bunu boolen'a cevirmek gerekiyor
        System.out.println(result); // false
    }

    //create a return method that will concat 2 different string
    public static String concatStrings(String name1 , String name2){ //name1=Mehmet , name2=Cakar
        //scanner ornegi icin//name1 = firstName2 ; name2=lastName2
    ///diyelim sen name1'a burada hello dedin, ama yukariya mehmet yazdin, buradakini alir yukardakini degil cunku reassign yapmaxin var olani alir
        //name1 ="Mesut";  this will reassign your name to mesut
        return name1.concat(name2); //bunlara assign yapmazsan yukarda yazdigini kabul eder

        ///yaniii kisaca bunun icinde atama yapma yaparsan yukari baska bir sey yazarsan buradakini alir diger yazdigini degil
        //o yuzden en temiz yol direkt sadece burada ne yapmak istiyorsan yap atamayi yukardan yap
    }

    //    //create a logic that will check given names are equal
    //2 string to compare  2 parameters
    //to be able to compare you need equals
    //return type as boolean
    public static boolean equalNames(String str1,String str2){

        return str1.equals(str2);
    }

///// your return type has to be match with youre return: yukarida boolean var, return true; yazmalisin
// retun "true"; yapamazsin cunku bu string olur, eger yuklardsa string olsaydi retun "true"; sikinti olmazdi


    ///what ever you want to have as a return make sure your method type is same as return
    //parameters are what ever you wanted to pass your method


}
