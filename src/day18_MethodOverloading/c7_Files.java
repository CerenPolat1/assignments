

package day18_MethodOverloading;

import java.io.File;
import java.io.IOException;

public class c7_Files {

    public static void main(String[] args) throws IOException {
        File file1=new File("/Users/sevginhekimoglu/Desktop/javafiles/hello3.xlsx");

        //bu yontemle kendi bilgisayarinda java file i aciyorsun, nereye kaydetmek istedigini seciyorsun
        //sonra her run edisinde bir tane file olusturuluyor

        // sadece file abc=new File() ve file1.createNewFile(); olusturyprsun bunun icin thrown'u falan sistem hallediyor

        //Mac OS X: /Users/username/Desktop.
        //Windows: C:/Users/username/Desktop.
        //Linux: /home/username/Desktop.
        file1.createNewFile();
    }
}