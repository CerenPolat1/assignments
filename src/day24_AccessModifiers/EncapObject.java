package day24_AccessModifiers;

public class EncapObject {

    //interview'da kesin sorarlar
    // eger bu konuyu cok iyi anlarsan ve interview'da cok iyi cevaplarsan sana code bile sormayabilirler
    //cunku bu konulari genelde testerlar bilmazmis ve bilenler genelde medium or seniorlar olurmus


    public static void main(String[] args) {
        EncapsulationIntro obj1=new EncapsulationIntro();
        //obj1.name="Mesut";// name is not accessible because it is private
        obj1.setName("Mesut");
        //obj1.age  // i cant call it because it is private

        obj1.setAge(25);  //private i nasil kullandik?? EncapsulationIntro'da  set ve get kullanarak yaptik
        obj1.setIdNum(1231231234);

        System.out.println(obj1.getAge());
        System.out.println(obj1.getIdNum());
        System.out.println(obj1.getName());
        // System.out.println(obj1.name);  //// i cant call it because it is private
    }
}