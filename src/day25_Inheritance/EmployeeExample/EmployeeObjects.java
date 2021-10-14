package day25_Inheritance.EmployeeExample;

public class EmployeeObjects {

    public static void main(String[] args) {

        SDET sdet1=new SDET("firas" , "SDET" , 23 , 120 ,314234234234l); //constructor

        Developer developer1=new Developer("Ozge","Developer" , 25 , 130 , 2342343244l); //constructor

        System.out.println(developer1);
        developer1.developing(); //Ozge is developing
        System.out.println(sdet1);
        sdet1.testing();   //firas is testing
        sdet1.foundBug();  //firas is founded bug
        developer1.fixingBug();  //Ozge is fixing bug

        SM sm1=new SM("recep" , " SM " , 234234423423l); //constructor
        //sm1.name=
        System.out.println(sm1);
        sm1.creatingMeetings();
    }
}