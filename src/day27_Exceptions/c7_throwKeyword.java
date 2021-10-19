package day27_Exceptions;

import java.util.NoSuchElementException;

public class c7_throwKeyword {

    public static void main(String[] args) {
        NoSuchElementException obj =new NoSuchElementException(); //bu exception'lari object olarak kullanabilirsin
        //  throw obj;

        //throw vs throws
        //throw will throw exception to your code... throw gives a problem to your code
        //throws will handle exceptions
        //so 2 of them do totally different things

        try {
            throw new ArithmeticException(); //throw create ArithmeticException exception

        }catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("e.getStackTrace() = " + e.getStackTrace());
            System.out.println("e.getCause() = " + e.getCause());
        }
    }
}

//soyle interview sorusu da gelebilir what are differences between throw and throws

//in the future you may need to handle some of exceptions such as
//waiting  realated
//sql related
//file related

//let say, there are 100 strings and if they have 10 index numbers
//give me result which ones doesnt have


//diyelim ki 100 tanesindekini kontrol edeceksin ve ilkinde exception yasadin cunku 10 index number cikmadi ne yapacaksin?
// bir sey yapmazsan fail verecek ve digerlerini check etmeyecek
// ama her birine  try-catch uygularsan sorun ortadan kalkar.