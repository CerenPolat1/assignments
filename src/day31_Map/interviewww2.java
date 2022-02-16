package day31_Map;
import java.util.*;
import java.util.stream.Collectors;
public class interviewww2 {





        /*
         * Main, executable method
         * THIS METHOD SHOULD PRINT ALL EXPECTED OUTPUT
         * @param   args
         * @param testStrings
         * @return
         */
        public static ArrayList<String> name(List<String> testStrings){
            List<String> names= new ArrayList<>();
            for (String each:names){
                if (each.contains((CharSequence) names)){
                    names.add(each);
                }

            }
            return new ArrayList<String>(names);
        }
        public static void main(String args[]) {
            String[] testStrings = { "Bernard", "Charlie", "Angie", "Andy", "Bertha","Connie", "Annie", "Carl", "Dennis", "Caroline", "Bob", "Betty", "Bart", "Albert" };
            List<String> list=new ArrayList<>(Arrays.asList(testStrings));
            System.out.println("Let's begin...");


            System.out.println(list);
            System.out.println(list.stream().sorted().collect(Collectors.toList()));

            Set<String> new1=new TreeSet<>();
            Set<String> new2=new TreeSet<>();
            Set<String> new3=new TreeSet<>();

            for (String each:list){
                if (each.startsWith("A")&&(each.length()>4)){
                    System.out.println(each);
                    new1.add(each);
                }
            }
            for (String each:list){
                if (each.startsWith("B")&&(each.length()>3)) {
                    System.out.println(each);
                    new2.add(each);
                }
            }
            for (String each:list){
                if (each.startsWith("C")&&(each.length()>5)) {
                    System.out.println(each);
                    new3.add(each);
                }
            }


        }

        // YOU CAN ADD MORE PRIVATE METHODS HERE, IF NEEDED!

    }

/**
 * EXPECTED OUTPUT WHEN MAIN IS EXECUTED:
 * ======================================
 * Original collection: [Bernard, Charlie, Angie, Andy, Bertha, Annie, Carl, Connie, Caroline, Bob, Betty, Bart, Albert]
 * Sorted & filtered names with A larger than 4 characters: [Albert, Angie, Annie]
 * Sorted & filtered names with B equal or larger than 3 characters: [Bart, Bernard, Bertha, Betty, Bob]
 * Sorted & filtered names with C equal or larger than 5 characters: [Caroline, Charlie, Connie]
 */
