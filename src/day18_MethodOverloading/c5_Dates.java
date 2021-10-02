package day18_MethodOverloading;

import java.time.LocalDate;

public class c5_Dates {

    public static void main(String[] args) {

        //localdate class is coming from java librarry as well
        LocalDate date=LocalDate.of(2021,10,1);
        //objects creating from classes

        //!!!!!!object type is localDate!!!!!


        System.out.println(date);

        LocalDate localDate2=LocalDate.of(2020,6,5);
        System.out.println(localDate2);

        boolean b1=date.isAfter(localDate2);//true
        boolean b2=date.isBefore(localDate2);//false
        boolean b3=date.isEqual(localDate2);//false

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        System.out.println("b3 = " + b3);

        //to print today date
        LocalDate todayDate=LocalDate.now(); //now, hazirda var, sadece cagirdik, onun sayesinde bunun tarihini aldik
        System.out.println(todayDate);


        //replace - with dot on today date result
        String todayDateString=todayDate.toString(); // asagifaki islem icin string lazimdi onun icin stringe cevirdik
        todayDateString = todayDateString.replace("-",".");   //todayDateString = 2021.09.28// - yerine . koyduk

        System.out.println("todayDateString = " + todayDateString);
    }
}