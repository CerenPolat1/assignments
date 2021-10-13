package day24_AccessModifiers;

public class Person {

    //name , id  ,age
    //

    public String name;  //bunlar variable, method gibi dusunme sadece belirtiyoruz bu public variable, bu private variable diye
    private long ID ;  //encapsulatin 1. part
    private int age; //encapsulatin 1. part


    public Person(String name){     //bu Constructor nereden anladik cunku class'in ismiyle ayni, neden yarattik peki
        this.name=name;
    }

//    public void nameal (String name){   // contructor yerine bunu da yaratabilirdin
//        this.name=name;
//
//    }

    //encapsulation
    //1.to hide data from outside  making variables private
    //2.Provide public setter and getter methods to modify and view the variables values.

    public void setIDAndAge(int age, long ID){  //bunlari coklu da icine yazip set yapabilirsin fark etmez
        //setid
        //setage

        this.ID=ID;
        this.age=age;
    }


    // set ve get olusturuyoruz eger ID ve age sectiysen bunlarin ikisi icin de get ve set yaratiyorsun
    //get ve set kalip sadece set ve get ile elinde ne varsa ismini birlestiriyorsun

    //set yapmak icin parameter'li method kullaniyorsun

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //get yapmak icin return method kullaniyorsun

    public long getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }
//////////////////


    public String getName() {
        return name;
    }


    ///bu hemen usttekini neden tek olusturdum once generate' getting dedim
    // class icindeki diger ikisi(ID ve age) zaten alindigi icin var olani get yaptim
    //suanda get yapilacak hic kalmadigindan generate getter dedigimde no found diyo cunku hepsini kullandim



    ///////////////////
    @Override                     //generate'ten tostring secilerek yapildi
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                '}';
    }

    private void test1(){
        System.out.println("private test");
    }

    public void test2(){
        System.out.println("test2");
        test1();                      //how did i write test1 bec.ist is private.. BECAUSE 2 OF THEM ARE IN THE SAME CLASS
    }
}

// ..........shortcut........
/*
class'in icinde sag click yap generate' i tikla ve sana bir suru option sunacak kisa yoldan bunlari kullanabilirsin
 */