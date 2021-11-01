package day28_Abstraction;

public class c5_InterfaceCalls implements c4_InterfaceIntroduction{
    /////                    //extend yerine implent kullanilir cagirmak icin parent'i


    //bu class'i ilk olusturdugumuzda hata verir cunku senin overriding yapmani ister intercafe olanlari
    //yine kolayca yapmak icin c4_InterfaceIntroduction ustune gel impletement de hepsini hemen otomatikman yazar

    //    // you can implement inheritence in the interfaces by using implements keyword (instead of extend)
    //    // you can implement multiple interfaces

     /* below methods will be inherited

     default void method1(){};
    static void method2(){};
    public abstract void method3();//public and abstract
    abstract void method4();//public and abstract
    void method5(); //public and abstract
     */

    //neden sadece alttakiler overriding oldu cunku onlar abstracti ve bu sekilde body'leri oldu.

    //only abstract methods has to be overridging

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }
}
