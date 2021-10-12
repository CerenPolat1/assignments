package day23_Constroctors;


//in multi classes you can only have one public class
//o yuzden alttaki classalri public class yapayim diyemezsin

public class c5_MultiClasses {

    public static void main(String[] args) {
        System.out.println("Multi Main class");
    }

}

class Bird{

    public static void main(String[] args) {
        System.out.println("Bird main");
        cat.hellocat2();
        cat cat1=new cat();
        cat1.helloCat(); //  hello cat
        String [ ] arr={"hello"};  //bunu olusturduk cunku class cat' de String[] args var
        cat.main(arr);  //cat main
    }


}


//////////////////////////////////////////////
/*
                            bu classlar nasil calisir???
                            her birinin yandan yesil okunu tiklayarak ayri ayri okutabilirsin
                            cunku her biri zaten ayri ayri class
 */

class cat{
    public static void main(String[] args) {
        System.out.println( "cat main");
    }

    public void helloCat(){
        System.out.println("hello cat");
    }

    public static void hellocat2(){
        System.out.println("Hello cat2");
    }
}