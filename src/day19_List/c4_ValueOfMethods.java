
package day19_List;

public class c4_ValueOfMethods {
    //            valueOf methods: converting string to wrapper class value, returns wrapper class values

    public static void main(String[] args) {

        String str="55";

        int number=Integer.parseInt(str);   //primitive ceviriyor: int var
        Integer number2=Integer.valueOf(str); //wrappe ceviriyor; Integer var

        System.out.println(number + 25);//80
        System.out.println(number2 + 25); //80
        System.out.println(str + 25); //5525

        String stttr2= "55.5";
        Double d1=Double.valueOf(stttr2);
        System.out.println(d1+5);

        String text="55"+"25";
        System.out.println(text);
    }
}