package day16_Methods;

import java.util.Scanner;

public class c4_methodsWithParameters {

    //decleration of the method
    // public               static           void               main        (String [] args){
    // Access-modifier       specifier        return-type        methodName  (paramater){
    //statments ,code
    //}

    public static void main(String[] args) {
        //hello method is void method without parameters
        hello();
        hello();
        //asagidakilerin hepsi parameter cunku int degeri aldilar,bi tane daha agecatogory yazmaya calistiginda
        // int oldugunu gosteriyoe
        ageCategory(10); //bunun icine numara vermezsen calismaz cunku buna bagli olarak kurduk denklemi
                        // senden yas yazmani istiyor ki run etsin
        ageCategory(25);
        ageCategory(3);
        ageCategory(85);
        ageCategory(-25);


        //eger yukaridaki gibi deger verip gormek istemezsen yine main method icinde scanner kullanarak yapabilirsin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();

        ageCategory(age); // bu,  verilen degerin run etmesi icin yazildi

    }

    public static void hello(){
        System.out.println("hello");
    }

    //create a method that will check given age and print the category of each age
    //if age is 0-5 baby
    //if age is 5-18 young
    //if age is 18-80 mature
    //if age is bigger then 80 print  old

    public static void ageCategory(int age){

        String result="";
        if (age>=0 && age <5){
            result= age+ " is a baby";
        }else if (age>=5 && age <18){
            result = age + " is young ";
        }else if (age>=18 && age < 80){
            result = age + " is mature";
        }else if (age >= 80){
            result = age + " is old";
        }else {
            result = age + " is not excist!!!!";
        }
        System.out.println(result);
    }
}