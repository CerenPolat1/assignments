package day21_CustomClasses;

//custom classes which will be your library for shoes

//ArrayList class as example                //shoe
//data : can be any type of object          //data:shoe object
//functions : add ,remove ,size ,get ...    //functions :brand,size,color
//wear() ,, getShoeInfo ...

//idea of creating object from class
//ArrayList<>  list     =  new ArrayList<>();
//  Class     refName           OBJECT

// Shoe   nike=new Shoe();

   //!!!!!!!!!!interviwe question about class!!!!!!!!!!! class : it is where you actually implement your code . you store variables methods inside of your class

//this is where you create an object from . Class will explain behaviour of objects

//local variables : local variables that we declared with in block(main method,other methods ,static block)
//instance variables : object variables that we create inside of class
//instance variables can not have static specifier
//needs to be decleared outside of methods or blocks

//Access-Modifer =public, protected ,default ,priavate
//specifier   : static ,final ,abstract ,synchronized
//return type : void , any datatype(int,string,char , int [] .......)
//some method has paramertes some dont have parameter


public class Shoe {

//    public static void main(String[] args) {
//        //local variables
//
//    }

    //instance variables : object variables that we create inside of class
    //instance variables can not have static specifier
    //needs to be decleared outside of methods or blocks

    String brand; //instance variable   //bu string, int ve string methodun icine yazilmaz sadece classin icine yazilir
    public int size;//inst
    String color;//inst

    //static String brand2; //static variable

    public void wear(){
        System.out.println("Person is wearing  " + brand);
    }

    public void getShoeInfo(){
        System.out.println(brand + " , " + size + " , " + color);
    }

    //since all the varibles are not decleared we will need to set variables to make sure methods doesnt return null
    public void setShoeInfo(String shoeBrand , int shoeSize , String shoeColor){
        brand = shoeBrand;
        size = shoeSize;
        color = shoeColor;
    }

     //toString sana sonraki ShoeObject'lerde hashtag almani onliycek
    // toString(): the method gets executed automatically whenever we pass the object name into the print statement

    public String toString(){    //return method
        return  brand+"/"+color+"/"+size;
    }  //burada belirttigin icin siger classlarda hastag almayacaksin
      // ornegin   shoe1.setShoeInfo("adidas",10,"yellow");
    //        shoe1.getShoeInfo();
    //        shoe2.setShoeInfo("nike" ,7 ,"pink");
    //        shoe2.getShoeInfo();
    //
    //        System.out.println(shoe1);   bu artik hashcode veremyecek




}