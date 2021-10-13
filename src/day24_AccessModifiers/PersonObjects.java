package day24_AccessModifiers;

public class PersonObjects {

    public static void main(String[] args) {
        Person person1=new Person("Deniz");  //neden parantez ici name istedi cunku bunu yarattigimizda person class'inda kendiliginden constructor olustu

        //person1.nameal("deniz");                  // ve biz daha onceden herhangi bir method olusturmadik name'i execute etmek icin o yuzden constructor olustu
                                                   //construstor yerine clasic yoldan gidip method olusturup da burada objetin ardindan cagirabilirdin

        System.out.println("person1.name = " + person1.name); //public oldugundan yaratabildik

        //person1.age=25 ;  //private
        person1.setAge(25);
        System.out.println("Suphi age is " + person1.getAge());

        Person person2=new Person("Meral");

        person2.setID(32423423442234l);  //icinde l yazarak belirttik bun long diye
        System.out.println("Meral id is " + person2.getID());
    }
}