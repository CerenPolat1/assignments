package day26_owerwriting;




//    //method overriding: same method name, same parameter, same return-type  (MUST)
////				   MUST happen in the sub class
////				   access modifer MUST be same or more visible(private, public etc.)
////				   ONLY the instance methods can be overridden
////				   @Override annotation MUST be applicable

//   *********** overriding olmasi icin su kurallar lazim: ****************
// 1-her seyiyle birebir ayni methodlar olmali (same method name, same parameter, same return-type)
// 2-methodlardan biri sub class olmali yani biri parent'da biri child classda olmali
// 3- sadece instance method overriden olabilir
// 4-override annotation methodta yer almali



class test5{
    int number ;
    public void method2(){
        System.out.println("Method 2");
    }

    static{  //static block only works inside a class

    }
}

//overloading olmasi icin ayni medhodlarin farkli parameterlari olmasiyla olur

public class c4_MethodOverriding extends test5{
    //after extending method2 will be inherited


    //overloading means same method name with different loads:

    public void method1(int number){

    }

    public void method1(String str){

    }

    //you cant create same method in the same class for overriding
    //eger overriding'i kullanmak istersen exdend olmalai yani parent "test5" classtan eslesirse overriding yapabilirsin, tag yapiyorsun

    // !!!!!!!object= class name+hashcode, bu yuzden hashcode gordugunde class ismini de goruyorsun

    @Override // bunun icin ayni isimli method olmali biri parent'da biri child'da olmali ki overriding olsun
    public void method2(){
        System.out.println("owerwrite method2 bec this class and parent class have same ");
    } // parent'dakini cagirip overriding ile bu methodun icini dolduruyoruz, guncelliyoruz ama degismek zorunda da degiliz
    //overriding yaptigimizda icine ne koyarsask sistem onualir, aksi halde bos birakir

    public void hello(String str,String str2){

    }

    public static void main(String[] args) {

        c4_MethodOverriding obj = new c4_MethodOverriding();
        obj.method2();  //eger override'li  method olmasaydi sadece parent'daki "method2"yu gorecektik
        // ama overriding olunca java olunca onu secer, o yuzden run'da owerwrite method2 bec this class and prent class have same dorduk
    }
}


//why we need overriding: to implement different functions to the same method
//				reusable
//				flexible
//              easy to memorize
//				less memory----most important thing , her class icin yeni bir  tostring olusturdugunu dusun vok
//				               fazla sayida bu methodtan olacak ve memory'de cok yer kaplayacak
//				easy to memorize