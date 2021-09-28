package day16_Methods;

public class c5_reverseString {

    public static void main(String[] args) {
        c3_Methods.hello();// bu, herhangi bir classstan cagirma yontemi, helloyu cagirdik, bunun icin hangi classtan oldugunu belirtmemiz gerekiyor
         //bunla tek tek ugrasmamak icin src icine yeni bir package ve class olustur ve
        reverseString("hello world"); //reverse icin boyle de yazabilirsin

        String name1="Ridvan Oral"; //reverse icin bunnlari da yapabilirsin.peki neden string run'da cikmadi cunku method olarak yazilmadi
        reverseString(name1);

        int i1=25;
        //reverseString(i1); we cant pass int here because parameter type of reverseString method is string
    }

    //bu methodlari herhangi bir yer classtan cagirabilir misin evet cunku sen public (accsess modifier) yarattin o yuzden istedigin yerden cagirabilirsin

    //we will create our own reverse library method
    //this method will accept a string
    //as a result it should return reverse of the string
    public static void reverseString(String name){
        String result="";
        for (int i =name.length()-1 ; i >=0 ;i--){
            result += name.charAt(i); // char kullandik cunku her bir harfi yazdiracak
            //peki neden name.charAt(i) kullandik da error vermedi, cunku name.charAt(i)'den once "" yazmak gerekirdi
            //cunku zaten result icine "" dahil ettigimizden bir daha yazmamiza gerek kalmadi.
        }
        System.out.println(result);
    }
}
             //PAY ATTENTION//
       //length() ile length fark ne???
       //length(), string method, length parantezsiz oldugunda Array olur.