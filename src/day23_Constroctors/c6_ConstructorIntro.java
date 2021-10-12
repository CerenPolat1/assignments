package day23_Constroctors;

public class c6_ConstructorIntro {
    //constructor is a special method which has to have class name as a method name


    //we create objects from class by using constructor methods//
    // constructor ismiyle claslarin ismi ayni olmali
    //if you dont create an contructor java will create one default constroctor for you

    //constructor needs to have same name that class  has

//    public c6_ConstructorIntro(){
//        //this will be created automatically if you dont create
//        //constructor helps class to create an object   //eger staticgin icindeysen object yaratmadan calismaz demek istiyor
//        System.out.println("default constructor");
//    }

    //can we overload constroctor methods //// this is also interview question
    //yes // yani briden fazla c6_ConstructorIntro olusturabildik

    public c6_ConstructorIntro(){
        System.out.println("Constructor created"); // Constructor created cunku ismi classla ayni
    }

    public c6_ConstructorIntro(int a){
        System.out.println("Constractor with int " + a);
    }

    public static void main(String[] args) {

        //alttaki 2'sini yaratmasaydik usttekiler run olmayacakti cunku static method icinde instance var
        //her bir object bir tane method pick yapmis  oluyor

        c6_ConstructorIntro obj2=new c6_ConstructorIntro();
        c6_ConstructorIntro obj1=new c6_ConstructorIntro(10);
    }                                 //this is also constructor cunku clasla ayni isimde
}