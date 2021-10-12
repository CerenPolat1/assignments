
package day23_Constroctors;

public class c4_StaticBlock {

    static int st1=10;
    static int st2=20;
    int ins1=30;

    // interview sorularindan: instance ve class farki, instace static farki gibi

    public static void main(String[] args) {
        System.out.println(st1);    //neden 10 ve 20'yi almadi da 100 ve 200'u aldi
        // cunku static hepsinden once yazdirilir ve ne gorurse onu keep eder o yuzden 10 ve 20ye sira gelmedi cunku 100 ve 200 okundu
        //cunku staticte one copy vardir ojbect gibi her defasinda assign yapmaz.

        System.out.println(st2);

        // System.out.println(ins1); to be able to call this instance varibale in static method
        //we will need to create object

        //to create object i need call class name
        c4_StaticBlock obj1=new c4_StaticBlock();   //bu objecti olusturmasaydik bunun altindaki run edilmeyecekti.
        System.out.println("obj1.ins1 = " + obj1.ins1);

    }

    static {
        System.out.println("Static Block");
        st1=100;
        st2=200;

    }
}