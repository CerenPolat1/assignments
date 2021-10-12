package day23_Constroctors;

public class c3_StaticBlock {

    //in java as class member we have method,variables , class
    //and optional you can create a block (Static instance)

    int instVrble=10;
    static int staticVrble=20;

    public static void main(String[] args) {//static method

        System.out.println("This is main method"); //2.olarak bu yazdirilacak
        methodStat();  //3.olarak bu yazdirilacak

        c3_StaticBlock obj1=new c3_StaticBlock(); // object...//This is instance block
        //will be excuted if you create an object from class
        //objects will triger instance block
        c3_StaticBlock obj2=new c3_StaticBlock(); //This is instance block ///2 tane object yarattigmiz icin,
                                                                          // 2 kere public void methodInstance(){ run etti.
        //second object will triger instance block again--yani 2.sefer yazdirdi

        obj2.methodInstance(); // 6.olarak yani en son  bu yazdirilacak

    }

    //////////////////////niye bu sirayla yazdirildi?????///////////////

    //1.once static yazdirildi
    //2.olarak maine donduk ve mainde ilk siradaki yazdi
    //3.sonra mainde bir alt siraya gectik  methodStat(); yazdirdi
    //4.simdi objectler yazdirildi. 2 tane olan
    //5. en son siradaki yani   obj2.methodInstance(); yazdirildi
    //aslinda degisen tek sira staticin ilk yazdirilmasi oldu

    public static void methodStat(){
        System.out.println("This is static method>>>");  //3.olarak bu yazdirildi
    }
    public void methodInstance(){
        System.out.println("This is instance method///");
    }

    //blocks

    {
        //instance block
        System.out.println("This is instance block....");  //4 ve 5. olarak bu yazdirilacak // 2 sefer run etti niye 2 tane object var diye
    }
    static {            //kodun icinde ne olursa olsun her zaman ilk static olan execute olur yani yazdirilir sonra diger kodlar  yazdirilir
        //static block
        System.out.println("This is static block\\\\");
        //this static block will get executed before everything
    }

    //instance block : will be executed for any new object
    //static block : will be executed once before everything

}