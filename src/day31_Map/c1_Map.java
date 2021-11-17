package day31_Map;

import myMethods.myLibraryMethods;

import java.util.LinkedHashMap;
import java.util.Map;

public class c1_Map {
    //Data Structure :
    //    Array (fixed, primitives & objects)
    //    Collection (dynamic, only objects)
    //    Map (dynamic, only objects)


    //Map Interface: accepts key and value. cannot be primitives.
    //                key MUST be unique
    //Map methods:
    //    put(key, value): inserts key and value to map
    //    get(key): returns the value of the given key
    //    remove(key): removes the given key and it's value from the map
    //    size():
    //    containsKey(key): checks if the key is contained in the map. boolean
    //    containsValue(Value): checks if the value is contained in the map. boolean
    //    clear(): clears everything
    //    isEmpty(): boolean
    //    keySet(): returns all the keys from the map as Set
    //    values(): returns all the values from the map as Collection
    //    setEntry():

    // HashMap: does not keep the insertion order
    //         accepts null
    // HashTable: is synchronized, thread-safe ==> one thread at a time
    //             slower
    //             does not accept null
    // LinkedHashMap: keeps the insertion order as it's.
    //             put & remove are faster
    //             accepts null
    // TreeMap: sorts the keys in ascending (sorted map)
    //         does not accept null

    public static void main(String[] args) {


        Map<String,Integer> studentInfo=new LinkedHashMap<>();
        //key :will be String that we will use for student names
        //key has to be unique

        //value : will be Integer and we will use for student numbers
        //only accepts object types

        //    put(key, value): inserts key and value to map
        studentInfo.put("Sercan",125); //key yani buradaki durumuyla isimler unique olmali, value dublicate olabilir ondan sorun yok
        studentInfo.put("Sercan",20);//burada ayni isimle yine key girdiginde 2.gordugunu alir.yani "Sercan",125 run etmez
        studentInfo.put("Triska" ,125);
        //boyle ayri ayri yazariz ama iksini tek bir map icinde verir


        System.out.println(studentInfo);

        System.out.println("studentInfo.size() = " + studentInfo.size());//3 //direkt yukarida kac deger varsa onun size'ini verir

        //    get(key): returns the value of the given key
        //key'i girdiginde sana value olarak verir
        System.out.println("studentInfo.get(\"Sercan\") = " + studentInfo.get("Sercan"));//125

        //    remove(key): removes the given key and it's value from the map

        studentInfo.remove("Sercan");//sercan cikar sadece triska kalir
        System.out.println(studentInfo);

        myLibraryMethods.stars();

        //if you want to use map you will need to have 2 parameters
        //first one will be key and has to be unnique
        //second one will be value and this can be dublicate

        //LinkedHashMap<String , double> // map only accept objects(Integer, Double,Byte vs.) not primitives (int, double)
        LinkedHashMap<String , Double> studentAges=new LinkedHashMap<>();
        //add new members
        studentAges.put("Ozge", 25.5);
        studentAges.put("Musab",35.5);
        studentAges.put("bahast",11.2);
        studentAges.put("Esther",22.2);
        studentAges.put("Esther",18.0);
        studentAges.put("Ozer",18.0);

        System.out.println(studentAges);
        System.out.println("studentAges.get(\"Musab\") = " + studentAges.get("Musab")); //35.5
        System.out.println("studentAges.get(11.2) = " + studentAges.get(11.2));//null niye cunku get sadece key kabul eder

        //get method will only accept key
        //and if key is present in your map you will see the value of the key
        //if key is not presnet in your map result will be null


        //    containsKey(key): checks if the key is contained in the map. boolean
        //    containsValue(Value): checks if the value is contained in the map. boolean

        boolean b1=studentAges.containsKey("bah");//false
        boolean b2=studentAges.containsKey("Bahast"); //false //upper case diye
        boolean b3=studentAges.containsKey("bahast"); //true
        boolean b4=studentAges.containsValue(18.0); //true
        boolean b5=studentAges.containsValue("Ozge"); //false cunku bizde value olarak ozge yok key olarak var

        System.out.println("B1" + b1 + " B2 " + b2 + " B3 "+b3);
        System.out.println(b4 + "/" + b5);


        //    clear(): clears everything
        //    isEmpty(): boolean

        System.out.println("studentAges = " + studentAges);
        System.out.println("studentAges.isEmpty() = " + studentAges.isEmpty());

        studentAges.clear(); //clear all list
        System.out.println("studentAges = " + studentAges); //{} null yapmaz empty yapar cunku null objecttir ama gecersiz demektir
        System.out.println("studentAges.isEmpty() = " + studentAges.isEmpty());//true

    }
}