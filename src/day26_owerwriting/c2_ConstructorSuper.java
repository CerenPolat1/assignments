package day26_owerwriting;
/*
  Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
Constructor chaining can be done in 2 ways: ******

1------Within same class: It can be done using this() keyword for constructors in same class
2------From base class: by using super() keyword to call constructor from the base class.--

Why do we need constructor chaining ?
This process is used when we want to perform multiple tasks in a single constructor
rather than creating a code for each task in a single constructor we create a separate constructor for each task
and make their chain which makes the program more readable.
   */

class test2{
//BURADA 2 TANE CONSTRUCTOR VAR BU YUZDEN JAVA ERROR VERIR 1 TANE OLMALI SEN DE SOYLUYORSUN HANGISINI ALMALI BU DA SUPER() ILE OLUR

    public test2(String str){
        System.out.println("test2 string");
    }
    public test2(int number){
        System.out.println(" test 2  int ");
    }

}
public class c2_ConstructorSuper extends test2{

    //if you extend a parent class that has more then one constructor
    //you will need to tell java which constructor should be executed
    //EGER BIRDEN FAZLA YARATIRSAN ERROR VERIR

    //From base class: by using super() keyword to call constructor from the base class.-- we will see this later


    public c2_ConstructorSuper(){
        super(10);  // PARENT CLASSTA 2 TANE CONTRUCTOR OLDUGUNDAN BIRINI SECMEMIZ LSXIM BIZ DE int OLANI SECTIK

        //super("a");
        System.out.println("c2 cons ");
        //super(10);

    }

    public c2_ConstructorSuper(String str,int i ){
        //this();  ayni anda hem super hem this yazamazsin
        super("hello"); //bir constructor icinde sadece 1 kere super kullanilir like this()
    }


    ///if you call contructor class   -----> this() kullanirsin
    // if you call parent class -----------> super() kullanirsin
    public static void main(String[] args) {

        c2_ConstructorSuper obj1=new c2_ConstructorSuper(); //neden objectin icine bir sey yazmadik cunku bu default olan
        // o da parent'daki int olani aldi o yuzden ilk olarak o run etti. pesine de default'un icindeki runw etti.

        // 1 object sadece bir tane cunstructor kullanir
        // daha fazla istersen yeniden object olusturursun, zaten o yuzden 2 tane super veya this kullanamzsin constructor icinde

        //object will trigger constructor   of child and parent as well
        //in the parent if you have more than one constructor
        //you will need to tell java which constructor to pick
    }
}