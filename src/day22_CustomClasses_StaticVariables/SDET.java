package day22_CustomClasses_StaticVariables;

public class SDET {
 /*
 create a class called SDET
Attributes:
   name, employeeID, Salary , companyName
Actions:
   setInfo(), testing(),  creatingTicket(boolean isBug);
  */


    String name;
    int employeeID;
    int salary;
    String companyName;

    public void setInfo (String name, int employeeID, int salary, String companyName){  //it shouldnt be static if it is, i need to create objects

    this.name=name;
    this.employeeID=employeeID;
    this.salary=  salary;
    this.companyName=companyName;

        System.out.println("Employee name: "+name+ ", employeeID:= "+ employeeID+", employee salary: "
                +salary+" and employee works at: "+companyName);
    }

  public void testing (String testing){
      System.out.println("Worker is doing "+testing+ " testing");

  }

public boolean creatingTicket(boolean isBug){

    if (isBug==true){
        System.out.println("some bugs found");
    }else{
        System.out.println("no bug");
    }
    return isBug;
}

    public String toString(){

        return name+" - "+employeeID+" - "+salary+" - "+companyName;
    }

    public static void main(String[] args) {

        SDET worker =new SDET(); // i created this, bec.Sdet is an instance

        worker.setInfo("Ceren",12345, 150000, "abc");
        worker.testing("both manual and automation");
        worker.creatingTicket(false);
    }


}

//    Employee name: Ceren, employeeID:= 12345, employee salary: 150000 and employee works at: abc
//        Worker is doing both manual and automation testing
//        no bug
//
//        Process finished with exit code 0
