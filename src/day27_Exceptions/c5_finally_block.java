
package day27_Exceptions;

import java.util.NoSuchElementException;

public class c5_finally_block {

    public static void main(String[] args) {

        try {
            System.out.println(10/0);//arithmetic exception // unchecked

        }catch (NoSuchElementException exc){
            System.out.println("no such element");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array excep");
        }catch (ArithmeticException e){
            System.out.println("arithmetic excep");
        }catch (RuntimeException e){
            System.out.println("runtime");
        }catch (Exception e){
            System.out.println("exception");
        }finally {
            System.out.println("Finally block ");
        }


        //yukarida dogru olan ne olursa olsun her zaman ve sadece finally block run eder

        //soyle sorular da gelebilir what is the final keyword and finally keyword gibi

        //finally'den sonra bir de catch falan yazamiyorsun izin vermez

        //how finally blocks works

        //finally block will get executed no matter where try -catch will catch exception.
    }
}