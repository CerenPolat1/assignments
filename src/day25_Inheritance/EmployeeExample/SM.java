package day25_Inheritance.EmployeeExample;

public class SM extends Employee {
    //SM ; create sucrum meetings

    // //common variables : name ; jobid , jobtitle ,salary ,age

    //name inherited
    //jobid inherited
    //jobtitle inherited
    //salary inherited
    //age inherited
    //toString inherited


    public SM(String name, String title , long id) {

        this.name=name;   //bundan this'i kaldiramayiz cunku her ikisi de ayni isme sahip, neyin nereden geldigini gosterir this

        jobID=id;   //buradan this'i kaldirabiliriz cunku isimler farkli, java doesnt confuse bec. titles different

        this.jobTitle=title;  //this yapmak icin illa jobTitle=title bunlarin ayni isimde olmasina gerek yok
    }

    public void creatingMeetings(){
        System.out.println(name + " is scheduled sprint meetings");
    }
}