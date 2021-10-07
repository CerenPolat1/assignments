package day21_CustomClasses;

import myMethods.myLibraryMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class c2_CollectionsExtra {
    //collectrion sadece arraylisttype (String,Double,Integar ,Boolean)  ile calisir

    ///All of those collections method will work any arraylisttype String,Double,Integar ,Boolean ....
    // Collections Class:
    //
    //        sort(CollectionType): this will sort any given collectionType
    //
    //        frequency(CollectionType, Object): this will return the frequency of the given object
    //        from the given collectionType
    //
    //        max(CollectionType): this will return the biggest object from collectiontype
    //
    //        min(CollectionType): this will return the smallest object from collectiontype
    //
    //        swap(CollectionType, index1, index3): this will swap the index1 and index 3
    //
    //        replaceAll(CollectionType, oldData, newData):

    public static void main(String[] args) {
        int [] arr = {1,2,34,5,610,100};
        //for ()
        Integer number=arr[0]; //this is casting
        //max bulmak icin yukaridakini de kullanabilirsin ama alttaki cok kisa.

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(4,5,1,2,3,10,400,-25,1000));

        //        max(CollectionType): this will return the biggest object from collectiontype

        System.out.println(Collections.max(numbers)); // 1000

        //        min(CollectionType): this will return the smallest object from collectiontype

        System.out.println("Collections.min(numbers) = " + Collections.min(numbers)); //-25


        //second max number from this list
        Integer maxNumber=Collections.max(numbers);
        System.out.println("maxNumber = " + maxNumber);
        numbers.remove(maxNumber);   ///burada 1000 i cikardi ve yenisi otomatikmen 400 oldu.
        Integer secondMAx=Collections.max(numbers);
        System.out.println("secondMAx = " + secondMAx);


        //        swap(CollectionType, index1, index3): this will swap the index1 and index 3
        //swap --> degis tokus demek

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(100,10,55,35 ,10 ,10 ,10));

        //System.out.println("******************");
        myLibraryMethods.stars(); //yukaridakini yazmak yerine once method olusturduk myMethods icine daha sonra cagirdik
        System.out.println(list2);

        Collections.swap(list2,0,2);  // [55,10,100,35...]
        System.out.println(list2);

        //    //        replaceAll(CollectionType, oldData, newData):

        Collections.replaceAll(list2 , 10 ,20);      //once arraylistini yaziyosun(list2) daha sonra replace yapacaklarini
        System.out.println(list2);  //(100,10,55,35 ,10 ,10 ,10) buradaki tum 10'lari 20 yapti: [55, 20, 100, 35, 20, 20, 20]
    }
}