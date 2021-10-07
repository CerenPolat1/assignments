package day21_CustomClasses;

import myMethods.myLibraryMethods;

import java.util.ArrayList;

public class ShoeObject2 {

    public static void main(String[] args) {
        Shoe shoe1=new Shoe();
        Shoe shoe2=new Shoe();

        shoe1.getShoeInfo();//null , 0 , null
        shoe2.getShoeInfo();//null , 0 , null
        myLibraryMethods.stars();

//        shoe1.brand="addidas";
//        shoe1.size=10;
//        shoe1.color="yellow";
//        instead of calling each variable that written above
//        we can create a method under shoe class
//        that will assign our variables

        //set method ---->bunun sayesinde tum bilgileri assign yapabildik
        shoe1.setShoeInfo("adidas",10,"yellow");
        shoe1.getShoeInfo();
        shoe2.setShoeInfo("nike" ,7 ,"pink");
        shoe2.getShoeInfo();

        System.out.println(shoe1);//hashcode verecekti  cunku bunun icine bu line'da herhangi bir sey belirtmedik, size, color gibi
        // bundan kurtulmak icin bu yuzden shoe claas'a tostring atadik.

        String [] shoelist={shoe1.brand, shoe2.brand};
        //since shoe.brand returns string i can store them in string array

        Shoe [] shoes={shoe1 ,shoe2};
        shoes[0].getShoeInfo(); //index0, yani shoe1 i alacak
        //adidas , 10 , yellow
        System.out.println("shoes[1].size = " + shoes[1].size);
        //shoes[1].size = 7

        //how can we store in arraylist
        ArrayList<Shoe> shoeArrayList=new ArrayList<>();
        shoeArrayList.add(shoe1);
        shoeArrayList.add(shoe2);

        System.out.println(shoeArrayList); //to be able to see an result for this
        //your custom class needs to have a toString

    }
}