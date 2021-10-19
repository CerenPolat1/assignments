package day27_Exceptions;

public class c6_throwsKeyword {

    public static void main(String[] args) throws InterruptedException  { //throws'dan sonra parent oldudundan Exception da yazabilirsin

        //there is 2 way to handle exceptions so they dont stop compiler from running
        //1- you can use try/catch blocks to handle
        //2- you can use throws keyword to handle

        //throws keyword will be assigned to your method signature

        System.out.println("Start");
        Thread.sleep(2000);
        System.out.println("Waited 2 second");  //bu 2 saniye sonra run edecek

        //bu yontemleri uyglaman icin once denklemi kuruyorsun bakiyorsun sikinti var ondan sonra vbu yontemleri deniyorsun
        //yukariya throws yaptiktan sonra exception ortadan kaldi

        Thread.sleep(3000);
        System.out.println("3 extra second");
    }
}