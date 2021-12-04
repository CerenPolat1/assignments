package day27_Exceptions;

import java.io.File;

public class c2_ExeptionTypes {

       //EXCEPTIONs

    //1-RuntimeException (in the console)    2-  IOException (compiler exception)
//in selenium -->runtimeexception, mostly time we face it
    //diyelim sen exceptiondan kurtulmak istiyorsun sorunun 1 mi 2 mi oldugunu bilmiyorsun,
    // o zaman direkt EXCEPTION (PARENT) yazarsin cunku o parent oldugundan hepsini karsilar


    //exemptions: unexpected or unwanted events
//
//	there two types of exception:

//			1.unchecked (unexpected event):If a program throws an unchecked exeptions,
//			it reflects some error inside the program logic
//			occures during run time

//****************Runtimeexemption class is the parent of all exemptions
//
//			2.checked (unwanted events): In general, checked exemptions represent errors outside the
//			control of the program.
//			occurs during the compile time. needs to be handled immediately

    // eger exeption, compile zamaninda yani sen uretirken oluyorsa buna checked (unwanted events) denir
    //ama eger sadece run ettginde exeptions ile karsilasiyorsan buna unchecked (unexpected event) denir

    public static void main(String[] args)  {
        System.out.println("Java Exeptions Topic");

        ////			1.unchecked (unexpected event):If a program throws an unchecked exemption,

      System.out.println(20/0); //uncheked exeptions
        //occures during run time
        //Runtimeexemption class is the parent of all exemptions
        //for uncheked exeptions you wont see any java warning messages
        //********you will see warning in the consule after you run

        String name="Bahast";

        //System.out.println(name.charAt(100));//StringIndexOutOfBoundsexemption, cunku max 5 yazabilirdik
        //we got the warniing after we run
        //this is a runtime exemption
        //unchecked exception.


        int [ ] arr = {10,20,30};
        //System.out.println(arr[5]);//ArrayIndexOutOfBoundsexemption
        //runtime and uncheked

        //2.checked (unwanted events): we will need to handle before we run
        // those will give us warning message before the run

        //
        System.out.println("hello");
        //Thread.sleep(5000); //Interruptedexemption;// 5 sn // bu sana 2. hello yazisini 5 sanaiye sonra vermesi icin yapilir
        //this is checked exceptions because it gives us warning message before we run the code
        //bunu cozebilirsin neden cunku bu checked exceptions..
        // nasil? sol tarafta cikan warning uyarini dikkate alarak
        System.out.println("hello ");

        File  file1=new File("Hello.txt");
        // FileInputStream fileInputStream=new FileInputStream(file1);//java.io.FileNotFoundexemption;
        //checked exception

    }
}