package day27_Exceptions;

import java.util.NoSuchElementException;

public class c4_multiTryCatch {

    public static void main(String[] args) {


        //exception sorulari genelde verbal interview'de gelir. turleri neler multi try carch nedir ne icin kullanilir vs.diye

        try {
            System.out.println(10/0);//arithemetic exception // uncheked

        }catch (NoSuchElementException exc){
            System.out.println("no such element");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array excep");
        }catch (ArithmeticException e){
            System.out.println("arithmetic exccep");
        }catch (RuntimeException e){
            System.out.println("runtime");
        }catch (Exception e){
            System.out.println("exception");
        }


        //in try and catch solves issue definately, you never see same issue in your code in any  but in throws method you can face it bec. you just throw anywhere
         //it is absoulute solution you never see this kinda
        //yukaridaki catch'lerden hangisi bu ornekle ilgiiyse o exception run eder,
        // buradaki sorun arithemetic exception ilgili oldugundan o run etti
        // peki neden dogru oldugu halde (RuntimeException ve Exception) run etmedi
        // cunku eger catchlerden biri once run ettiyse digerlerini yazdirmaya gerek duymaz
        //yani catrch gordugu ilk dogruyu alir

        //to be able to catch exception you need use same level exception or parents of exceptions
        //for ex : handling arithmetic exceptions will be handled with arithmetic,runtime,exceptions

        //in multi catch as soon as block catch it wont check other catch blocks


    }
}