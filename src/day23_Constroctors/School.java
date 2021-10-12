package day23_Constroctors;


import java.util.ArrayList;
import java.util.Arrays;

public class School {

//
//                    create a class called school:
//                    create 3 objects of student and set their info
//                    create a  ArrayList of students to store all student objects
//                    use for each loop to print out each students' name and studentID


    int age;
    String name;
    String clas;

    //create a method that will set all information for animal objects in one line
    public void setStudentInfo(String name,int age , String clas ){


        this.age=age;
        this.name=name;
        this.clas=clas;
        System.out.println("Name: " +name+ " , Age: "+ age+ ", Class: "+ clas);
    }


    //to print our objets we will need to create a toString method
    public String toString(){
        return name  + " - "+ age +  "-" + clas;
    }


    public static void main(String[] args) {
       School student1=new School();


        student1.setStudentInfo("Ali",15,"10-B");


        // ............     yeni isim vermek icin yeniden object olusturduk ..............  //


        School student2=new School();
        student2.setStudentInfo("Ronahi",17,"11-B");
        System.out.println(student2);

        School student3=new School();
        student3.setStudentInfo("Ozge",16,"11-C");
        System.out.println(student3);

        //store animal object in the arraylist
        //data type of arraylist will be animal objects

        ArrayList<School> studentList=new ArrayList<>();
        studentList.addAll(Arrays.asList(student1,student2,student3));
        System.out.println(studentList);

        System.out.println(".............");


        for (School each :studentList){   ///NEDEN  FOR EACH LOOP ANIMALS ALDI CUNKU O SENIN OBJECTIN YANI DATA TYPE IN LIKE int., string gibi


            System.out.println(each);      // if we dont have tostring, it gives hashcode

        }

    }



}
//Name: Ali , Age: 15, Class: 10-B
//        Name: Ronahi , Age: 17, Class: 11-B
//        Ronahi - 17-11-B
//        Name: Ozge , Age: 16, Class: 11-C
//        Ozge - 16-11-C
//        [Ali - 15-10-B, Ronahi - 17-11-B, Ozge - 16-11-C]
//        .............
//        Ali - 15-10-B
//        Ronahi - 17-11-B
//        Ozge - 16-11-C
//
//        Process finished with exit code 0