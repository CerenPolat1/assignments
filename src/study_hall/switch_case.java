package study_hall;

public class switch_case {
    public static void main(String[] args) {


        //Accepted Data Types
        //The variable passed as a switch argument can be one of the following:
        //char
        //byte
        //short
        //int
        //String
        // long  not acceptable
        //float not acceptable
        //double not acceptable


        // A switch statement allows a variable to be tested for equality against a list of values.
        // Each value is called a case, and the variable being switched on is checked for each case.

        /////////////

        //practice
        //create a logic that will check the number and print the day name


        String dayName; //empty string not assigned anything yet
        int number=1;

        switch (number){

            case 1:
                dayName = "Monday";
                break;
            //case 1:     //Duplicate case values are not allowed.
            case  2 :
                dayName="Tuesday";
                break;
            case 3 :
                dayName ="Wed";
                break;
            case 4:
                dayName = "Thurs";
                break;
            case 5:
                dayName=" Friday";
                break;
           default:
                //The default statement is optional and can appear anywhere inside the switch block.
                //          In case, if it is not at the end, then a `break statement must be kept after the
                //          default statement to avoid the execution of the next case statement.`
               //let's think default as an else.. they are similar bec. both are executed, if others are not correct
                dayName = "Invalid Day";
                break;
            case 6 :
                dayName = "Sat";
                break;
            case 7 :
                dayName ="Sunday";

        }




        System.out.println(dayName);
        System.out.println("................");

        //print case number 1-5 as weekday
        //6 and 7 is weekend
        String dayType;

        switch (number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;
            default:
                dayType="Invalid DAyType";
        }

        System.out.println(number + " is a "+dayName);
        System.out.println(number + " is a "+dayType);
        System.out.println(dayName + " is a "+dayType );


    }

}