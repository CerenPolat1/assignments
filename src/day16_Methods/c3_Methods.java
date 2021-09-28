package day16_Methods;
public class c3_Methods {
    public static void main(String[] args) {
        printJava10();
        hello(); // bunu 3 defa girdigin icin 3 kere yazilacak run'da
        hello();
        evenNumbers100();
        hello();
        evenNumbers(200);
    }
//yukariya koyduklarinin sirasi fark eder, sen ilk helloyu yazmis olsan bile
// en uste printJava10 yazdigin icin onu isler


    //decleration of the method
    // public               static           void               main        (String [] args){
    // Access-modifer       specifier        return-type        methodName  (paramater)
    //statments ,code
    //}

    //Access-Modifer =public, protected ,default ,priavate
    //specifier   : static ,final ,abstract ,synchronized
    //return type : void , any datatype(int,string,char , int [] .......)
    //some method has paramertes some dont have parameter


    //why we create new method?
    //tecnically, you dont have to create a method bec. you can handle everything in main method
    //methods specify what is the function of method. you can call this method
    //instead of each time typing main method, you can prefer to call that function that you created

    //what is the benefit of creating method?
    //istead of typing everything in main method, you can cereate and store some in your method


    //diyelim surekli kullandigin bazi seyler var mesela odevleri bolmekte kullandigin yildiz, nokta gibi kaliplar
    //belki calisirken surekli kullanman gerecek bazi methodlar olacak
    // bunlari src nin altinda package olusturarak toplayabilirsin, sonra ihtiyacin oldugunda oradan cagirabilirsin.
    //

    public static void hello(){//function of this method is to print hello
        System.out.println("Hello"); //run'da basta  gorunmedi cunku main method icinde degildi.
                       // gorunmesi icin main methodda belirtilmesi lazim yukaridaki gibi
                        //bunun icine s prinltn("ceren") yazarsan yine okur
    }

    //create a method that will print java 10 times:
    public static void printJava10(){
        for (int i =1 ; i <= 10 ; i++){
            System.out.println("Java");
        }
    }

    //create a method that will print even numbers between 1-100
    //name this method evenNumbers100
    public static  void evenNumbers100(){  //  sen bunun icine deger verip de yaptiginda ending pointinde degisiklik olur
                    //evenNumbers100(int endpoint) yaptiginda i<101 yerine i<endpoint yazarsin,
        // yukarinin icine de deger verirsin o senin ending pointini belirler
        //1 -100
        // 2 4  6 8 10 ...94 96 98 100
        for (int i =2 ; i<101 ; i +=2){
            System.out.print(i + " ");
        }
        System.out.println();

    }


    //// void method (without parameters)
    //    // void method (with parameters)\
    //    // return method (without parameters)
    //    // return method (with parameters)

    //you can use above methods with different access modifier and specifier

    //create a method that will print even numbers between 1-100
//name this method evenNumbers100
    public static  void evenNumbers(int endpoint){
        //1 -100
        // 2 4  6 8 10 ...94 96 98 100
        for (int i =2 ; i<endpoint ; i +=2){
            System.out.print(i + " ");
        }
        System.out.println();

    }

}