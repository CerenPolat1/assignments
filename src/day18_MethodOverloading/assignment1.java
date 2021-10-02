package day18_MethodOverloading;

import java.time.LocalDate;


public class assignment1 {

    public static void main(String[] args) {

           /*
    1. create an array of string, store five of your friends names in it
    2. create Array of localdates and store their birthdays in the same order
    3. use for loop to print out your friends' names and their birthdays
     */

        String[] names={"DENIZ","RONA","EBRU","GAMZE","CESUR"};

        LocalDate [] localDates={LocalDate.of(1994,9,26),
                LocalDate.of(1993,8,24),
                LocalDate.of(1994,4,21),
                LocalDate.of(1994,1,5),
                LocalDate.of(1994,5,26)};

        for (int i=0; i<=names.length-1; i++){
            System.out.println(names[i]+"'s"+" birthday is:  "+localDates[i]);
        }


    }
}