package day23_Constroctors;

public class Student {

    //id //grade//name

    String name; //inst
    int id;
    static String schoolName;//static    //niye static kullandik cunku okul ismi degismeyecek ama fark etmez instance de kullanabilirsin
    // sadece staticte degisim olmadigi icin static kullandik

    static int countNumbers=0;  //her defasinda assign yapmamak icin static atatdik

    public void setStudentInfo(String name ){
        this.name=name;
        id = setStudentNumber(); //bunu nasil kullanabildik cunku setStudentInfo'nun icine String name gibi eklemedik
        // boylelikle harici olarak yazabildik
        //boylelikle countnumber yukseldikce id de yukseleyecek cunku ona assign yaptik
        //zaten countnumber da int, id de int
    }

    //create a function that will set student number for any new students
    public static int setStudentNumber(){
        countNumbers++;
        return countNumbers; //bu yukselikce id de yuklsecek peki nasil cunku id'ye setStudentNumbe atadik
    }

    public static void setSchoolName(String school){
        schoolName=school;

    }

    public void getInfo(){
        //you can create your method static or instance
        //but if you make static method and if you are going to use instance varible
        //we will need to create object
        //that's why we prefer this method as an instance so i can use static (global) or instance variable
        System.out.println("Name :" + name);
        System.out.println("Number : "+id);
        System.out.println("School : "+schoolName);
    }



}