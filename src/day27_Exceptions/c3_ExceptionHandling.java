
package day27_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class c3_ExceptionHandling {

    //there is 2 way to handle exceptions so they dont stop compiler from running

    //1- you can use try/catch blocks to handle
    //2- you can use throws keyword to handle

    public static void main(String[] args) {
        System.out.println("Compiler Started");

        //exception'dan kurtulmanin ilk yolu  excemtpion alacagini biliyorsun try in icine yaziyorsun
        //sonraki adimda cikan errorun ismini secerek bunu catch yap diyoruz

        try{
            System.out.println("Waiting for 5 second");
            Thread.sleep(5000);  //checked exception(.InterruptedException;)
        }catch (InterruptedException e){ //buradaki e, object  //java interrupt istemez cunku surekli calismak ister
            //Exception is the parent of all the exception types
            //you can use Exception to catch
            System.out.println("e.getMessage() = " + e.getMessage()); //message yerine baska secenekler de cikiyor biz bunu sectik
           //peki neden println run etmedi cunku gerek kalmadi zaten try'in icindeki run ediyor
        }

        System.out.println("waiting is done ");

        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,4,5,5,6,7,89,10));

        try {
            System.out.println("list.get(20) = " + list.get(20));//unchecked  IndexOutOfBoundsException

        }catch (IndexOutOfBoundsException a){
            a.getStackTrace();//bu exception hakkinda sana fikir veriyo consolda
            a.getMessage();//sana bilgi veriyor: a.getMessage() = Index: 20, Size: 10
//peki neden buradaki try'in icindeki run etmedi de catch'dekiler run etti cunku bizim elimizde 20 index yok,
// olmadigindan asagiya gecti ve onu run etti
        }


        int number=0;

        while (number < 60){
            System.out.println(number );


            try {
                Thread.sleep(1000);  //bu her zaman yukaridaki println'i alir, alamazsa catch'e iner
                //ve 1000 demek 1 saniye demek, sayilar 1 saniye sonra run etsin demek
            } catch (InterruptedException e) {  //eger exception ismini bilmiyorsan (InterruptedException) bunun  yerine direkt Exception ya da RuntimeException yazarsin
                // cunku bu (InterruptedException) bunun  RuntimeException altinda, ya da direkt Exception yaz cunku o parent
                //ya da hic hatirlamiyorsun hangisi hangisine ait direkt olarak Excemption'i call edersin
                e.printStackTrace();
            }


            number ++;
        }


    }

}
