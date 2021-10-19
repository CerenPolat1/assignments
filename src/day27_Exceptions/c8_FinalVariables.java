package day27_Exceptions;

public class c8_FinalVariables {

    //differences between finally and final keyword

    //finally is used with try catch block and it will get executed always

    //final keyword is used to make things not changable
    //bir seyleri degistirmez yapmak istersen final kullanirsin
    //ama sadece finally kullanirsan her zaman sadece try-catch icinde onu yazdirir

    //yani final ve finally arasindki farklar:
    /*
    finally, try-catch block'da kullanilir,yani exception'i handle etme blogunda kullanilir
    final, ise variable'lari degistirelemez yapar
     */

    int instanVrble ;
    static int staticVrble;

    final int instanceVrble2=100;
    final static int staticVtble2=200;

    public static void main(String[] args) {
        staticVrble=100;
        c8_FinalVariables obj1=new c8_FinalVariables();
        obj1.instanVrble=200;

        //sen yukaridakilerine istedigin degeri bi daha verebilirsin ancak final kullandiktan sonra bir daha degistiremezsin

        //obj1.instanceVrble2=20;
        //staticVtble2=400;// final keyword will make variable not changable, yukarida 100 atadigin icine bir daha atama yapamazsin

        final int finalNumber=20;
        //number=22; //degistiremezsin

        int number1 = finalNumber; //20
        number1=1;

        System.out.println("finalNumber = " + finalNumber); //20 final'i degistirme yok, oyleyse oyle kalir
        System.out.println("number1 = " + number1); //1
        //number=2;
    }

}