
package day31_Map;

public class c5_StringBuilder_StringBuffer {

    //String vs StringBuilder vs StringBuffer:
    //
    //		String: Immutable (sabit) version char sequences
    //
    //		StringBuilder: mutable (degisken) version char sequences, not synchronized
    //
    //		StringBuffer: mutable (degisken) version char sequences, synchronized , thread-safe, slow

    public static void main(String[] args) {
        String str="Hello";
        str.concat("world");
        System.out.println("str = " + str); //hello
        //string is immutable and we didnt print str.concat(world) or we didnt reassing str=str.concat("world");
        //that is why string object wont be modifieded it will stay as hello

        String str2=str.concat("world"); //helloworld
        System.out.println("str2 = " + str2);

        StringBuilder builder=new StringBuilder("Hello"); //open to be modified

        builder.append(" world");//StringBuilder: mutable .... append method ile birlestirdik **********
        System.out.println("builder = " + builder);//Hello world

        StringBuffer buffer=new StringBuffer("Hello");
        buffer.append(" world");//		StringBuffer: mutable
        System.out.println("buffer = " + buffer);

        // *********another way of to reverse string **************************

        String word="java";

       StringBuilder builder2=new StringBuilder(word);
       System.out.println("builder2.reverse() = " + builder2.reverse());  //reverse methodla kelime ters cevrildi

    }
}