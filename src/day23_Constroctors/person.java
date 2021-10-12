package day23_Constroctors;
import java.util.ArrayList;
public class person {

    //Task Person:
//        create a class called Person
//                attributes:  name, age, gender
//                methods: eat, walk, sleep, setPersonInfo


    String name;
    String gender;
    int age;


    public void eat(String name, String gender, int age){

        this.name=name;
        this.gender=gender;
        this.age=age;

        System.out.println("Person who " +age+ " year old  " +gender+ " is "+ name+ " eats only vegetables");
    }


    public void walk (String name, String gender, int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
        System.out.println("Person who " +age+ " year old  " +gender+ " is "+ name+ " goes for a walk everyday");
    }

    public void sleep (String name, String gender, int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
        System.out.println("Person who " +age+ " year old  " +gender+ " is "+ name+ " sleeps very well everyday");
    }

    public void setInfo(String name, String gender, int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
        System.out.println("Person who " +age+ " year old  " +gender+ " is "+ name+ " goes for a walk everyday");
    }

    public String toString(){
        return name+ "-"+gender+ "- $ "+age;
    }


    public static void main(String[] args) {
        person human= new person();

       human.walk("Ebru","woman",26);
       human.sleep("Ebru","woman", 26);
       human.setInfo("Ebru","woman", 26);
       human.eat("Ebru","woman", 26);


        System.out.println("....................");

        Employee worker= new Employee();
        worker.setEmployeeInfo("Ebru",26,"women",100000, 1234,"Civil Servant");

       ArrayList<Employee> ebrem= new ArrayList<>();
       ebrem.add(worker);

        System.out.println("....................");

        student tired=new student();
        tired.attendclass("Deniz",123,"A-1");
        tired.setStudentInfo("Deniz","man",27,"A-1",123);

        ArrayList<student> frustrate= new ArrayList<>();
        frustrate.add(tired);
        System.out.println(frustrate);

    }

    static class Employee{

//        create a class called Employee
//                attributes: name, age, gender, Salary, employeeID, jobTitle
//                methods: setEmployeeInfo, toString
//

        String name;
        int age;
        String gender;
        double salary;
        int employeeID;
        String jobTitle;

        public void setEmployeeInfo (String name,int age, String gender,double salary,int employeeID,String jobTitle){

            this.name=name;
            this.age=age;
            this.gender=gender;
            this.salary=salary;
            this.employeeID=employeeID;
            this.jobTitle=jobTitle;

            System.out.println("Person who works in " + jobTitle+ " is  "+ age+ " year old  " +gender+ " and get $"+ salary+ " and her employeeID is "+employeeID);

        }


        public String toString(){
            return name+ "-" +gender+ "-"+jobTitle;
        }

    }

    static class student{

//        create a class called Student
//                attributes: name, age, gender, studentID, classes
//                methods: attendClass, setStudentInfo, toString

        String name;
        int age;
        String gender;
        int studentID;
        String Classes;

        public void attendclass( String name,int studentID,String Classes){

            this.name=name;
            this.studentID=studentID;
            this.Classes=Classes;

            System.out.println("Student "+name+ "-"+ " student ID: " +studentID+"-"+ " attends class everyday.");


        }


        public void setStudentInfo (String name,String gender, int age,String Classes,int studentID){

            this.name=name;
            this.gender=gender;
            this.age=age;
            this.studentID=studentID;
            this.Classes=Classes;

            System.out.println("Student info: "+ name+ " ,"+ gender+" ,"+ age+ " , student ID: " + studentID+ " , Class: "+ Classes);

        }

        public String toString(){

            return name+ "-" + studentID+ "-"+Classes;
        }
    }


}

//        Person who 26 year old  woman is Ebru goes for a walk everyday
//        Person who 26 year old  woman is Ebru sleeps very well everyday
//        Person who 26 year old  woman is Ebru goes for a walk everyday
//        Person who 26 year old  woman is Ebru eats only vegetables
//        ....................
//        Person who works in Civil Servant is  26 year old  women and get $100000.0 and her employeeID is 1234
//        ....................
//        Student Deniz- student ID: 123- attends class everyday.
//        Student info: Deniz ,man ,27 , student ID: 123 , Class: A-1
//        [Deniz-123-A-1]
//
//        Process finished with exit code 0
