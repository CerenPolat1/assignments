package day25_Inheritance.EmployeeExample;

public class SDET extends Employee{
    //SDET functiouns :testing ,foundBug
    // //common variables : name ; jobid , jobtitle ,salary ,age

    //name inherited
    //jobid inherited
    //jobtitle inherited
    //salary inherited
    //age inherited
    //toString inherited


 /*

 ALTTAKINI TEK TEK BU TARZ OLUSTURMAK YERINE DIREKT CONSTRUCTOR OLUSTURDUK VE ICINE YAZDIK HER SEYI TEK SEFERDE
  bird1.age=5;
        bird1.name="bird1";
        bird1.grow();
        bird1.move();
  */


    public SDET(String name , String jobTitle , int age , double salary ,long jobId){
        this.age=age;
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.jobID=jobId;
    }


    public void testing(){
        System.out.println(name + " is testing");
    }

    public void foundBug(){
        System.out.println(name + " is founded bug !!!!!!!!!");
    }


}
