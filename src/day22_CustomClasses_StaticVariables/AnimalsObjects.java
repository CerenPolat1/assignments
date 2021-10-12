
package day22_CustomClasses_StaticVariables;


import myMethods.myLibraryMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalsObjects {

    public static void main(String[] args) {
        Animals animal1=new Animals();
        System.out.println(animal1.type);//null, because i didnt assign animal1

        //animal1.type="cat"; //instead  of calling each variable, i can just call set method to set all variables
        animal1.setAnimalInfo("cat",10,"black","cat1");
        System.out.println(animal1.type);//instead of null, it gives "cat" because we used tostring

        System.out.println("///////");

        animal1.eating("bread");
        animal1.eating("fish");

        System.out.println("......//....");


               // ............     yeni hayvan ismi vermek icin yeniden object olusturduk ..............  //


        Animals animal2=new Animals();
        animal2.setAnimalInfo("bird",3,"blue","bird1");
        System.out.println(animal2);

        Animals animal3=new Animals();
        animal3.setAnimalInfo("dog",5,"Black","dog1");
        System.out.println(animal3);

        //store animal object in the arraylist
        //data type of arraylist will be animal objects

        ArrayList<Animals> animalList=new ArrayList<>();
        animalList.addAll(Arrays.asList(animal1,animal2,animal3));
        System.out.println(animalList);

        System.out.println(".............");

        String food1="banana";
        for (Animals each :animalList){   ///NEDEN  FOR EACH LOOP ANIMALS ALDI CUNKU O SENIN OBJECTIN YANI DATA TYPE IN LIKE int., string gibi



            System.out.println(each.name);

            System.out.println(each);      // if we dont have tostring, it gives hashcode
            each.eating(food1);
        }

    }
}